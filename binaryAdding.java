import java.util.*;

public class binaryAdding
{
   
	public static String addOperation(String A, String B)
	{
		
		int binaryOne = Integer.parseInt(A,2);
		int binaryTwo = Integer.parseInt(B,2);
		int sumOfb1Andb2 = binaryOne + binaryTwo;
			
		return Integer.toBinaryString(sumOfb1Andb2);
				
		
	}

	public static void main(String[] args) throws NumberFormatException
    {
		try {
				Scanner s = new Scanner(System.in);

				System.out.println("First binary number: ");
				String firstBinaryInput = s.nextLine();

				System.out.println("Second binary number: ");
				String secondBinaryInput = s.nextLine();
	    
				System.out.println("Total is: " + addOperation(firstBinaryInput, secondBinaryInput));
		}catch(Exception e)
		{
			System.out.println("Please Input correct binary values!");
			e.printStackTrace();
		}
    }
    
}