/*You write a class called Wrapper, that has a single static function named wrap 
 * that takes two arguments, a string, and a column number. The function returns the string, 
 * but with line breaks inserted at just the right places to make sure that no line is 
 * longer than the column number. You try to break lines at word boundaries.
 * Like a word processor, break the line by replacing the last space in a line with a newline. */

public class wrapperApp {

	public static void main(String[] args) {
		String input = "This is a sentence I'm using to test this application.";
		int columnNumber = 18;
		Wrapper.wrap(input, columnNumber);
	}

}
