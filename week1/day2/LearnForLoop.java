package week1.day2;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMethods by=new LearnMethods();
		System.out.println(by.Bicycle());
		
		System.out.println("---------------------------------------------------------");
		
		int i;
		for(i=0;i<10;++i)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------------------");
		for(i=20;i>=10;i--)
		{
			
			if(i==15)
			{
				System.out.println("Fifteen");
				break;
			}
			System.out.println(i);
			
		}
		
		
	}

}
