
public class Histogram {
	 public static void main(String[] args) {
		   int n[] = { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 };
		   int i, j, sum=0, max=0;
		   int size = 10;
		   System.out.println("Element Value Histogram");
		   
		   for (i=0; i< size; i++) {
		        System.out.print(i+"\t"+ n[i]+"\t");
		        sum += n[i];
		        for (j=0; j< n[i]; j++) 
		            System.out.print("*");
		        System.out.print("\n");
		   } // end of for i = 0
		   
		   System.out.println("These are the elements:");
		   for (i=0; i<size; i++) 
		        System.out.print(n[i]+"  ");
		   System.out.print("\n");
		   System.out.println("The sum of the elements is "+ sum);
		   
		   for (i=(size-4); i<size; i++ )
		        if (n[i]>max)
		            max = n[i];
		   System.out.println("The highest of the last 4 elements is "+max);         
		   
		   System.exit(0);
		}
		}