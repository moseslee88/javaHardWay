import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String Password;

    pin = 12345;

    //ask customer for a Password before a PIN
    System.out.println("What's your password?");
    System.out.print("Enter password: ");
    Password = keyboard.nextLine();

    while ( ! Password.equals("Newyork2") ) {
      System.out.println("\nIncorrect Password. Try again.");
      System.out.print("Enter your password: ");    
      Password = keyboard.nextLine();
    }

    System.out.println("\nPassword accepted. You may now proceed.");

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
    System.out.println("\nINCORRECT PIN. TRY AGAIN.");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();
  }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
