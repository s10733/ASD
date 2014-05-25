import java.util.Arrays;
import java.util.Random;


public class Heapify {

	
	public static void main(String[] args) {
		
		
		
		int x = 10;
		// int [] A = pokolei(x);	
		int [] A = losowa(x);
		// int [] A = odwrocona(x);
		   
		
	
	//**********************************************//
   //				Heap-sort			     	   //
  //**********************************************//
	
	
	System.out.println("Przed: "+ Arrays.toString(A));
	
	long start= System.currentTimeMillis();	

	for(int i=A.length;i>1;i--){
	heapsort(A,i-1);
	}
	
	System.out.println("Po: "+ Arrays.toString(A));
	 long stop = System.currentTimeMillis();
	 System.out.println("Czas dzia³ania Heap-Sort:"+ (stop-start));
		
	 
		
		//**********************************************//
	   //				Insert-sort			    	   //
	  //**********************************************//
			

		long startInsert= System.currentTimeMillis();	
		System.out.println("Przed: "+ Arrays.toString(A));
		insertSort(A);
		System.out.println("Po: "+ Arrays.toString(A));
		long stopInsert = System.currentTimeMillis();
		System.out.println("Czas dzia³ania INSERT:"+ (stopInsert-startInsert));
	
	 
	 //**********************************************//
	//				Merge-sort	       			    //
   //**********************************************//
	
	 long startMerge= System.currentTimeMillis();	
	//	System.out.println("Przed: "+ Arrays.toString(A));
		
	 mergeSort(A);
//	System.out.println("Po: "+ Arrays.toString(A));
	long stopMerge = System.currentTimeMillis();
	System.out.println("Czas dzia³ania Merge-Sort:"+ (stopMerge-startMerge));
	 
	 
	
	//**********************************************//
   //				Quick-sort		     		   //
  //**********************************************//
		 
	;		 
	int r= A.length-1;
	int p = 0;
	//System.out.println("PRZED: "+Arrays.toString(A));
	long startQuick= System.currentTimeMillis();
	Quciksort quick = new Quciksort();
	quick.Quicksort(A, p, r);
	long stopQuick= System.currentTimeMillis();
	System.out.println("Czas dzia³ania Quicksorta:"+ (stopQuick-startQuick));
	//System.out.println("PO: "+Arrays.toString(A));
	 
	

	
	}
	
	
	
	
	//**********************************************//
   //		METODA-	Heap-sort			     	   //
  //**********************************************//
	
	public static void  heapsort(int [] A, int lenght){
		int i;
		int largest ;
		int pomoc ;
		int dlugosc = (lenght-1)/2;
	
		for(int j = dlugosc; j>=0; j--){
			for(i=dlugosc;i>=0;i--){
				int left = (2*i)+1;
				int right = (2*i)+2;
				if((left <=lenght) && (right<=lenght)){
			
			if(A[right] >= A[left]){
				largest=right;
			}
			else
			{
				largest=left;
			}
		}
		else{
			if(right>lenght){
				largest=left;
			}
			else{
				largest=right;
			}
		}
		
		if(A[largest] > A[i])
		{
			pomoc = A[largest];
			A[largest]= A[i];
			A[i]= pomoc;
			
		}
		}
		}
		
		pomoc = A[0];
		A[0]= A[lenght];
		A[lenght]= pomoc;
		
		
	}

	
	//**********************************************//
   //				METODA-INSERT-SORT      	   //
  //**********************************************//
	
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
	
	//**********************************************//
   //				METODA Merge-Sort              //
  //**********************************************//

	
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
	
	//**********************************************//
   //				METODA Quick-Sort			   //
  //**********************************************//
	
	public static void Quicksort(int [] A, int p, int r){
		if (p<r){
			Quciksort part = new Quciksort();
			int q = part.Partiton(A, p, r);
			Quicksort(A, p, q-1);
			Quicksort(A,q+1,r);
			
		}
	}
	
	
	public static int Partiton(int [] A, int p, int r)
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
	
	public static int [] poKolei( int x){
	
			
			int [] A = new int [x];
			for (int i=0;i<x;i++){
				A[i]=i;
			}
		
			return A;	
	}
	
	public static int [] losowa(int x){
		
	
			 
			
			int liczby=10000;
			int [] A = new int[x];
			Random rand = new Random();
			for(int j=0;j<x;j++){
				
				A[j]= rand.nextInt(liczby);
			}
			return A;
		
	}
	
	public static int [] odwrocona(int x){
		
		 
		int k=0;
		int [] A = new int[x];
		for (int j=x; j>0;j--){
			A[k] = j;
			k++;
		
		}
		
		return A;
	}

}