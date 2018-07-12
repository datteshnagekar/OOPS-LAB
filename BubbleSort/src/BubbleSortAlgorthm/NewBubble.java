package BubbleSortAlgorthm;

public class NewBubble {
	
	public static void main(String[] args)
	{
		int data[]= {30,40,1,21,56,78};
		
		// after removing object adn creating a static function dsfs
		
		System.out.println("Before Sorting");
		BubbleAlgorthm.display(data);
		
		BubbleAlgorthm.bubbleSort(data);
		
		System.out.println("After Sorting");
		
		BubbleAlgorthm.display(data);
	}

}
