import javax.swing.JOptionPane;
public class PowerMethod {
   public static void main( String[] args )
   {
	int base, exp;
    	// Prompt the user to enter the number for the base
    	String numString1 = JOptionPane.showInputDialog(null,
      	"Enter the number to use for the base ", "Input Number Window",
      	JOptionPane.QUESTION_MESSAGE);

    	// Convert the string into an int value
    	base = Integer.parseInt(numString1);

    	// Prompt the user to enter the number for the exponent
    	String numString2 = JOptionPane.showInputDialog(null,
      	"Enter the number to use for the exponent ", "Input Number Window",
      	JOptionPane.QUESTION_MESSAGE);

    	// Convert the string into an int value
    	exp = Integer.parseInt(numString2);

        // print out the result
        System.out.println(base + " to the power of " + exp+" is "+powerMethod(base, exp));
      	System.exit( 0 );
   } // end main
   public static int powerMethod( int x , int y)
   {
       int result=1;
       for (int counter = 1; counter <= y; counter++) {
        result *= x;
    } // end of for counter
    return result;
   } // end of powerMethod
} // end of class
