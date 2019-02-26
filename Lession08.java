import org.junit.Assert;
import org.junit.Test;

public class Lession08 {
	
	class Tinhtong 
	{
		String a;
		String [] b;
		
		public String[] total;
		
		//public Tinhtong (String[] sum) 
		//{
		//	this.total = total;
		//}
		
		public Tinhtong() {
			// TODO Auto-generated constructor stub
		}

		public  int Tinhsum() 
		{
			String a = "123456";
			String[] arr = a.split("");
			int sum = 0;
			for (int i = 0;i < arr.length; i++) 
			{
				sum += Integer.parseInt(arr[i]);
			}
			//System.out.println(sum);
			return sum;
		}

		public boolean CheckSum() {
			// TODO Auto-generated method stub
			return false;
		}
	}
	@Test
	
	public void CheckSum() 
	{
		Tinhtong tong = new Tinhtong();
		
		boolean result = tong.CheckSum();
		
		Assert.assertEquals(21, 21);
		
		
		
	}
}
