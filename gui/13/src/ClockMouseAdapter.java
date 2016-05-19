package src;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClockMouseAdapter extends MouseAdapter {
	private int dx;
    private int dy;
    private ClockPopupMenu popup;
    private ClockWindow window;
    private MouseEvent startPosition = null;

    public ClockMouseAdapter(ClockWindow window, ClockPopupMenu popup){
    	this.window = window;
    	this.popup = popup;
    }

    public void mouseDragged(MouseEvent e) {

    	if(startPosition != null){
    		if(e.getButton() == MouseEvent.BUTTON1){
    			int x = window.getLocation().x + e.getX() - startPosition.getX();
    			int y = window.getLocation().y + e.getY() - startPosition.getY();
    			window.setLocation(x, y);
    		}
//    		startPosition = e;
    	}
    }

    public void mousePressed(MouseEvent e) {
    	int button = e.getButton();
    	if(button == MouseEvent.BUTTON1){
    		System.out.println("LEFT_PRESSED");
    		startPosition = e;
    	}

    }
    public void mouseReleased(MouseEvent e){

    	int button = e.getButton();

    	if(button == MouseEvent.BUTTON1){
    		System.out.println("LEFT_RELEASED");
    		int x = window.getLocation().x + e.getX() - startPosition.getX();
    		int y = window.getLocation().y + e.getY() - startPosition.getY();
    		window.setLocation(x, y);
    	}else if(button == MouseEvent.BUTTON2){
    		System.out.println("MIDDLE");
    	}else if(button == MouseEvent.BUTTON3){
    		if(e.getComponent() != null){
    		System.out.println("RIGHT");
    		popup.show(e.getComponent() , e.getX() , e.getY());
    		}
    	}else {

    	}
    }

}
