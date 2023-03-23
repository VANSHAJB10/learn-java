// Java program to display Month in MMM and MMMM Format
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
public static void main(String[] argv) throws Exception {
	
	Date dat = new Date(); // Date object is made
	SimpleDateFormat dateFormat;
	
	
	dateFormat = new SimpleDateFormat("MMM");
	System.out.println(dateFormat.format(dat));
	
	
	dateFormat = new SimpleDateFormat("MMMM");
	System.out.println(dateFormat.format(dat));
  }
}
