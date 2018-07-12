package BubbleSortAlgorthm;

public class NewBubble {
	
	public static void main(String[] args)
	{
		int data[]= {30,40,1,21,56,78};
		
		BubbleAlgorthm bubbleObject = new BubbleAlgorthm(data);
		
		System.out.println("Before Sorting");
		bubbleObject.display();
		
		bubbleObject.bubbleSort();
		
		System.out.println("After Sorting");
		
		bubbleObject.display();
	}

}
