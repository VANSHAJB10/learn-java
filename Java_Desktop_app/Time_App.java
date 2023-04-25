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
     
     //create the tabbed pane and add the clock and stopwatch tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Clock", clockPanel);
        tabbedPane.addTab("Stopwatch", stopwatchPanel);
     
      // add the tabbed pane to the frame
        getContentPane().add(tabbedPane);
