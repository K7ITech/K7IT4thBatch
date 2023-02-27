package com.k7it;

public class ArrayMatrix1 {

	public static void main(String[] args) {

		int a[][] = new int[4][4];
		int value = 1;
		for (int i = 0; i < 4; i++) {
		    System.out.println(a[i][4 - 1 - i]);{
				for (int j = 0; j < 4; j++) {

				
				}

				a[i][j] = value;
				value++;

					System.out.print(a[i][j]);
		    } else
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
}
