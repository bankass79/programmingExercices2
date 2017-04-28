// this is an array of characters
// Note that this program uses the second through 27th elements so that
// the subscripts are easier to manage (i.e. "a" is SecondArray[1], etc)
public class Array3 {
   public static void main( String[] args )
   {
	char SecondArray[];
	SecondArray = new char[27];
	int i;
	char letter = 'a';

	for (i=1; i<=26; i++) {
		SecondArray[i] = letter ;
		letter++;
		}
		
	for (i=1; i<=26; i++)
		System.out.print(SecondArray[i] );
		System.out.print("\n");
		
	// What does this line print?
   	System.out.print(" "+SecondArray[3]+SecondArray[1]+SecondArray[20]+"\n");	
		
	System.exit(0);
	}  
}