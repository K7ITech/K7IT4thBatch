package com.k7it;

public class ArrayRightDiagonal {

	public static void main(String[] args) {

		int a[][] = new int[4][4];
		int value = 1;
		int size = 4;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = value;
				value++;
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i + j == size - 1) {

					System.out.print(a[i][j] + "\t");
				} else {
					System.out.print("*" + "\t");
				}

			}
			System.out.println("");

		}

	}

}
