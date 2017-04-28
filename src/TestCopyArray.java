
public class TestCopyArray {
	 /** Main method */
	  public static void main(String[] args) {
	    // Create an array and assign values
	    int[] list1 = {0, 1, 2, 3, 4 ,5};
	    // Create an array with default values of 0
	    int[] list2 = new int[list1.length];

	    // Display list1 and list2
	    System.out.println("After declaring and initializing list1 and list2");
	    printList("list1 is ", list1);
	    printList("list2 is ", list2);

	    // Assign array list1 to array list2;
	    // NOTE THAT THIS IS NOT A GOOD IDEA!!!
	    list2 = list1;

	    // Display list1 and list2
	    System.out.println("\nBefore modifying list1 but after attempting to set them equal");
	    printList("list1 is ", list1);
	    printList("list2 is ", list2);

	    // Modify list1 -- AND SEE WHAT HAPPENS TO list2!
	    for (int i = 0; i < list1.length; i++)
	      list1[i] = 0;

	    // Display list1 and list2 after modifying list1
	    System.out.println("\nAfter modifying list1, note what happened to list2!");
	    printList("list1 is ", list1);
	    printList("list2 is ", list2);

		// Here is a better way to do this:
	    int[] list3 = {0, 1, 2, 3, 4 ,5};

	    // Create an array with default values of 0
	    int[] list4 = new int[list3.length];

		for (int j=0; j < list3.length; j++)
			list4[j] = list3[j];

	    // Display list3 and list4 again after copying list1 to list2
	    System.out.println("\nAfter copying list3 to list4, each element at a time");
	    printList("list3 is ", list3);
	    printList("list4 is ", list4);
	    
	    // Modify list3 -- AND SEE WHAT HAPPENS TO list4!
	    for (int i = 0; i < list3.length; i++)
	      list3[i] = 0;

	    System.out.println("\nAfter modifying list 3:");
	    printList("list3 is ", list3);
	    printList("list4 is ", list4);

	  }

	  /** The method for printing a list */
	  public static void printList(String s, int[] list) {
	    System.out.print(s + " ");
	    for (int i = 0; i < list.length; i++)
	      System.out.print(list[i] + " ");
	    System.out.println();
	  }
}
