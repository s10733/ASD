
public class ciag {

	public static void main(String[] args) {
		
		
		int[] tab = {3,4,6,1,2,3,8,9,10,11,5,4,6};
		int i = 0;
		int d�ugo��_max =1;
		int d�=1;
		for (i=0;i<tab.length-1;i++)
		{
			if(tab[i]<tab[i+1])
			{
				++d�;
				if(d�>d�ugo��_max)
				{
				d�ugo��_max=d�;	
				}
				
			}
			else
			{
			d�=1;
			}
			
		}
		System.out.println(d�ugo��_max);

	}

}
