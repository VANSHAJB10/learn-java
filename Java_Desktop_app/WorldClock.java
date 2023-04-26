import java.awt.*;
import java.awt.event.*; // for Jcomponents
import javax.swing.*;
import java.time.*;  // zoneid is in this package
import java.util.*;


class FindZoneId {
	public static void main(String[] rk) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		for (String s : zones) {
			ZoneId z = ZoneId.of(s);
			System.out.println(s + "\t" + z);
		}

	}
}

class WorldClock {
	static public void main(String[] rk) {
		JFrame f = new JFrame();
		f.setSize(1150, 760);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l = new JLabel("Location of Mouse", JLabel.CENTER);
		f.add(l, BorderLayout.SOUTH);
		l.setFont(new Font(Font.MONOSPACED, 1, 24));

		JLabel jl = new JLabel(new ImageIcon("map.jpeg"));
		f.add(jl);

		class MyListener extends MouseAdapter {
			
			int x;
			int y; 

			public void mouseMoved(MouseEvent m) {

				//to fetch x and y cordinates of mouse pointer
				x = m.getX();
				y = m.getY();
			l.setText(x + ", " + y); // display coordinates
        
        
     }

		MyListener ml = new MyListener();
		f.addMouseMotionListener(ml);
		//f.addMouseListener(ml);
		f.setVisible(true);
	}
}
