package src;

public class ThirdWalkman extends SecondWalkman {

	public void communicate(){
		if(getTerminal() == true && getTerminal2()== true){
			System.out.println("communicate");
		}
	}
}
