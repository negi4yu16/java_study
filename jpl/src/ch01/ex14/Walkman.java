package src;

public class Walkman {
	private boolean terminal;	/*端子(true:接続中/false:未接続)*/
	private boolean tape;		/*テープ(true:セット/false：未セット)*/

	public Walkman(){
		this.terminal = false;
		this.tape = false;
	}

	public boolean getTerminal(){
		return this.terminal;
	}

	public void setTerminal(boolean terminal){
		this.terminal = terminal;
	}

	public void setTape(boolean tape){
		this.tape = tape;
	}

	public boolean getTape(){
		return this.tape;
	}

	public void startMusic(){
		if(getTape() == true){
			System.out.println("start music");
		}
	}

	public void stopMusic(){
		System.out.println("stop music");
	}
}
