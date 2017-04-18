package com.lit.codejam.util;

import com.google.gson.GsonBuilder;

public class Debug {
	public static void toJson(Object obj){
		try {
			System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
