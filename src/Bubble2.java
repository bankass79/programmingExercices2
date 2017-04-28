
public class Bubble2 {
	 //This program demonstrates the Bubble Sort!
    public static void main(String[] args) {
        int[] array1 = new int[10];
        //create random data
        for (int i=0; i< array1.length; i++) 
            array1[i] = (int) (Math.random() *20) + 1;
        System.out.println("Data items in their original order");
        for (int kount=0; kount<array1.length; kount++)
            System.out.print ("  " + array1[kount]);
        bubbleSort( array1 ); // sort array
         System.out.println("\n\nData items in their sorted order");
        for (int kount=0; kount<array1.length; kount++)
            System.out.print ("  " + array1[kount]);
    }// end main
    
    public static void bubbleSort (int array2[] ) {
    int temp;    
        //loop to compute the number of passes thru the data
        for (int pass=1; pass < array2.length ; pass++) {
            // loop to control num of comparisons (pairs to look at)
          for (int element=0; element <= (array2.length - pass -1); element++){
              // compare to elements which are side by side, switch if necessary
              if ( array2[element] > array2[element+1]){
                  temp = array2[element];
                  array2[element] = array2[element + 1];
                  array2[element+1] = temp;             
              }  // end if array2....
          }// end for element
        } // end for pass
    }  // end method bubbleSort
}
