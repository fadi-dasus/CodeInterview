package solution;

public class TextReverse {
	public static String reverseSentence(String line) {
		  if (line.trim().isEmpty()) {
			  return line;
			  }
			 
			  StringBuilder reverse = new StringBuilder();
			  String[] sa = line.trim().split("\\s");
			 
			  for (int i = sa.length - 1; i >= 0; i--) {
			  reverse.append(sa[i]);
			  reverse.append(' ');
			  }
			 
			  return reverse.toString().trim();
			  }
}
