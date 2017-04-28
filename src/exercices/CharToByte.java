package exercices;

import java.util.Scanner;

/**
 * @author amadou
 *  conversion du char en byte
 */
public class CharToByte {


	public static void main(String[] args) {


		System.out.println(" entrez une chaîne de caractère");

		Scanner in = new Scanner (System.in);

		String string= in.nextLine();

		char [] char1= string.toCharArray();

		byte [] byte1= new byte [char1.length];

		for(int i=0;  i<char1.length; i++){

			byte1[i]= (byte) char1[i];

			System.out.println(byte1 [i]);
		}



		in.close();
	}

}
