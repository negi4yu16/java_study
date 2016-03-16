package src;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ClockFrame extends Frame implements Runnable {
	private Graphics g;
	static private Clock clock;
	static private Thread th;
	public ClockFrame(String title) {

		/* インスタンスを生成 */
		clock = new Clock();
		th = new Thread(this);

		/* Frameの情報を設定 */
		this.setSize(300, 200);
		this.setVisible(true);
		this.setTitle(title);

		/* 「×」押下時の処理 */
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)  {
                System.exit(0);
            }
       });

		repaint();
	}

    @Override
	public void paint(Graphics g){
		super.paint(g);
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN , 20);
		g.setFont(font);
		g.drawString(clock.toString(), 30, 100);
    }

    public void run(){

    	while(true){
    		repaint();
    		try{
    			Thread.sleep(1000);  //スリープ１秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    public static void main(String args[]) {
    	ClockFrame frm = new ClockFrame("Degital Clock");
    	th.start();
    }
}
