import java.util.Arrays;

public class Tcc {
	public double calculateTotal(String[] from, String[] to)
	{
		String[] Zone1 = {"Don Mills","Leslie"};
		String[] Zone2 = {"Sheppard","Finch"};
		boolean containFromZone1 = Arrays.stream(Zone1).anyMatch(from[0]::equals);
		boolean containtoZone1 = Arrays.stream(Zone1).anyMatch(to[0]::equals);

		
		boolean containFromZone2 = Arrays.stream(Zone2).anyMatch(from[0]::equals);
		boolean containtoZone2 = Arrays.stream(Zone2).anyMatch(to[0]::equals);
		for(int i=0;i<2;i++)
		{
		if(containFromZone1 == true && containtoZone1 == true)
		{
			return 2.5;
		}
		else if(containFromZone2 == true && containtoZone2 == true)
		{
			return 3.00;
		}
		else if(containFromZone1 == true && containtoZone2 == true)
		{
			return 3.00;
		}
		System.out.println(i);
		}
		return 0;
		
	}
	
}
