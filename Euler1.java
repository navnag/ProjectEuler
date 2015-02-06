
public class euler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int total=0;
		for(i=0;i<1000;i++)
		{
			if(i%3==0||i%5==0)
			{
				total=total+i;
			}
		}
		System.out.println(total);
	}

}
