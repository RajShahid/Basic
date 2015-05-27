package Basic;

public class Initials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			System.out.print("j");		
		}
		System.out.println();
		for(int j=0;j<4;j++)
		{
			System.out.println("  j");
			if(j==3)
			{
				System.out.println("j j");
			}
			else if(j==3)
			{
				System.out.println("j");
			}
		}
	}

}
