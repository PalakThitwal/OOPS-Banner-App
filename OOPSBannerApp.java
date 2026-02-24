
/**
@PalakThitwal Developer
@version 2
*/

/**
public class OOPSBannerApp {
	public static void main(String[] args)
	{
		System.out.println("OOPS");
		System.out.println("   ***   " + "   ***   " + "   ******   " + "   ******   ");
		System.out.println(" **   ** " + " **   ** " + " **      ** " + " ***   ");
		System.out.println(" **   ** " + " **   ** " + " **      ** " + "  ***   ");
		System.out.println(" **   ** " + " **   ** " + " **      ** " + "    *****   ");
		System.out.println(" **   ** " + " **   ** " + " *******    " + "       ***   ");
		System.out.println(" **   ** " + " **   ** " + " **         " + "       ***   ");
		System.out.println("   ***   " + "   ***   " + " **         " + "   ******   ");
	}
}
*/

/**
@PlakThitwal Developer
@version 3.0
*/

public class OOPSBannerApp {
		public static void main(String[] args)
		{
			System.out.println(String.join(" " , "   ***   " , "   ***   " , "   ******   " , "   ******   "));
			System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , " ***        "));
			System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , "  ***       "));
			System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , "    *****   "));
			System.out.println(String.join(" " , " **   ** " , " **   ** " , " *******    " , "       ***  "));
			System.out.println(String.join(" " , " **   ** " , " **   ** " , " **         " , "       ***  "));
			System.out.println(String.join(" " , "   ***   " , "   ***   " , " **         " , "   ******   "));
		}
}
		