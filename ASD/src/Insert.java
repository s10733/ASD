import java.util.Arrays;
import java.util.Random;


public class Insert {

	public static void main(String[] args) {
		/*//tablica od 0 do x (najlepsza)
				int x=1000000;
				int [] A = new int [x];
				for (int i=0;i<x;i++){
					A[i]=i;
				}
				
					//losowa tablica (œrednia)
				int x= 100000;
				int [] A = new int[x];
				Random rand = new Random();
				for(int j=0;j<x;j++){
					A[j]= rand.nextInt(x);
				
				}
				*/
		 // tablica od x do 1 - nagorsza
				int x= 100000;
				int i=0;
				int [] A = new int[x];
				for (int j=x; j>0;j--){
					A[i] = j;
					i++;
				}
					
				long start= System.currentTimeMillis();	
	
	//System.out.println("Przed: "+ Arrays.toString(A));
		insertSort(A);
		//System.out.println("Po: "+ Arrays.toString(A));
		long stop = System.currentTimeMillis();
		 System.out.println("Czas dzia³ania:"+ (stop-start));
	}	
	public static void insertSort(int[] A){	
		int i,j,x =0;
		int n= A.length;
		for (i=n-2;i>=0;i--){
			x= A[i];
			j =i+1;
			while ((j<n) && (x>A[j])){
				A[j-1]= A[j];
				j++;
			}
			A[j-1]=x;
		}
		
	}
}
