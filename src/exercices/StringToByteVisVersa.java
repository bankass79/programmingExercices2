package exercices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author amadou
 *
 */
public class StringToByteVisVersa {

	public static void main(String[] args) throws IOException {

     System.out.println("saisissez votre string");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String str= input.readLine();

		char [] buffer= str.toCharArray();

		byte [] b= new byte[buffer.length<<1];

		for(int i=0; i<buffer.length; i++){

			int bpos=i<<1;

			b[bpos]= (byte)((buffer[i]&0xFF00)>>8);

			b[bpos+1] =(byte)(buffer[i]&0x00FF);

			System.out.println(b[i]);
		}

	}

}
