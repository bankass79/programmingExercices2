import java.io.File;

public class CheminAbsolu {

	
	public static String relative( final File base, final File file ) {
	    final int rootLength = base.getAbsolutePath().length();
	    final String absFileName = file.getAbsolutePath();
	    final String relFileName = absFileName.substring(rootLength + 1);
	    return relFileName;
	}

	

}
