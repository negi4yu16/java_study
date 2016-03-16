package src.ch05.ex02;

import java.util.ArrayList;

public class BankAccount {

	private long number;
	private long balance;
	private Action lastAct;
	private History history = new History();

	public class Action{
		private String act;
		private long amount;

		Action(String act, long amount){
			this.act = act;
			this.amount = amount;
		}
		public String toString(){
			return number + ": " + act + " " + amount;
		}
	}
	public class History{
		private final int MAX_HISTORY = 10;
		private final int LATEST_HISTORY = 0;
		private int index = LATEST_HISTORY;
		private ArrayList<Action> actions = new ArrayList<Action>();

		public Action next(){
			if(index >= actions.size() ){
				index = LATEST_HISTORY;
				return null;
			} else {
				int tmp_index = index++;
				return actions.get(tmp_index);
			}
		}
		public void addAction(Action action){
			if(actions.size() >= MAX_HISTORY ){
				actions.remove(MAX_HISTORY-1);
			}
			actions.add(LATEST_HISTORY, action);
		}
	}

	public void deposit(long amount){
		balance += amount;
		lastAct = new Action("deposit", amount);
		history.addAction(lastAct);
	}
	public void withdraw(long amount){
		balance -= amount;
		lastAct = new Action("withdraw", amount);
		history.addAction(lastAct);
	}
	public History history(){
		return history;
	}

	public void showHistory(){
		BankAccount.History history = history();
		BankAccount.Action action;
		int index = 1;
		while((action = history.next()) != null ){
			System.out.println("[Latest"+ (index++) + "]" + action.toString());
		}
	}
}
