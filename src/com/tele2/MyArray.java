package com.tele2;

public class MyArray{
	
	private static int[] arraySwapElement(int[] ar, int first_element, int second_element){
		int tmp = ar[first_element];
		ar[first_element] = ar[second_element];
		ar[second_element] = tmp;
		
		return(ar);
	}
	
	public static int[] arrayPrint(int[] ar){
		for (int a : ar){
			System.out.print(a + " ");
		}
		
		System.out.print("\n");
		
		return(ar);
	}
	
	public static int[] arrayReverse(int[] ar){
		for (int i=0; i<=ar.length/2;i++){
			arraySwapElement(ar,i,ar.length-i-1);
		}
		
		return(ar);
	}
	
}