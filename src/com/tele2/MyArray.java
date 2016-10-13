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
	
	public static int[] arrayFill(int[] ar){
		for (int i=0; i<ar.length;i++){
			ar[i] = i + 1;
		}
		
		return(ar);
	}
	
	
	public static int[] arrayShuffle(int[] ar){
		
		
		
		return(ar);
	}
	
	public static int[] arraySortBubble(int[] ar){
		
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar.length-i-1;j++){
				if(ar[j]>ar[j+1]) arraySwapElement(ar,j,j+1);
			}
		}
		
		return(ar);
	}
	
	public static int[] arraySortSelection(int[] ar){
		
		for(int i=0;i<ar.length-1;i++){
			
			int max_index = i;
			
			for(int j=0;i<ar.length-i;j++){
				if(ar[max_index] > ar[j]){
					max_index = j;
				}
			}
			
			arraySwapElement(ar,max_index,i);
		}
		
		return(ar);
	}
	
}