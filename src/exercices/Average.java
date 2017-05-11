package exercices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Average {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		 System.out.println(" saisisissez un nombre");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		      List< Double> stdIn = new ArrayList<Double>();
		
		    double sum=0.0;
		    int cnt =0;
		   
		    while (stdIn.isEmpty()) {
		    	
		    
		    	
		    	stdIn.add((double)(Integer.parseInt(in.readLine())));
		    	
		    	for(int i=0; i<=stdIn.size()-1; i++){
		    		
		    	sum += stdIn.get(i);
		    			
		    			cnt++;
		    			
		    	}
				
			}
		    
		    double avg=sum/cnt;
		    
		    System.out.printf("Average is  %.5f\n", avg);

	}

}
