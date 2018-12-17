package com.java.dp;

public class Rotation {
	private void rotate() {

		int[] arr = {2,5,6,3,1 };

		int rotatedArr[] = new int[arr.length];

		int rotateIndex = 2;
		int begIndex = 0;
		for (int i = arr.length - rotateIndex; i < arr.length; i++) {
			rotatedArr[begIndex] = arr[i];
			begIndex++;
		}

		for (int i = 0; i < arr.length - rotateIndex; i++) {
			rotatedArr[begIndex] = arr[i];
			begIndex++;
		}

		for (int i = 0; i < rotatedArr.length; i++) {
			System.out.print(rotatedArr[i] + "\t");
		}
	}

	public static void main(String[] args) {
		new Rotation().rotate();
	}
}
