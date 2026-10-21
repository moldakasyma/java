package task5;

public class Sort {
	static <E> void swap(E[]array,int i,int j) {
		E swap=array[j];
		array[j]=array[i];
		array[i]=swap;
		
	}
	static <E extends Comparable<E> > void BubbleSort(E[]array) {
		int n=array.length;
		for(int i=0; i<n; i++) {
			for(int j=1; j<(n-i); j++) {
				if(array[j-1].compareTo(array[j])==-1) {
						swap(array,j-1,j);
				}
				
			}
		}
	}
	static <E extends Comparable <E>> void QuickSort(E[] array,int low,int high) {
		if(low<high) {
			int partition=partition(array,low,high);
			QuickSort(array,low,partition-1);
			QuickSort(array,partition+1,high);
			
		}
	}
	static <E extends Comparable<E> > int partition(E[]array,int low,int high) {
		E pivot=array[high];
		int i=(low-1);
		for(int j=low; j<=high; j++) {
			if(array[j].compareTo(pivot)==-1) {
				i++;
				swap(array,i,j);
			}
		}
		swap(array,i+1,high);
		return i+1;
		
		 
	}
	



	

}
