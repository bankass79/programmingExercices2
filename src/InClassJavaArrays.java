
public class InClassJavaArrays {
	 public static void main(String[] args) {
		    double[] numbers = {1.3, 2.1, 3.443345, 4.56, 5.78, 6.999999, 7.0, 8.15, 9, 10};
		    printArray(numbers);
		    System.out.println("The mean is " + mean(numbers));
		    System.out.println("The standard deviation is " +
		      Math.round(deviation(numbers)));

		    int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    System.out.print("\n\n"); 
		    printArray(numbers2);
		    System.out.println("The mean is " + mean(numbers2));
		    System.out.println("The standard deviation is " +
		      deviation(numbers2));
		    System.exit(0);
		  }

		/** Method for computing deviation of integer values*/
		  public static double deviation(int[] x) {
		    double mean = mean(x);
		    double squareSum = 0;
		    for (int i = 0; i < x.length; i++) {
		      squareSum += Math.pow(x[i] - mean, 2);
		    }
		    return Math.sqrt((squareSum) / (x.length - 1));
		  }
		  /** Method for computing deviation of double values*/
		  public static double deviation( double[] x) {
		    double mean = mean(x);
		    double squareSum = 0;
		    for (int i = 0; i < x.length; i++) {
		      squareSum += Math.pow(x[i] - mean, 2);
		    }
		    return Math.sqrt((squareSum) / (x.length - 1));
		  }
		  /** Method for computing mean of an array of double values*/
		public static double mean (double[] x) { 
		    double sum = 0;
		    for (int i=0; i<x.length; i++) 
		        sum+= x[i];
		    return (sum/x.length);
		}
		  /** Method for computing mean of an array of int values*/
		public static double mean (int[] x) {
		    double sum = 0;
		    for (int i=0; i<x.length; i++) 
		        sum+= x[i];
		    return (sum/x.length);
		}
		  /** Method for printing array of double values */
		public static void printArray (double[] x) {
		    for (int y =0; y <= (x.length-1); y++)
		        System.out.print(x[y]+"  ");
		    System.out.print("\n");
		    return;
		}
		  /** Method for printing array of integer values */
		public static void printArray (int[] x) {
		    for (int y =0; y <= (x.length-1); y++)
		        System.out.print(x[y]+"  ");
		    System.out.print("\n");
		    return;

		}
		} // end of class exercise
