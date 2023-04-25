import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GUI extends JFrame {
   private JLabel clockLabel;
    private Timer clockTimer;
    private DateTimeFormatter timeFormat;
   
    private JLabel stopwatchLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer stopwatchTimer;

    private int elapsedTime = 0;
    private int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
    private boolean stopwatchStarted = false;

   public GUI() {
        super("Time");

        // create the clock tab
        JPanel clockPanel = new JPanel(new BorderLayout());  
        timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        clockLabel = new JLabel(LocalTime.now().format(timeFormat), SwingConstants.CENTER);
        clockLabel.setFont(new Font("Monospaced", Font.BOLD, 32));
        clockPanel.add(clockLabel);
      
        // create the stopwatch tab
        JPanel stopwatchPanel = new JPanel(new BorderLayout());
        stopwatchLabel = new JLabel("00:00:00.00", SwingConstants.CENTER);
        stopwatchLabel.setFont(new Font("Monospaced", Font.BOLD, 32));
        stopwatchPanel.add(stopwatchLabel, BorderLayout.CENTER);

        JPanel stopwatchButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startStopwatch();
            }
        });
        
        stopwatchButtonPanel.add(startButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopStopwatch();
            }
        });
        stopwatchButtonPanel.add(stopButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetStopwatch();
            }
        });
        stopwatchButtonPanel.add(resetButton);
        stopwatchPanel.add(stopwatchButtonPanel, BorderLayout.SOUTH);   // adding button panel of stopwatch to the bottom of JPanel - Stopwatch
      
     
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
   
   private void startStopwatch() {
        stopwatchStarted = true;
        stopwatchTimer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedTime += 10;
                milliseconds += 10;
                if (milliseconds == 1000) {
                    seconds++;
                    milliseconds = 0;
                }
                if (seconds == 60) {
                    minutes++;
                    seconds = 0;
                }
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                }
                updateTime();
            }
        });
        stopwatchTimer.start();
    }

    private void stopStopwatch() {
        stopwatchStarted = false;
        stopwatchTimer.stop();
    }


private void resetStopwatch() {
    stopwatchStarted = false;
    stopwatchTimer.stop();
    elapsedTime = 0;
    hours = 0;
    minutes = 0;
    seconds = 0;
    milliseconds = 0;
    updateTime();
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
