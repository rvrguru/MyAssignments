package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2,2,5, 7, 7, 5, 9, 2, 3 };
		int lengthofArray=num.length;
		Arrays.sort(num);
		System.out.println("Length of the array: "+lengthofArray);
		System.out.println("Duplicate values are:" );

		for (int i=0;i<lengthofArray-1; i++)
		{
			if(num[i]== num[i+1])

					{
				System.out.println(num[i]);
					}
		}
		
		
	}

}
