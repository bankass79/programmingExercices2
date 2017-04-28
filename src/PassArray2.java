public class PassArray2 {
  public static void main(String[] args) {
 
	int size = 5;
	int temp[] = {75, 65, 89, 72, 80};
	int i;

	for (i=0; i<size; i++) 
		System.out.println (temp[i]);
	System.out.print("\n");

	MakeHot(temp, size);
	for (i=0; i<size; i++) 
		System.out.println (temp[i]);
	System.out.print("\n");
	System.exit(0);
}

public static void MakeHot (int thermo[], int size) {
	int i;
	System.out.println ("Raise the temperatures!");
	for (i=0; i<size; i++) 
		thermo[i] += 10;
}
}