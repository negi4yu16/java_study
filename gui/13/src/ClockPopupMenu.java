package src;

import java.awt.Component;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ClockPopupMenu implements ItemListener, ActionListener{

	private ClockWindow window;
	private PopupMenu menu;
	//1.	フォントの指定
	private Menu menuFont;
	private final String fontLabelString = "フォント";
	//2.	フォントサイズの指定
	private Menu menuFontSize;
	private final String fontSizeLabelString = "大きさ";
	private final String fontSizeSmall = "小";
	private final String fontSizeMedium = "中";
	private final String fontSizeLarge = "大";
	//3.	文字色の指定
	private Menu menuColor;
	private final String menuColors = "色";
//	private Choice color = new Choice();
	//4.	時計の背景色の指定
	private Menu menuBackgroundColor;
	private final String backgroundColorLabelString = "背景色";
//	private Choice backgroundColor = new Choice();
	//5.	終了
	private Menu menuExit;
	private final String exitLabelString = "終了";

	public ClockPopupMenu(ClockWindow window){
		menu = new PopupMenu();
		this.window = window;

		//フォント
        menuFont = new Menu(fontLabelString);
        MenuItem font1 = new MenuItem(Font.SANS_SERIF);
        MenuItem font2 = new MenuItem(Font.SERIF);
        MenuItem font3 = new MenuItem(Font.DIALOG);
        menuFont.add(font1);
        menuFont.add(font2);
        menuFont.add(font3);
        menu.add(menuFont);
        menuFont.addActionListener(this);
		//フォントサイズ
        menuFontSize = new Menu(fontSizeLabelString);
        MenuItem fontSize1 = new MenuItem(fontSizeSmall);
        MenuItem fontSize2 = new MenuItem(fontSizeMedium);
        MenuItem fontSize3 = new MenuItem(fontSizeLarge);
        menuFontSize.add(fontSize1);
        menuFontSize.add(fontSize2);
        menuFontSize.add(fontSize3);
        menu.add(menuFontSize);
        menuFontSize.addActionListener(this);
		//文字色
        menuColor = new Menu(menuColors);
		ClockColorList list = new ClockColorList();
		ArrayList<ClockColor> colorList = list.getColorList();
        for(ClockColor color : colorList){
        	menuColor.add(new MenuItem(color.getName()));
        }
        menu.add(menuColor);
        menuColor.addActionListener(this);
        //背景色
        menuBackgroundColor = new Menu(backgroundColorLabelString);
        for(ClockColor color : colorList){
        	menuBackgroundColor.add(new MenuItem(color.getName()));
        }
        menu.add(menuBackgroundColor);
        menuBackgroundColor.addActionListener(this);
		//Exit
        menuExit = new Menu(exitLabelString);
        MenuItem exit = new MenuItem(exitLabelString);
        menuExit.add(exit);
        menu.add(menuExit);
		menuExit.addActionListener(this);

        /* ポップアップメニューを登録する */
        menu.add(menu);

	}

	public void show(Component e, int x, int y){
		menu.show(e , x , y);
	}

	public PopupMenu getPopupMenu(){
		return this.menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		ClockSetting instance = ClockSetting.getInstance();
		if(menuFont == e.getSource()){
			System.out.println("[Font]"+e.getActionCommand());
			instance.setFont(e.getActionCommand());

		} else if(menuFontSize == e.getSource()){
			System.out.println("[FontSize]"+e.getActionCommand());
			setFontSize(e.getActionCommand());

		} else if(menuColor == e.getSource()){
			System.out.println("[Color]"+e.getActionCommand());
			setClockColor(e.getActionCommand());

		} else if(menuBackgroundColor == e.getSource()){
			System.out.println("[Background]"+e.getActionCommand());
			setBackgroundColor(e.getActionCommand());
		}else if(menuExit == e.getSource()){
	        System.exit(0);
		}
		window.setVisible(true);
		window.reflectSettings();

	}

	private void setFontSize(String selected){
		ClockSetting instance = ClockSetting.getInstance();
		switch(selected){
		case fontSizeSmall:
			instance.setFontSize(ClockSetting.SMALL_FONT_SIZE);
			break;
		case fontSizeMedium:
			instance.setFontSize(ClockSetting.MEDIUM_FONT_SIZE);
			break;
		case fontSizeLarge:
		default:
			instance.setFontSize(ClockSetting.LARGE_FONT_SIZE);
			break;
		}
	}
	private void setClockColor(String selected){

		ClockSetting instance = ClockSetting.getInstance();
		ClockColor color = ClockColorList.getClockColor(selected);
		if(color != null){
			instance.setColor(color);
		}else {
			instance.setColor(ClockColorList.getClockColor(ClockColor.BLACK));
		}
	}
	private void setBackgroundColor(String selected){

		ClockSetting instance = ClockSetting.getInstance();
		ClockColor color = ClockColorList.getClockColor(selected);
		if(color != null){
			instance.setBackgroundColor(color);
		}else {
			instance.setBackgroundColor(ClockColorList.getClockColor(ClockColor.WHITE));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
