public class MathOperations {
	public static void main( String[] args ) {
		int a, b, c, d, e, f, g, m;
		double x, y, z, p, h, k, valentine;
		String one, two, both;

		a=10;
		b=27;
		System.out.println( "a is " + a + ", b is " + b );

		c = a + b;
		System.out.println( "a+b is" + c );
		d= a - b;
		System.out.println( "a-b is " + d );
		e = a+b*3;
		System.out.println( "a+b*3 is " + e );
		f = b / 2;
		System.out.println( "b/2 is " + f );
		g = b % 10;
		System.out.println( "b%10 is " + g );

		x=1.1;
		System.out.println( "\nx is " + x );
		y = x*x;
		System.out.println( "x*x is " + y );
		z = b / 2;
		System.out.println( "b/2 is " + z );
		System.out.println();

		one = "dog";
		two = "house";
		both = one + two;
		System.out.println( both );

		//I added 3 doubles named p, h, and k one extra Int variable m and one double named valentine
		p=3.14159265358979323846264338327;
		System.out.println( "\npi is " + p );
		h = p*4;
		System.out.println( "pi*4 is " + h );
		k = p / 2;
		System.out.println( "pi/2 is " + k );


		m = a * 1988;
		System.out.println( "a*1988 is " + m );
		valentine = 81 / b*10 ;
		System.out.println( "81 / b*10 " + valentine );  
	}
}
