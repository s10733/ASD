import java.util.Arrays;
import java.util.Random;


public class MergeSort {
	
	public static void main(String[] args) {
	/*	//tablica od 0 do x
		int x=1000000;
		int [] A = new int [x];
		for (int i=0;i<x;i++){
			A[i]=i;
		}
	
		//losowa tablica
	
			int x= 1000000;
				int [] A = new int[x];
				Random rand = new Random();
				for(int j=0;j<x;j++){
					A[j]= rand.nextInt(x);
				
				}
				*/	
		 // tablica od x do 1 - nagorsza
		int x= 1000000;
		int i=0;
		int [] A = new int[x];
		for (int j=x; j>0;j--){
			A[i] = j;
			i++;
		}
	
		long start= System.currentTimeMillis();	
	//	System.out.println("Przed: "+ Arrays.toString(A));
	mergeSort(A);
	//System.out.println("Po: "+ Arrays.toString(A));
	long stop = System.currentTimeMillis();
	 System.out.println("Czas dzia³ania:"+ (stop-start));
	}
	
	
	public static int[] left(int [] A){
		int p = A.length/2;
		int [] left = new int[p];
		for (int i=0; i<p;i++){
			left[i] = A[i];
		}
		return left;
	}
	
	public static int[] right(int [] A ){
		int p = A.length/2;
		int r = A.length -p;
		int [] right = new int [r];
		for(int i=0; i<r;i++){
			right[i] = A[i+p];
		}
		return right;
	}
	
	
	public static void mergeSort(int A[]){
		if (A.length>1){
			
			int [] lewaPolowa = left(A);
			int [] prawaPolowa = right(A);
			
			
			mergeSort(lewaPolowa);
			mergeSort(prawaPolowa);
			merge(A,lewaPolowa,prawaPolowa);
		}
		
	}

	public static void merge(int[] B, int[] lewaPolowa, int[] prawaPolowa){
		int j = 0;	
		int k= 0;
		for(int i =0; i<B.length; i++){	
		if(k >= prawaPolowa.length || (j < lewaPolowa.length && lewaPolowa[j] <=prawaPolowa[k])){
			B[i]=lewaPolowa[j];
			j++;
		 }
		else
		{
			B[i]=prawaPolowa[k];
			k++;
		}
		}
	}
	
}
