import java.util.HashSet;
import java.util.Scanner;


public class PrimeNumberBestPerfomence {
	public static void main(String[] args) {
		long sNo=0;
		long eNo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter starting number");
		sNo=sc.nextLong();
		System.out.println("Please enter ending number");
		eNo=sc.nextLong();
		long sTime=System.currentTimeMillis();
		if(sNo<=2)
		{
			System.out.println("2 ");
			sNo=3;
		}
		else if(sNo%2==0)
				sNo+=1;		
		for(long i=sNo;i<=eNo;i+=2)
		{
			int count=0;
			long k=i/2;
			
			for(long j=3;j<=k;j+=2)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
			}
			if(count==0)
				System.out.println(i);
		}
		System.out.println(System.currentTimeMillis()-sTime+" MS");		
	}

}
