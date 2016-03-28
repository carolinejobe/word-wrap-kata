
public class Wrapper {

	static String wrap(String input, int columnNumber){
		char[] inputAsArray = input.toCharArray();
		String output = "";
		
		//TODO wrap in for loop that will iterate over entire input and use counter of value 'columnnNumber' to find
		//all line breaks
		if(input.length()>columnNumber){
			for(int i=columnNumber-1; i<=input.length(); i+=columnNumber){
					int lineBreakIndex = input.lastIndexOf(" ", i);
					inputAsArray[lineBreakIndex]= '\n';
				}
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
