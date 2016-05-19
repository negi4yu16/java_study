package src;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class ClockFrame extends Frame implements Runnable {

	private Graphics buffer;	//ダブルバッファ
	private	Image back;			//イメージ画像
	private Dimension size;		//ウインドウサイズ
	private Point clockDrawPoint = new Point(0,0);	//時計の表示位置
	private Dimension blancSize= new Dimension(10,10);//ブランクサイズ
	static private Clock clock = new Clock();
	static private Thread th;
	static final int defaultFrameSizeX = 212;
	static final int defaultFrameSizeY = 127;
	static private ClockWindowAdapter adapter;
	static private ClockMenuBar mb;
	private ClockSetting setting;

	public ClockFrame(String title) {

		/* インスタンスを生成 */
		th = new Thread(this);
		setting = ClockSetting.getInstance();


		/* Frameの情報を設定 */
		this.setSize(defaultFrameSizeX, defaultFrameSizeY);
		this.setBackground(setting.getDefaultBackgroundColor().getColor());
		this.setVisible(true);
		this.setTitle(title);

		//Windowイベント処理
		adapter = new ClockWindowAdapter();
		addWindowListener(adapter);

		//メニューバー
		this.setMenuBar(new ClockMenuBar(this));

		//ダブルバッファ用初期化処理
		this.size = this.getSize();
		back = createImage(size.width, size.height);
		buffer = back.getGraphics();

		//表示位置計算
		calcWindowSize();

	    repaint();
	}

	public void reflectSettings(){
		//表示位置計算
		calcWindowSize();
		setSize(size.width, size.height);
		//再描画
		repaint();
	}
    @Override
    public void update(Graphics g){
    	paint(g);
    }

    @Override
	public void paint(Graphics g){
		super.paint(g);

		String currentTime = clock.getCurrentTime();//現在時刻

		back = createImage(size.width, size.height);
		buffer = back.getGraphics();

		//ダブルバッファリング
		//背景描画処理
		buffer.setColor(setting.getBackgroundColor().getColor());
	    buffer.fillRect(0, 0, size.width, size.height);
		System.out.println("[Image]Window高さ"+ size.height + "Winodow幅"+size.width);

	    //時計描画処理
		Font font = new Font(setting.getFont(), Font.PLAIN , setting.getFontSize());
		buffer.setFont(font);
		buffer.setColor(setting.getColor().getColor());
		buffer.drawString(currentTime,clockDrawPoint.x, clockDrawPoint.y);

		g.drawImage(back, 0, 0, this);
    }

    private void calcWindowSize(){
    	//Frameサイズ
		Insets inset = this.getInsets();

		//時計の描画サイズ
		Font font = new Font(setting.getFont(), Font.PLAIN , setting.getFontSize());
		buffer.setFont(font);
		FontMetrics fm = buffer.getFontMetrics();
		String currentTime = clock.getCurrentTime();
	    Rectangle2D rectText = fm.getStringBounds(currentTime,buffer);
		System.out.println("高さ"+ rectText.getHeight() + "幅"+rectText.getWidth());

		//時計の描画位置
		clockDrawPoint.x = inset.left + (int)blancSize.getWidth();
		clockDrawPoint.y = inset.top + (int)rectText.getHeight();

		//ウインドウサイズ
		int x = inset.left + inset.right + (int)rectText.getWidth() + 30;
		int y = inset.top + inset.bottom + (int)rectText.getHeight() + 30;

		System.out.println("[Before]Window高さ"+ size.height + "Winodow幅"+size.width);
		size.setSize(x, y);
		System.out.println("[After]Window高さ"+ size.height + "Winodow幅"+size.width);
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
