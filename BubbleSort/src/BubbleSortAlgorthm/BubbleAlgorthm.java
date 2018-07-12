package BubbleSortAlgorthm;

public class BubbleAlgorthm {
	int temp=0;
	private int array[]= {30,40,1,21,56,78};


	public static void bubbleSort(int [] arr){
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j< arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
		
	}

		
		//array after bubble sort
	public static void display(int []arr) {
		System.out.println("Array after bubble sort");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] +" ");
		}
	}


		public BubbleAlgorthm(int[] array) {
		
			this.array = array;
		}	
			

}
