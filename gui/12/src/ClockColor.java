package src;

import java.awt.Color;

public class ClockColor {
	String name;
	Color color;
	static final String BLACK = "黒";
	static final String BLUE = "青";
	static final String CYAN = "シアン";
	static final String DARK_GRAY = "ダークグレー";
	static final String GREEN = "緑";
	static final String LIGHT_GRAY = "ライトグレー";
	static final String MAGENTA = "マゼンタ";
	static final String ORANGE = "オレンジ";
	static final String PINK = "ピンク";
	static final String RED = "赤";
	static final String WHITE = "白";
	static final String YELLW = "黄色";

	public ClockColor(String name, Color color){
		this.name = name;
		this.color = color;
	}

	public String getName(){
		return name;
	}

	public Color getColor(){
		return color;
	}

}
