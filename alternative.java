
public class alternative {

	public static void main(String[] args) {
		int a = 7, b = 0,c;
		System.out.println("Series :");
		for(int i = 1 ; i < 8 ; i++)
		{
			c = a * b;
			System.out.printf(c+" "+(c-b)+" ");
			b++;
		}
			c = a * b;
			System.out.println(c);
			System.out.print("15th element of the series is = "+c);
	}
}
