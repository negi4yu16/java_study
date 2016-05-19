package src;

import java.awt.Color;
import java.util.ArrayList;

public class ClockColorList {
	static ArrayList<ClockColor> colorlist = new ArrayList<ClockColor>();

	ClockColorList(){
		colorlist.add(new ClockColor(ClockColor.BLACK,Color.BLACK));
		colorlist.add(new ClockColor(ClockColor.BLUE,Color.BLUE));
		colorlist.add(new ClockColor(ClockColor.CYAN,Color.CYAN));
		colorlist.add(new ClockColor(ClockColor.DARK_GRAY,Color.DARK_GRAY));
		colorlist.add(new ClockColor(ClockColor.GREEN,Color.GREEN));
		colorlist.add(new ClockColor(ClockColor.LIGHT_GRAY,Color.LIGHT_GRAY));
		colorlist.add(new ClockColor(ClockColor.MAGENTA,Color.MAGENTA));
		colorlist.add(new ClockColor(ClockColor.ORANGE,Color.ORANGE));
		colorlist.add(new ClockColor(ClockColor.PINK,Color.PINK));
		colorlist.add(new ClockColor(ClockColor.RED,Color.RED));
		colorlist.add(new ClockColor(ClockColor.WHITE,Color.WHITE));
		colorlist.add(new ClockColor(ClockColor.YELLW,Color.YELLOW));
	}

	public ArrayList<ClockColor> getColorList(){
		return colorlist;
	}
	static public ClockColor getClockColor(String name){

		for(ClockColor item : colorlist){
			if(name.equals(item.getName())){
				return item;
			}
		}
		return null;
	}

	public int size(){
		return colorlist.size();
	}
}
