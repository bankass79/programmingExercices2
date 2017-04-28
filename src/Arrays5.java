// This program assigns values to the array elements; and then
// prints out elements with even numbered subscripts followed by
// elements with even numbered values
public class Arrays5 {
   public static void main( String[] args )
   {
	int FirstArray[];
	FirstArray = new int[5];
	int i;

	FirstArray[0] = 125;
	FirstArray[1] = 12;
	FirstArray[2] = 33;
	FirstArray[3] = 21;
	FirstArray[4] = 126;
	
	System.out.println("The elements are:");		
	for (i=0; i<5; i++)
		System.out.println("Subscript "+i+" has a value of : "+FirstArray[i]+" " );
	
	System.out.println("\nThe elements with even numbered subscripts are:");		
	for (i=0; i<5; i+=2)
		System.out.println("Subscript "+i+" has a value of : "+FirstArray[i]+" " );


	System.out.println("\nThe elements with an even numbered value are:");		
	for (i=0; i<5; i++) {
		if (FirstArray[i] %2 ==0)
    		System.out.println("Subscript "+i+" has a value of : "+FirstArray[i]+" " );
	}

	System.exit(0);
}  
}