import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsciiArt {
	


	/**
	 * In stations and airports you often see this type of screen. Have you ever asked yourself how it might be possible to simulate this display on a good old terminal? We have: with ASCII art!
	 * 
	 * ASCII art allows you to represent forms by using characters. To be precise, in our case, these forms are words. For example, the word "MANHATTAN" could be displayed as follows in ASCII art:
	 * # #  #  ### # #  #  ### ###  #  ###
	 * ### # # # # # # # #  #   #  # # # #
	 * ### ### # # ### ###  #   #  ### # #
	 * # # # # # # # # # #  #   #  # # # #
	 * # # # # # # # # # #  #   #  # # # #
	 * ​Your mission is to write a program that can display a line of text in ASCII art.
	 * 
	 * INPUT:
	 * Line 1: the width L of a letter represented in ASCII art. All letters are the same width.
	 * Line 2: the height H of a letter represented in ASCII art. All letters are the same height.
	 * Line 3: The line of text T, composed of N ASCII characters.
	 * Following Lines: the string of characters ABCDEFGHIJKLMNOPQRSTUVWXYZ? Represented in ASCII art.
	 * 
	 * OUTPUT:
	 * The text T in ASCII art.
	 * The characters a to z are shown in ASCII art by their equivalent in upper case.
	 * The characters which are not in the intervals [a-z] or [A-Z] will be shown as a question mark in ASCII art.
	 * 
	 * CONSTRAINTS :
	 * 0 < L < 30
	 * 0 < H < 30
	 * 0 < N < 200
	 * 
	 * 
	 * 
	 *
	 */
	
	static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	
	public static void main(String []args){
		
		Scanner in = new Scanner (System.in);
		
		int L= in.nextInt();
		 
		in.nextLine();
		int H= in.nextInt();
		
		in.nextLine();
		
		String T= in.nextLine().toUpperCase();
		
		List<String> ascii= new ArrayList<>();
		
		
		for( int i=0; i<H; i++){
			
			//String line= in.nextLine().toUpperCase();
			
			ascii.add(in.nextLine());
		}
		
		
		List<Integer> pos= new ArrayList<>();
		
		
		for(char c: T.toCharArray()){
			
			
			if( c <'A' ||  c > 'Z'){
				
				pos.add(26);
			}else{
				
				for(char letter: alphabet.toCharArray()){
					
					if(c==letter){
						
						
						pos.add(alphabet.indexOf(letter));
					}
				}
				
			}
		}
		
		
		for(int j=0; j<H; j++){
			
			for (int k=0; k<pos.size(); k++){
				
				System.out.println(ascii.get(j).substring(pos.get(k)*L, pos.get(k)*L+ L));
			}
			System.out.println();
		}
		in.close();
	}

}
