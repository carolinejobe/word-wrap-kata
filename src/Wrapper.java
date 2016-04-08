
public class Wrapper {

	static String wrap(String input, int columnNumber) {
		char[] inputAsArray = input.toCharArray();
		String output = "";

		if (input.length() > columnNumber) {
			//check for whitespace traversing string backwards from an index that is based on # of columns and index of last line break
			for (int i = columnNumber; i<=(input.length()); i+=columnNumber) {
				int lineBreakIndex = input.lastIndexOf(" ", i); 
				inputAsArray[lineBreakIndex] = '\n'; 
				i=lineBreakIndex; //reset i to where the line break was inserted
			}
			output = String.valueOf(inputAsArray); 
			System.out.println(output);
			return output;
			
		} else {
			output = input;
			System.out.println(output);
			return output;
		}

	}
}
