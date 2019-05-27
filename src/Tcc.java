
public class Tcc {
	public double calculateTotal(String[] from, String[] to)
	{
		String[] Zone1 = {"Don Mills","Leslie"};
		String[] Zone2 = {"Sheppard","Finch"};
		if(from[0] == Zone1[1] && to[0] == Zone1[0])
		{
			return 2.5;
		}
		else if(from[0] == Zone2[0] && to[0] == Zone2[1])
		{
			return 3.00;
		}
		else if(from[0] == Zone1[0] && to[0] == Zone2[1])
		{
			return 3.00;
		}
		return 0;
		
	}
	
}
