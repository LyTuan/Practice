package Frame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class JFrameTest {
	public static void main(String avgs[]){
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame giaodien = new JFrame("CoffeShop.vn");
				giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				giaodien.setVisible(true);
				giaodien.setSize(300, 400);
				
				
			}
		});
	}
}
