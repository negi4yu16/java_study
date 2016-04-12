package src;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClockPropertyDialog extends Dialog implements ActionListener {

	private ClockFrame owner;

	private final String DialogTitle = "プロパティ";
	//1.	フォントの指定
	private final String fontLabelString = "フォント";
	private Choice font = new Choice();
	//2.	フォントサイズの指定
	private final String fontSizeLabelString = "大きさ";
	private final String fontSizeSmall = "小";
	private final String fontSizeMedium = "中";
	private final String fontSizeLarge = "大";

	private Choice fontSize = new Choice();
	//3.	文字色の指定
	private final String colorLabelString = "色";
	private Choice color = new Choice();
	//4.	時計の背景色の指定
	private final String backgroundColorLabelString = "背景色";
	private Choice backgroundColor = new Choice();

	private final String BTN_OK = "cmd_ok";
	private final String BTN_CANCEL = "cmd_cancel";

	public ClockPropertyDialog(Frame owner) {
        super(owner, true );
        this.owner = (ClockFrame)owner;

        setLayout(new GridLayout(5,2));

        /*フォント生成*/
        Label fontlabel = new Label(fontLabelString);
        add(fontlabel);
        createFontChoice();
        add(font);
        /*フォントサイズ生成*/
        Label fontSizelabel = new Label(fontSizeLabelString);
        add(fontSizelabel);
        createFontSizeChoice();
        add(fontSize);
        /*文字色生成*/
        Label colorlabel = new Label(colorLabelString);
        add(colorlabel);
        createColorChoice();
        add(color);
        /*背景色生成*/
        Label backgroundColorlabel = new Label(backgroundColorLabelString);
        add(backgroundColorlabel);
        createBackgroundColorChoice();
        add(backgroundColor);

        Button b1 = new Button("設定");
        b1.setActionCommand(BTN_OK);
        b1.addActionListener(this);
        add(b1);
        Button b2 = new Button("キャンセル");
        b2.setActionCommand(BTN_CANCEL);
        b2.addActionListener(this);
        add(b2);

        setTitle(DialogTitle);

        //ダイアログサイズの計算(後で修正)
//        Dimension dim = getLayout().preferredLayoutSize(this);
//        Dimension dim = getLayout().minimumLayoutSize(this);
//        System.out.println(dim.getWidth() + "    " +dim.getHeight() );
        setSize(350, 200);
    }

	/*Javaが用意しているFontから選択*/
	private void createFontChoice(){
		final String fontFamilyNames[] = GraphicsEnvironment
	            .getLocalGraphicsEnvironment()
	            .getAvailableFontFamilyNames();

		for(String fontString: fontFamilyNames){
			font.add(fontString);
		}
	}
	/*フォントサイズは大/中/小の3択*/
	private void createFontSizeChoice(){
		fontSize.add(fontSizeSmall);
		fontSize.add(fontSizeMedium);
		fontSize.add(fontSizeLarge);
	}
	/*カラー*/
	private void createColorChoice(){
		ClockColorList list = new ClockColorList();
		ArrayList<ClockColor> colorList = list.getColorList();
		for(Object object: colorList){
			ClockColor item = (ClockColor)object;
			color.add(item.getName());
		}
	}
	private void createBackgroundColorChoice(){
		ClockColorList list = new ClockColorList();
		ArrayList<ClockColor> colorList = list.getColorList();
		for(Object object: colorList){
			ClockColor item = (ClockColor)object;
			backgroundColor.add(item.getName());
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		switch(e.getActionCommand()){
		case BTN_OK:
			setPropertySetting();
		case BTN_CANCEL:
			setVisible(false);
		default:
			owner.reflectSettings();
			break;
		}

	}

	private void setPropertySetting(){
		String selectedFont = font.getSelectedItem();
		String selectedFontSize = fontSize.getSelectedItem();
		String selectedColor = color.getSelectedItem();
		String selectedBackgroundColor = backgroundColor.getSelectedItem();
		System.out.println("[setPropertySetting]font"+ selectedFont);
		System.out.println("[setPropertySetting]fontSize"+ selectedFontSize);
		System.out.println("[setPropertySetting]color"+ selectedColor);
		System.out.println("[setPropertySetting]BColor"+ selectedBackgroundColor);

		ClockSetting instance = ClockSetting.getInstance();
		//フォントを設定
		instance.setFont(selectedFont);
		//色を設定
		setClockColor(selectedColor);
		//フォントサイズ設定
		setFontSize(selectedFontSize);
		//背景色を設定
		setBackgroundColor(selectedBackgroundColor);
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

}
