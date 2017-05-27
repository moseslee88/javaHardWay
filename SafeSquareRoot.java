import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String alert;

    System.out.println( "Are you ready?!?");
    //Add another input protection loop toward the top of the program. Ask them “Are you ready?!?” and don’t go on until they reply "YES!".
    //I remembered to use .equals() to compare Strings and use ! for “not”.
    alert = keyboard.nextLine();

    while ( ! alert.equals("YES!") ) {
      System.out.println( "\tThat's the \"wrong\" attitude." );    
      System.out.print( "Answer again: " );
      alert = keyboard.nextLine();
    }

    System.out.print( "Give me a number, and I'll find its square root. " );
    System.out.print( "(No negatives, please.) ");
    x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println( "I won't take the square root of a negative." );
      System.out.print( "\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
