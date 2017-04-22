package com.lit.codejam.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;

public class Util {
	public static void debug(Object obj){
		try {
			System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void permute(List<Integer> arr,ArrayList<List<Integer>> list, int k) { 
		for (int i = k; i < arr.size(); i++) {
			java.util.Collections.swap(arr, i, k);
			permute(arr, list, k + 1);
			java.util.Collections.swap(arr, k, i);
		}
	
		if (k == arr.size() - 1) {
			list.add(new ArrayList<Integer>(arr));
		}
	}
}
