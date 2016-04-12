package src;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockMenuBar extends MenuBar implements ActionListener{

	private Menu menu;
	private final String menuString = "メニュー";
	private MenuItem menuProperty;
	private final String menuPropertyString = "プロパティ";
	private MenuItem menuExit;
	private final String menuExitString = "終了";
	private ClockPropertyDialog dialog;

	public ClockMenuBar(Frame flm){
//		menuProperty = new Menu("Menu");
		Menu menu = add(new Menu(menuString));
		menuProperty = menu.add(new MenuItem(menuPropertyString));
		menuProperty.addActionListener(this);
		menuExit = menu.add(new MenuItem(menuExitString));
		menuExit.addActionListener(this);

		dialog = new ClockPropertyDialog(flm);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		switch(e.getActionCommand()){
		case menuPropertyString:
			dialog.setVisible(true);
			break;
		case menuExitString:
			System.exit(0);
			break;
		default:
			break;
		}
	}


}
