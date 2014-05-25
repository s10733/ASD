
public class ciag {

	public static void main(String[] args) {
		
		
		int[] tab = {3,4,6,1,2,3,8,9,10,11,5,4,6};
		int i = 0;
		int d³ugoœæ_max =1;
		int d³=1;
		for (i=0;i<tab.length-1;i++)
		{
			if(tab[i]<tab[i+1])
			{
				++d³;
				if(d³>d³ugoœæ_max)
				{
				d³ugoœæ_max=d³;	
				}
				
			}
			else
			{
			d³=1;
			}
			
		}
		System.out.println(d³ugoœæ_max);

	}

}
