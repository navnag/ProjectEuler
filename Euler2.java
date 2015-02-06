
public class euler2 {

	/**
	 * @param args
	 * @author Naveen
	 */
	public static void main(String[] args) {
		int start=1;
		int finish=2;
		int sum=0;
		int a;
		while (finish<4000000)
		{
			if (finish%2==0)
			{
				sum=sum+finish;
			}
			a=start+finish;
			start=finish;
			finish=a;
		}
		System.out.println(sum);	
	}

}
