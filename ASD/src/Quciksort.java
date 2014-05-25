import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;


public class Quciksort {

	public static void main(String[] args) {
			//tablica od 0 do x
				int x=100000;
				int [] A = new int [x];
				for (int i=0;i<x;i++){
					A[i]=i;
				}
		
					//losowa tablica
				/*		 
				int x= 1000000;
				int [] A = new int[x];
				Random rand = new Random();
				for(int j=0;j<x;j++){
					A[j]= rand.nextInt(x);
					}

				 // tablica od x do 1 - nagorsza
			
				int x= 100000;
				int k=0;
				int [] A = new int[x];
				for (int j=x; j>0;j--){
					A[k] = j;
					k++;
				
				}
			*/	
		
		int r= A.length-1;
		int p = 0;
		//System.out.println("PRZED: "+Arrays.toString(A));
		long start= System.currentTimeMillis();
		Quciksort quick = new Quciksort();
		quick.Quicksort(A, p, r);
		long stop= System.currentTimeMillis();
		System.out.println("Czas działania:"+ (stop-start));
	//System.out.println("PO: "+Arrays.toString(A));

		
	}
	public void Quicksort(int [] A, int p, int r){
		if (p<r){
			Quciksort part = new Quciksort();
			int q = part.Partiton(A, p, r);
			Quicksort(A, p, q-1);
			Quicksort(A,q+1,r);
			
		}
	}
	
	
	public int Partiton(int [] A, int p, int r)
	{
		int x = A[r];
		int i = p-1;
		
		for(int j=p; j<=r-1;j++){
			 if(A[j]<=x){
				 i=i+1;
				 int pomoc = A[i];
					A[i]=A[j];
					A[j]= pomoc;
			 }
		}
		 int pomoc = A[i+1];
			A[i+1]=A[r];
			A[r]= pomoc;
			
			
			
		int q = i+1;			
		return q;
		
	}

	
}