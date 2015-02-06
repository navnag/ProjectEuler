
public class euler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int sum1=0;
		int sum2=0;
		int diff=0;
		int num=100;
		for(i=0;i<num+1;i++)
		{
			sum1=sum1+i*i;
		}
		for(i=0;i<num+1;i++)
		{
			sum2=sum2+i;
		}
		sum2=sum2*sum2;
		diff=sum2-sum1;
		System.out.println(diff);
		

	}

}
