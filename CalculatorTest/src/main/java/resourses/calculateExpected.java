package resourses;

public class calculateExpected extends Base{
	
	public static String addexp()
	{
		String num1 = prop.getProperty("a1");
		int n1=Integer.parseInt(num1);  
		//System.out.println("n1"+n1);
		
		String num2 = prop.getProperty("a2");
		int n2=Integer.parseInt(num2);  
		//System.out.println("n2"+n2);

		
		int expectedResult =n1 + n2;
		String expectedResultString=Integer.toString(expectedResult);
		return expectedResultString;
	}
	
	public static String subexp()
	{
		String num1 = prop.getProperty("s1");
		int n1=Integer.parseInt(num1);  
		//System.out.println("n1"+n1);
		
		String num2 = prop.getProperty("s2");
		int n2=Integer.parseInt(num2);  
		//System.out.println("n2"+n2);

		
		int expectedResult = n1-n2;
		String expectedResultString=Integer.toString(expectedResult);
		return expectedResultString;
	}
	
	public static String mulexp()
	{
		String num1 = prop.getProperty("m1");
		int n1=Integer.parseInt(num1);  
		//System.out.println("n1"+n1);
		
		String num2 = prop.getProperty("m2");
		int n2=Integer.parseInt(num2);  
		//System.out.println("n2"+n2);

		
		int expectedResult = n1*n2;
		String expectedResultString=Integer.toString(expectedResult);
		return expectedResultString;
		
	}
	
	public static String divexp()
	{
		String num1 = prop.getProperty("d1");
		int n1=Integer.parseInt(num1);  
		//System.out.println("n1"+n1);
		
		String num2 = prop.getProperty("d2");
		int n2=Integer.parseInt(num2);  
		//System.out.println("n2"+n2);

		
		int expectedResult = n1/n2;
		String expectedResultString=Integer.toString(expectedResult);
		return expectedResultString;
	}
	
	

}
