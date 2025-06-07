package practice;

import java.util.Arrays;

public class task4 {
	public static void reversearray(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		
		System.out.println("before sorting "+Arrays.toString(arr));
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		
		}
		System.out.println("after sorting "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= {2,4,5,3,8,9,10};
		
		Arrays.sort(arr);
		reversearray(arr);
		
		System.out.println("decending order "+ Arrays.toString(arr));

	}

}
