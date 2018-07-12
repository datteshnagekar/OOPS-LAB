package BubbleSortAlgorthm;

public class BubbleAlgorthm {
	int temp=0;
	private int array[]= {30,40,1,21,56,78};
	int n = array.length;

	public void bubbleSort(){
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j< n-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			
		}
		
	}

		
		//array after bubble sort
	public void display() {
		System.out.println("Array after bubble sort");
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i] +" ");
		}
	}


		public BubbleAlgorthm(int[] array) {
		
			this.array = array;
		}	
			

}
