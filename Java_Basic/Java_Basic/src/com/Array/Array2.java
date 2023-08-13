package com.Array;

import java.util.Arrays;

public class Array2 {

	public void changeToggle(char ch[]) 
	{
		for (int i = 0; i < ch.length; i++) 
		{
			if (ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i] = (char) (ch[i] + 32);
			} else if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				ch[i] = (char) (ch[i] - 32);
			} else {
				ch[i] = ch[i];
			}

		}

		System.out.println(Arrays.toString(ch));

	}

	public static void main(String[] args) {

		char ch[] = { 'a', 'B', 'c', 'D', 'e' };
		System.out.println(Arrays.toString(ch));
		Array2 al = new Array2();
		al.changeToggle(ch);

	}

}
