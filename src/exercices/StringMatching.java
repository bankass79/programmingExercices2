package exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatching {
	
	public static List<Integer> findAll(String pattern, String source) {
		  List<Integer> idx = new ArrayList<Integer>();
		  Pattern ptrn = Pattern.compile(pattern);
		  Matcher mtch = ptrn.matcher(source);
		  while(mtch.find()){
		   idx.add(mtch.start());
		  }
		  return idx;
		  
		 }

}
