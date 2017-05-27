import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income, credit;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name?" );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you?" );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );

		//added human input for their credit score
		System.out.println( "So what's your credit score, " + name + "?" );
		credit = keyboard.nextDouble();
		System.out.println( "Try to raise your lowly score of " + credit + "!" );

		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();

		System.out.print( "hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
	}
}

    //The program does NOT blowup if you enter an integer value when it is expecting you to type a double
		//The program does NOT blowup if you enter a numeric value when it is expecting you to enter a String
		//If I type in "1/2", the program blows up on every question possible because it is a mathematical operation, not a String or a numeric value
