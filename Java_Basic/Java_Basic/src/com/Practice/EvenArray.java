
package com.Practice;

import java.util.Arrays;

public class EvenArray {
	
	public static  void Even(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			arr[i]=1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		EvenArray.Even(arr);

	}

}
