public class RollDiceWithArrays
{
	public static void main(String[] args)
	{
		int roll, counter, index;
		int test = 0;
		int[] die = new int[7];
		for (counter=1; counter<=1000; counter++){
			roll = 1 + (int) (Math.random()*6);
			System.out.println("Roll #" + counter + " is " + roll);
			die[roll]++;
		} 
		System.out.print("\n");
		for (index=1; index<=6; index++)
		 System.out.println("The computer rolled a " + index+" "+die[index]+" times.");
		System.out.print("\n");
		for (index=1; index<=6; index++)
			test+=die[index];
		System.out.println("Total number of rolls: " + test);
		System.exit(0);
	}
}
