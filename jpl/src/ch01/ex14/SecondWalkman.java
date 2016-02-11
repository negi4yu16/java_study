package src;

public class SecondWalkman extends Walkman {
	private boolean terminal2;/*端子2(true:接続中/false:未接続)*/

	public SecondWalkman(){
		this.terminal2 = false;
	}
	public boolean getTerminal2(){
		return this.terminal2;
	}
	public void setTerminal2(boolean terminal){
		this.terminal2 = terminal;
	}
}
