// RandomWords.java
public class RandomWords {
  /** Main method */
  public static void main(String args[]) {
    final int NUM_OF_CHARS = 50;

    for (int i = 1; i <= NUM_OF_CHARS; i++) {
        System.out.print(getRandomChar());
		if (i % 5 ==0)
			System.out.print(" ");
    }
    System.out.print("\n");
  }

  /* Generate a random letter from A - Z */
  public static char getRandomChar() {
	char Letter = (char) (( 1 + (int) (Math.random() * 26))+64) ;
    return Letter;
  }

}

