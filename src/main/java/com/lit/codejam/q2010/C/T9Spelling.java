package com.lit.codejam.q2010.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//https://code.google.com/codejam/contest/351101/dashboard#s=p2
public class T9Spelling {

	public static final String OUTPUTSTR = "Case #$$: ";

	public static final Map<String, String> mapT9;

	static {
		mapT9 = new HashMap<String, String>();
		mapT9.put("abc", "2");	
		mapT9.put("def", "3");		
		mapT9.put("ghi", "4");	
		mapT9.put("jkl", "5");	
		mapT9.put("mno", "6");
		mapT9.put("pqrs", "7");
		mapT9.put("tuv", "8");
		mapT9.put("wxyz", "9");
		mapT9.put(" ", "0");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/C/C-small-practice.in"));
		Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/C/C-large-practice.in"));
		//Scanner sc = new Scanner(System.in);
		Integer line = sc.nextInt();
		sc.nextLine();
		Set<String> keys = mapT9.keySet();
		for (int i = 0; i < line; i++) {
			StringBuffer strBuffer = new StringBuffer();
			strBuffer.append(OUTPUTSTR.replace("$$", String.valueOf(i + 1)));
			for (Character tmp : sc.nextLine().toCharArray()) {
				String strTmp = strBuffer.toString();
				String lastChar = strTmp.substring(strTmp.length() - 1);
				for (String key : keys) {
					for (int j = 0; j < key.length(); j++) {
						Character charKey = key.charAt(j);
						if (charKey.equals(tmp.charValue())) {
							if (lastChar.equals(mapT9.get(key))) {
								strBuffer.append(" ");
							}
							for (int k = 0; k < j + 1; k++) {
								strBuffer.append(mapT9.get(key));
							}
						}
					}
				}
			}
			System.out.println(strBuffer.toString());
		}
	}
}
