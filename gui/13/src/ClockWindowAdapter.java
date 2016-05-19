package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClockWindowAdapter extends WindowAdapter implements ActionListener{

	@Override
	public void windowClosing(WindowEvent e)  {
        System.exit(0);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
