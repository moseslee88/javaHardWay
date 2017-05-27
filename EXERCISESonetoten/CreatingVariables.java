public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, century; //A variable is a name that refers to a location that holds a value.
		double seconds, e, checking, pi;
		String firstName, lastName, title, crown, Suffix;

		x = 10;
		y = 400;
		age = 39;
		century = 100;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		pi = 3.14159265359;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		crown = "King";
		Suffix = "Jr.";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took" + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		// printing out additional variables I added
		System.out.println( "I would love to be a " + century + " years old." );
		System.out.println( "March 14 is usually known as Pi Day because of " + pi +"!" );
		System.out.println( "My alter ego is " + crown + " " + firstName + " " + Suffix );
	}
}
