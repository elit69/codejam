package com.lit.codejam.q2010.B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://code.google.com/codejam/contest/351101/dashboard#s=p1
public class ReverseWords {
	
	public static final String OUTPUTSTR = "Case #$$: ";
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/B/B-small-practice.in"));
		Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/B/B-large-practice.in"));
		//Scanner sc = new Scanner(System.in);
		Integer line = sc.nextInt();
		sc.nextLine(); 
		for (int i = 0; i < line; i++) {
			String strArrTmp[] = sc.nextLine().split(" ");
			StringBuffer strBuffer = new StringBuffer();
			strBuffer.append(OUTPUTSTR.replace("$$", String.valueOf(i + 1)));
			for (int j = strArrTmp.length; j > 0; j--) {
				strBuffer.append(strArrTmp[j - 1] + " ");
			}
			System.out.println(strBuffer.toString());
		}
	}
}
