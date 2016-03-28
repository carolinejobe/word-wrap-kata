
public class Wrapper {

	static String wrap(String input, int columnNumber) {
		//converting String to char array to use for determining index of whitespace
		char[] inputAsArray = input.toCharArray();
		//initializing empty string to use for output
		String output = "";

		//determine whether line breaks are needed
		if (input.length() > columnNumber) {
			//check for whitespace traversing string backwards from an index that is based on # of columns and index of last line break
			for (int i = columnNumber; i<=(input.length()); i+=columnNumber) {
				int lineBreakIndex = input.lastIndexOf(" ", i); //determine the index of the last whitespace preceding end of line
				inputAsArray[lineBreakIndex] = '\n'; //replace the whitespace with line break
				i=lineBreakIndex; //reset i to where the line break was inserted
			}
			output = String.valueOf(inputAsArray); //assign now-modified char array to output variable
			System.out.println(output);
			return output;
			
		//if String is shorter than number of columns, no need to insert line breaks
		} else {
			output = input;
			System.out.println(output);
			return output;
		}

	}
}
