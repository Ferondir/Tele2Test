package com.tele2;

public class Main{
	public static void main(String[] args){
		
		
		int[] array = {1,5,1,0,0,2,7,7,2,5};
		
		MyArray.arrayPrint(array);
		
		MyArray.arrayReverse(array);
		MyArray.arrayPrint(array);
		
		//MyArray.arrayFill(array);
		MyArray.arrayPrint(array);
		
		MyArray.arraySortBubble(array);
		MyArray.arrayPrint(array);
		
		int[] array2 = {1,5,1,0,0,2,7,7,2,5};
		MyArray.arrayPrint(array2);
		
		MyArray.arraySortSelection(array);
		MyArray.arrayPrint(array);
		
		
		/*
		for (int i=0; i<10;i++){
			System.out.println("I love you Tanya");
		}
		*/
	}
}