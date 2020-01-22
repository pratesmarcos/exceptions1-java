package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	private Product1 product;

	public OrderItem() {
	}

	public OrderItem(Integer quntity, Double price) {
		this.quantity = quntity;
		this.price = price;
	}

	public Integer getQuntity() {
		return quantity;
	}

	public void setQuntity(Integer quntity) {
		this.quantity = quntity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product1 getProduct() {
		return product;
	}

	public void setProduct(Product1 product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + String.format("%2.f", price
				+ ", Quantity: " + quantity + 
				", Subtotal: $" + String.format("%2.f", subTotal()));
	}

}
