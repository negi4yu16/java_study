package src;

import java.awt.Color;
import java.awt.GraphicsEnvironment;

public class ClockSetting {

	private static ClockSetting instance = new ClockSetting();
	//1.	フォントの指定
	public String font;
	public String defaultFont;
	//2.	フォントサイズの指定
	public int fontSize;
	public int defaultFontSize;
	static public final int SMALL_FONT_SIZE = 50;
	static public final int MEDIUM_FONT_SIZE = 100;
	static public final int LARGE_FONT_SIZE = 200;
	//3.	文字色の指定
	public ClockColor color;
	public ClockColor defaultColor;
	//4.	時計の背景色の指定
	public ClockColor backgroundColor;
	public ClockColor defaultBackgroundColor;

	private ClockSetting(){

		final String fontFamilyNames[] = GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();

		defaultFont = fontFamilyNames[0];
		font = defaultFont;
		fontSize = defaultFontSize = SMALL_FONT_SIZE;
		defaultColor = new ClockColor("黒",Color.BLACK);
		color = defaultColor;
		defaultBackgroundColor = new ClockColor("白",Color.WHITE);
		backgroundColor = defaultBackgroundColor;
	}

	// インスタンス取得メソッド
	public static ClockSetting getInstance() {
		return instance;
	}

	public void reflect(){

	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public String getDefaultFont() {
		return defaultFont;
	}

	public void setDefaultFont(String defaultFont) {
		this.defaultFont = defaultFont;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getDefaultFontSize() {
		return defaultFontSize;
	}

	public void setDefaultFontSize(int defaultFontSize) {
		this.defaultFontSize = defaultFontSize;
	}

	public ClockColor getColor() {
		return color;
	}

	public void setColor(ClockColor color) {
		this.color = color;
	}

	public ClockColor getDefaultColor() {
		return defaultColor;
	}

	public void setDefaultColor(ClockColor defaultColor) {
		this.defaultColor = defaultColor;
	}

	public ClockColor getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(ClockColor backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public ClockColor getDefaultBackgroundColor() {
		return defaultBackgroundColor;
	}

	public void setDefaultBackgroundColor(ClockColor defaultBackgroundColor) {
		this.defaultBackgroundColor = defaultBackgroundColor;
	}

}
