package org.java.app;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		float price;
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter final price of all products before discount: ");
        price = sc.nextInt();
        
        System.out.println("Final price of all products after discount is: "+getFinalPriceAfterDiscount(price));
	}
	
	public static float getFinalPriceAfterDiscount(float price){
		if (0 <= price && price<=5000){
        	return DiscountSlabs.ZerotoFiveK.getFinalPrice(price);
        }
		else if (5000 < price && price<=10000){
        	return DiscountSlabs.FiveKtoTenK.getFinalPrice(price);
        }
		else if (10000 < price){
        	return DiscountSlabs.TenKAndAbove.getFinalPrice(price);
        }
		return price;
	}

}
