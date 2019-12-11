package org.java.app;

public enum DiscountSlabs {

	ZerotoFiveK(0) {
		@Override
		public float getFinalPrice(float price) {
			return price;
		}
	},
	FiveKtoTenK(10) {
		@Override
		public float getFinalPrice(float price) {
			return (price - (price * this.discount) / 100);
		}
	},
	TenKAndAbove(20) {
		@Override
		public float getFinalPrice(float price) {
			return (price - (price * this.discount) / 100);
		}
	};
	DiscountSlabs(float discount) {
		this.discount = discount;
	}
	
	protected float discount;

	public float getDiscount() {
		return discount;
	}

	public abstract float getFinalPrice(float price);
}
