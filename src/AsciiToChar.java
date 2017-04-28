import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AsciiToChar {
	
	static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	
	
	public static void main(String [] args){
		
		
		Scanner in= new  Scanner (System.in);
		
		 char  ascii= 'b';
		
		 int i= (int) ascii;
		 
	char []a =alphabet.toCharArray();
		
	char conversion= (char) i;
	   
	System.out.println("i:" +i+ " " + "ch:"+Character.getNumericValue(ascii));
		
		
	System.out.println("conversion:"+ " "+ conversion);
	
	
	System.out.println( "a:" + Arrays.toString(a));
		
	
	
		
	}	
	
}
