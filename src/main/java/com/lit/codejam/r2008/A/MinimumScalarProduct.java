package com.lit.codejam.r2008.A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://code.google.com/codejam/contest/32016/dashboard#s=p0
public class MinimumScalarProduct {

	public static final String OUTPUTSTR = "Case #$$: ";

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/r2008/A/A-small-practice.in"));
		// Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/r2008/A/A-large-practice.in"));
		// Scanner sc = new Scanner(System.in);
		Integer line = sc.nextInt();
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < line; i++) {
			Integer arraySize = sc.nextInt();

			//=================get first array and sort
			Long firstArray[] = new Long[arraySize];
			for (int j = 0; j < arraySize; j++) {
				firstArray[j] = sc.nextLong();
			}
			Arrays.sort(firstArray);

			//=================get second array and sort reverse
			Long secondArray[] = new Long[arraySize];
			for (int j = 0; j < arraySize; j++) {
				secondArray[j] = sc.nextLong();
			}
			Arrays.sort(secondArray, Collections.reverseOrder());
			
			//=================calculate scalar			
			Long sum = 0L ;
			for (int z = 0; z < arraySize; z++) {
				sum += firstArray[z] * secondArray[z];
			}
			strBuffer.append(OUTPUTSTR.replace("$$", String.valueOf(i + 1)) + sum + "\n");
		}
		System.out.println(strBuffer.toString());
	}
}
