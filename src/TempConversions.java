public class TempConversions {
   public static void main( String[] args )
   {
    int i;

    System.out.println( "Fahrenheit equivalents of Celcius temperatures:\n" );
    System.out.println( "Celcius\t\tFahrenheit\n" );

    for ( i = 0; i <= 100; i+=10 )
       System.out.println( i + "\t\t" + fahrenheit( i )  );

    System.out.println( "\nCelcius equivalents of Fahrenheit temperatures:\n" );
    System.out.println( "Fahrenheit\tCelcius\n" );

    for ( i = 32; i <= 212; i+=10 )
       System.out.println( i + "\t\t" + celcius( i ) );

    System.exit(0);
}

public static int celcius( int fTemp )
	{
   		return ( int ) ( 5.0 / 9.0 * ( fTemp - 32 ) );
	}

public static int fahrenheit( int cTemp )
	{
   		return ( int ) ( 9.0 / 5.0 * cTemp + 32 );
	}

} // end of TempConversions class

