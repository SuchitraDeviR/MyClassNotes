package week1.day2;

public class LearnBreakAndContinueLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<10;++i)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------");
		for(i=0;i<10;i++)
		{
			
			if(i==5)
			{
				System.out.println("Five");
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------");
		for(i=0;i<10;i++)
		{
			
			if(i==5)
			{
				System.out.println("Five");
				continue;
			}
			System.out.println(i);
		}
		
	}

}
