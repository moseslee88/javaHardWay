public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    System.out.println("You are weird");

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
      //system doesn't compile when i tried to input println("C-C-C-COMBO BREAKER");
    else {
      System.out.println("You are not allowed to enter the club.");  
    }
  }
}
