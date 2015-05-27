package Basic;

public class Letter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i;
			System.out.print("+------------------------------+");
			System.out.println();
			for(i=0;i<7;i++)
			{
				if(i<3)
				{
					System.out.println("|"+"			    ### "+"|");
				}
				else if(i==4 || i==5)
				{
					System.out.println("|"+"			        "+"|");
				}
				else if(i==6)
				{
					System.out.println("|"+"	          M Shahid      "+"|");
					System.out.println("|"+"	          Lahore        "+"|");
					System.out.println("|"+"	          Pakistan      "+"|");
				}
			}
			System.out.print("+------------------------------+");
			
	}	
}