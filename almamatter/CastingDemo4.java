package almamatter;

public class CastingDemo4 {

	public static void main(String[] args) {
		int x=1000;
		System.out.println(x);//print 1000
		System.out.println(x--);//print 1000 - in post decrement - the x is printed first and incremented
		System.out.println(x);//print 999
		System.out.println("PRE DECREMENT.....");
		int y=2000;
		System.out.println(y);//print 2000
		System.out.println(--y);//print 1999 - in pre decrement - the y is incremented first and then printed
		System.out.println(y);//print 1999
	}

}
