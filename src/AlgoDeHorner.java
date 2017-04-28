
public class AlgoDeHorner {
	
	public double Horner (int [] cf, double x){
		
		int n=cf.length-1;
		
		
		double valeur =cf[n];
		
		for(int i=n-1; i>0; i--){
			
			valeur= valeur*x +cf[i];
		}
		
		return valeur;
		
		
	}

}
