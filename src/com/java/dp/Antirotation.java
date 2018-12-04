package com.java.dp;

public class Antirotation {

	public void antirotate() {

		int[] arr = { 1, 7, 6, 4, 11, 9, 15, 17, 24 };

		int[] antiarr = new int[arr.length];

		int antirotateindex = 3;
		int begindex = 0;
		for (int i = antirotateindex; i < arr.length; i++) {
			antiarr[begindex] = arr[i];
			begindex++;
		}

		for (int i = 0; i < antirotateindex; i++) {
			antiarr[begindex] = arr[i];
			begindex++;
		}

		for (int i = 0; i < antiarr.length; i++) {
			System.out.print(antiarr[i] + "\t");
		}
	}

	public static void main(String[] args) {
		new Antirotation().antirotate();

	}
}
