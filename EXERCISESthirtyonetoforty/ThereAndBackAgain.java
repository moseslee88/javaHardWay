public class ThereAndBackAgain {
    public static void main( String [] args ) {
      System.out.println( "Here." );
      erebor();     //removed the parentheses at the end of the function call, but it didn't compile, so i put parentheses back
      System.out.println( "Back first time." );
      //erebor();  // removed the second function call so that "There" wouldn't be printed in between line 5 and line 7
      System.out.println( "Back second time." );
    }    

    public static void erebor() {
        System.out.println( "There." );
    }
  }
