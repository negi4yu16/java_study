package src.ch06.ex04;

public enum Signal {
	BLUE("BLUE"),
	YELLOW("YELLOW"),
	RED("RED");

	private Color color;

	private Signal(String color){
		this.color = new Color(color);
	}

	public Color getColor(){
		return this.color;
	}


}
