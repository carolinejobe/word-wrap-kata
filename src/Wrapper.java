
public class Wrapper {

	static String wrap(String input, int columnNumber){
		char[] inputAsArray = input.toCharArray();
		String output = "";
		
		//TODO wrap in for loop that will iterate over entire input and use counter of value 'columnnNumber' to find
		//all line breaks
		if(input.length()>columnNumber){
			int lineBreakIndex = input.lastIndexOf(" ", columnNumber-1);
			inputAsArray[lineBreakIndex]= '\n';
			output = String.valueOf(inputAsArray);
			System.out.println(output);
			return output;
		}
		else{
			output = input;
			System.out.println(output);
			return output;
		}
		
	}
}
