// This program prints out specific elements of the array by examining the subscripts
public class array4 {
   public static void main( String[] args )
   {

	int FirstArray[];
	FirstArray = new int[20];
	int i;

	for (i=0; i<20; i++)
		FirstArray[i] = i*10 ;

	System.out.println("The elements with even number subscripts from 0-19 are:\n");		
	for (i=0; i<20; i+=2)
		System.out.print(FirstArray[i]+" " );

	System.out.print("\n");
	System.exit(0);
}  
}
