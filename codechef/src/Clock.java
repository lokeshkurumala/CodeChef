import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JFrame;


public class Clock extends JFrame{

	/**
	 * @param args
	 */
	int x,y,radius;
	int height,width;
	Timer timer;
	public Clock(){
		x = 200;
		y = 200;
		radius = 200;
		height = 40;
		width = 40;
		this.setSize(height,width);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//timer = new Timer(100, new TimerListener());
	}
	
	private class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
