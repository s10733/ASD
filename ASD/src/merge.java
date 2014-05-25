
public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 0;
		int q = 3;
		int r = 7;
		int d³A1 = q+1 ;
		int d³A2 = r-q;
		int A[] = {1,3,5,7,2,4,6,8};
		int A1[] = new int [d³A1];
		int A2[] = new int [d³A2];
		int pos[] = new int [A1.length+A2.length];
		int k=0;
		
		//podzia³ tablicy na tablice A1 i A2 wzglêdem wskaŸników q i r
		for (int i=0; i<d³A1;i++){
		A1[k] = A[i];
		System.out.println("tablica A1 ["+ i +"] = " + A1[k]);
		k++;
		}
		int l= 0 ;
		for (int j=d³A1; j<r+1 ; j++)
		{
			A2[l] = A[j];
			System.out.println("tablica A2 ["+ j +"] = " + A2[l]);
			l++;
		}
		
		//£¹czenie tablic
		int i=0;
		int j=0;
		int m=0;
		while (i<A1.length &&  j<A2.length)
		{
		if (A1[i]<A2[j]){
				pos[m]= A1[i];
				i++;
			}
			else{
				pos[m]= A2[j];
				j++;
			}
			m++;
				
		}
		
		//Gdy indeks którejœ z tablic wyjdzie poza jej d³ugoœæ.
		k=0; //zerowanie zmiennych pomocniczych k i l
		l=0;
		if(j==A2.length)
		{	
			for(k=i;k<A1.length;k++)
			
			pos[m]=A1[k];
			m++;
		}
		else 
			for(l=j;l<A2.length;l++){
				pos[m]=A2[l];
				m++;
			}
			
		//drukowanie posortowanej tablicy.
		for(i=0;i<pos.length;i++){
			System.out.println(pos[i]);
		}
		
	}

}
