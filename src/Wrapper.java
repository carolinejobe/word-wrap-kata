
public class Wrapper {

	static String wrap(String input, int columnNumber) {
		char[] inputAsArray = input.toCharArray();
		String output = "";
		int lineBreakIndex=0;

		if (input.length() > columnNumber) {
			for (int i = columnNumber; i<=(input.length()); i+=columnNumber) {
				lineBreakIndex = input.lastIndexOf(" ", i); //determine the index of the last carriage prior to exceeding column count
				inputAsArray[lineBreakIndex] = '\n'; //replace the whitespace with carriage return
				i=lineBreakIndex; //reset i to where the carriage return was inserted
			}
			output = String.valueOf(inputAsArray);
			System.out.println(output);
			return output;
			
		//if String is shorter than number of columns, no need to insert carriage returns	
		} else {
			output = input;
			System.out.println(output);
			return output;
		}

	}
}
