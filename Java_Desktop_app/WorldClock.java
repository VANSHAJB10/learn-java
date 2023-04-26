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
			
		if ((x >= 750 && x <= 810) && (y <= 460 && y >= 374)) // India
				{
					ZoneId z = ZoneId.of("Asia/Calcutta");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to India. Time is: " + t);
				}
				else if ((x >= 158 && x <= 292) && (y <= 374 && y >= 300)) // USA
				{
					ZoneId z = ZoneId.of("America/Chicago");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to USA. Time is: " + t);
				}

				else if ((x >= 530 && x <= 558) && (y <= 322 && y >= 292)) // paris
				{
					ZoneId z = ZoneId.of("Europe/Paris");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to France. Time is: " + t);
				}

				else if ((x >= 978 && x <= 969) && (y <= 358 && y >= 344)) // japan
				{
					ZoneId z = ZoneId.of("Asia/Tokyo");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Japan. Time is: " + t);
				}

				else if ((x >= 790 && x <= 902) && (y <= 382&& y >= 333)) // china
				{
					ZoneId z = ZoneId.of("Asia/Shanghai");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to China. Time is: " + t);
				}

				else if ((x >= 618 && x <= 644) && (y <= 403 && y >= 375)) //  Africa
				{
					ZoneId z = ZoneId.of("Africa/Cairo");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Egypt. Time is: " + t);
				}

				else if ((x >= 896 && x <= 1010) && (y <= 578 && y >= 517)) // Aus
				{
					ZoneId z = ZoneId.of("Australia/Sydney");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Australia. Time is: " + t);
				}

				else if ((x >= 653 && x <= 1002) && (y <= 270 && y >= 118)) // Russia
				{
					ZoneId z = ZoneId.of("Europe/Moscow");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Russia. Time is: " + t);
				}

			 	else if ((x >= 591 && x <= 623) && (y <= 494 && y >= 462)) // Congo
				{
					ZoneId z = ZoneId.of("Africa/Bangui");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Congo. Time is: " + t);
				}

				else if ((x >= 158 && x <= 292) && (y <= 300 && y >= 374)) // USA
				{
					ZoneId z = ZoneId.of("America/Chicago");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to USA. Time is: " + t);
				}

				else if ((x >= 1064 && x <= 1135) && (y <= 423 && y >= 328)) // Pacific
				{
					ZoneId z = ZoneId.of("Pacific/Pago_Pago");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Pacific region. Time is: " + t);
				}

				else if ((x >= 338 && x <= 416) && (y <= 560 && y >= 472)) // Brazil
				{
					ZoneId z = ZoneId.of("America/Chicago");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Brazil. Time is: " + t);
				}


				else if ((x >= 112 && x <= 338) && (y <= 297 && y >= 44)) // Canada
				{
					ZoneId z = ZoneId.of("Canada/Pacific");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to Canada. Time is: " + t);
				}

				else if ((x >= 523 && x <= 536) && (y <= 288 && y >= 246)) // London
				{
					ZoneId z = ZoneId.of("Europe/Berlin");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to UK. Time is: " + t);
				}

				else if ((x >= 15 && x <= 154) && (y <= 581 && y >= 310)) // US Pacific Region
				{
					ZoneId z = ZoneId.of("US/Pacific-New");
					LocalTime t = LocalTime.now(z);
					l.setText("Welcome to US Pacific Region. Time is: " + t);
				}
			
        
        
     }

		MyListener ml = new MyListener();
		f.addMouseMotionListener(ml);
		//f.addMouseListener(ml);
		f.setVisible(true);
	}
}
