package com.lit.codejam.q2010.A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://code.google.com/codejam/contest/351101/dashboard#s=p0
public class AStoreCredit {
	Integer creditAmount;
	Integer numberOfItems;
	ArrayList<Integer> listPrices;
	
	public Integer getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Integer creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Integer getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(Integer numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public ArrayList<Integer> getListPrices() {
		return listPrices;
	}

	public void setListPrices(ArrayList<Integer> listPrices) {
		this.listPrices = listPrices;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/A/A-large-practice.in"));
		//Scanner sc = new Scanner(new File("src/main/java/com/lit/codejam/q2010/A/A-small-practice.in"));
		Integer n = sc.nextInt();
		List<AStoreCredit> listStoreCredits = new ArrayList<AStoreCredit>();
		AStoreCredit storeCredit = null; 
		//System.out.println("==========================");
		Integer j = 1;
		for (int i = 0; i < (n * 3); i++) {
			//System.out.println("===="+j);
			if (j == 1) {
				storeCredit = new AStoreCredit();
				storeCredit.setCreditAmount(sc.nextInt());
			} else if ( j == 2 ) {
				storeCredit.setNumberOfItems(sc.nextInt());	
			} else if ( j == 3 ) {
				sc.nextLine();
				String priceList[] = sc.nextLine().split(" ");
				ArrayList<Integer> listPrices = new ArrayList<Integer>(); 
				for(String price: priceList){
					listPrices.add(Integer.parseInt(price));
				}
				storeCredit.setListPrices(listPrices);
				listStoreCredits.add(storeCredit);
				j = 1;
				continue;
			}
			j++;
		}
		
		for (int i = 0; i < listStoreCredits.size(); i++) {
			boolean found = false;
			for (int k = 0; k < listStoreCredits.get(i).getListPrices().size(); k++) {
				for (int j1 = 0; j1 < listStoreCredits.get(i).getListPrices().size(); j1++) {
					if((listStoreCredits.get(i).getListPrices().get(k) + 
						listStoreCredits.get(i).getListPrices().get(j1)) == listStoreCredits.get(i).getCreditAmount() && k!=j1){
						System.out.println("Case #" + (i + 1) + ": " + (k + 1) + " " + (j1 + 1));
						found = true;
						break;
					}
				}
				if(found) break;
			}
			found = false;
		}
		
	}
}
