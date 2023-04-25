import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GUI extends JFrame {
   private JLabel clockLabel;
    private Timer clockTimer;
    private DateTimeFormatter timeFormat;

   public GUI() {
        super("Time");

        // create the clock tab
        JPanel clockPanel = new JPanel(new BorderLayout());  
        timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        clockLabel = new JLabel(LocalTime.now().format(timeFormat), SwingConstants.CENTER);
        clockLabel.setFont(new Font("Monospaced", Font.BOLD, 32));
        clockPanel.add(clockLabel);
      
      
       private JLabel stopwatchLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer stopwatchTimer;

    private int elapsedTime = 0;
    private int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
    private boolean stopwatchStarted = false;
      
     
     //create the tabbed pane and add the clock and stopwatch tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Clock", clockPanel);
        tabbedPane.addTab("Stopwatch", stopwatchPanel);
     
      // add the tabbed pane to the frame
        getContentPane().add(tabbedPane);
      
      // start the clock timer
        clockTimer = new Timer(1000, new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                clockLabel.setText(LocalTime.now().format(timeFormat));
            }
        });
        clockTimer.start();

        setSize(1150, 760);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
   
   private void updateTime() {
    String hoursStr = String.format("%02d", hours);
    String minutesStr = String.format("%02d", minutes);
    String secondsStr = String.format("%02d", seconds);
    String millisecondsStr = String.format("%03d", milliseconds);

    stopwatchLabel.setText(hoursStr + ":" + minutesStr + ":" + secondsStr + "." + millisecondsStr);
}

public static void main(String[] args) {
    GUI gui = new GUI();
 }
}
