/**Three recursive problems.
 * Add your code to the four functions given below.
 * Do not change any part of the function headers (name, parameters, or return type).
 * Do not change any part of the main.
 */

/**
 * @author joey pham
 * @date 1 October 2018
 * @description a set of functions: find max and min of an array, finds character frequency in a string,
 * 				and reverses a string
 */
public class Lab5 {
	public static void main( String[] args ) {
		int [] array = { 46, 22, 7, 58, 91, 55, 31, 84, 12, 78 };
		if( findMax( array ) == 91 ) {
			System.out.println( "findMax is correct!" );
		}
		if( reverseStr( "Hello" ).equals( "olleH" ) ) {
			System.out.println( "reverseString1 is correct!" );
		}	
		if( charFrequency( "The quick brown fox jumps over the lazy dog.", 'o' ) == 4 ) {
			System.out.println( "charFrequency1 is correct!" );
		}
		if( findMin( array ) == 7 ) {
			System.out.println( "findMin is correct!" );
		}
		if( reverseStr( "pupils" ).equals( "slipup" ) ) {
			System.out.println( "reverseString2 is correct!" );
		}	
		if( charFrequency( "The quick brown fox jumps over the lazy dog.", 'e' ) == 3 ) {
			System.out.println( "charFrequency2 is correct!" );
		}
	}
	
	
	//Write your facade functions here
	/**
	 * finds and returns the max value of the array
	 * @param array array and its values
	 * @return returns maximum value of the passed in array
	 */
	public static int findMax( int [] array ) {
		return maxArray( array, 0, array[0] );
	}
	
	/**
	 * finds and returns the minimum value of the array
	 * @param array array and its values
	 * @return returns minimum value of the passed in array
	 */
	public static int findMin( int [] array ) {
		return minArray( array, 0, array[0] );
	}


	/** Finds the maximum value in an array
	 * @param array array of values (sorted or unsorted)
	 * @param i iterator
	 * @param max maximum value found so far
	 * @return maximum value
	 */
	public static int maxArray( int [] array, int i, int max ) {
		if ( i < array.length ) { // iterate through the program
			if ( array[ i ] >= max ) { // if current value greater than/equal to current max
				return maxArray( array, i + 1, array[i] ); // return new max and iterate
			} else { // if not greater than the max
				return maxArray( array, i + 1, max ); // iterate and return current max through the function
			}
		} else { // if iterated though the array
			return max; // return the final max
		}
	}
	
	/** Finds the minimum value in an array
	 * @param array array of values (sorted or unsorted)
	 * @param i iterator
	 * @param max maximum value found so far
	 * @return maximum value
	 */
	public static int minArray( int [] array, int i, int min ) {
		if ( i < array.length ) { // iterate through the function
			if ( array[ i ] <= min ) { // if current value equal to or less than current min
				return minArray( array, i + 1, array[i] ); // return current value as the new min and iterate
			} else { // if greather than the current min
				return minArray( array, i + 1, min ); // return current min and iterate
			}
		} else { // after searching through whole array
			return min; // return final min
		}
	}
	
	/** Reverses a string
	 * @param s the string to reverse
	 * @return the reversed string
	 */
	public static String reverseStr( String s ) {
		if (s.length() > 1) { // if not one character long
			String lastLetter = s.substring( s.length() - 1 ); // this is the last letter of the string
			return lastLetter + reverseStr( s.substring( 0, s.length() - 1 ) ); // add the character to the string, and keep adding chars til you're at the end
		} else { // if last letter/if is only one character long, return the same thing 
			return s;
		}
	}
	
	/** Returns the number of times c appears in the string str
	 * @param str string to test
	 * @param c character to find
	 * @return number of times the character appeared in the string
	 */
	public static int charFrequency( String str, char c ) {	
		if ( str.length() > 1 ) { // if longer than one
			if ( str.charAt(0) == c ) { // if first letter of string is same as char
				return 1 + charFrequency( str.substring( 1 ), c ); // add 1 to counter and return string without the first letter
			} else { // if not first letter of the string
				return charFrequency( str.substring( 1 ), c ); // add 0 to counter and return string without the first letter
			}
		} else { // if string length is 1
			if ( str.charAt(0) == c ) { // if string is char
				return 1; // return/add 1 to the counter
			} else { // if string isn't char
				return 0; // return/add 0 
			}
		}
	}
}
