
/**
@PalakThitwal Developer
@version 2
*/

/**

 
*@PalakThitwal Developer
@PalakThitwal Developer
 feature/UC2-BannerPrintStatements
@version 2
*/

/**
public class OOPSBannerApp {
	public static void main(String[] args)
	{
		System.out.println("OOPS");
		System.out.println(" ***  "   + "   *** " + "  ****** "     +  " ***** ");
		System.out.println("**   ** " + " **   ** " + " **   ** "+ "  **   ");
		System.out.println("**   ** " + " **   ** " + " **   ** " +"  **    ");
		System.out.println("**   ** " + " **   ** " + " ****** " +      "****    ");
		System.out.println("**   ** " + " **   ** " + " **    "      + "    **");
		System.out.println("**   ** " + " **   ** " + " **    "      + "   **    ");
		System.out.println(" ***  "   + "   ***    "   +"**   "   + " ***** ");
    }
}	
*/

/**
@PlakThitwal Developer
@version 3.0
*/

/**
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
*/

/**
@PalakThitwal Developer
@version 4
*/

/**
public class OOPSBannerApp {
	public static void main(String[] args) 
	{
		lines[0] = System.out.println(String.join(" " , "   ***   " , "   ***   " , "   ******   " , "   ******   "));
		lines[1] = System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , " ***        "));
		lines[2] = System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , "  ***       "));
		lines[3] = System.out.println(String.join(" " , " **   ** " , " **   ** " , " **      ** " , "    *****   "));
		lines[4] = System.out.println(String.join(" " , " **   ** " , " **   ** " , " *******    " , "       ***  "));
		lines[5] = System.out.println(String.join(" " , " **   ** " , " **   ** " , " **         " , "       ***  "));
		lines[6] = System.out.println(String.join(" " , "   ***   " , "   ***   " , " **         " , "   ******   "));
	}
}
*/

/**
@PalakThitwal Developer
@version 5
*/

public class OOPSBannerApp {
	public static void main(String[] args)
	{
		String[] lines = {
			String.join(" " , "   ***   " , "   ***   " , "   ******   " , "   ******   "),
			String.join(" " , " **   ** " , " **   ** " , " **      ** " , " ***        "),
			String.join(" " , " **   ** " , " **   ** " , " **      ** " , "  ***       "),
			String.join(" " , " **   ** " , " **   ** " , " **      ** " , "    *****   "),
			String.join(" " , " **   ** " , " **   ** " , " *******    " , "       ***  "),
			String.join(" " , " **   ** " , " **   ** " , " **         " , "       ***  "),
			String.join(" " , "   ***   " , "   ***   " , " **         " , "   ******   ")};
		for (String line : lines) {
			System.out.println(line);
		}
	}
}