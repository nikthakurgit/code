package org.java.app.test;

import static org.junit.Assert.*;

import org.java.app.ShoppingCart;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void validateFirstDiscountSlab(){
		assertEquals(5000.0,ShoppingCart.getFinalPriceAfterDiscount(5000),0);
	}
	@Test
	public void validateSecondDiscountSlab(){
		assertEquals(9000.0,ShoppingCart.getFinalPriceAfterDiscount(10000),0);
	}
	@Test
	public void validateThirdDiscountSlab(){
		assertEquals(12000.0,ShoppingCart.getFinalPriceAfterDiscount(15000),0);
	}
	
	public ShoppingCartTest(){
		
	}
}
