import java.util.Scanner;

public class BMICalculator  {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, in, lbs;

    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

    System.out.print( "OR enter your height in inches: " );
    in = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lbs = keyboard.nextDouble();

    bmi = (lbs * 0.453592) / (in * .0254 * in * .0254);
    //Are there more efficient ways to code this, perhaps into exponential form??
    System.out.println( "Your BMI is " + bmi );
  }
}
