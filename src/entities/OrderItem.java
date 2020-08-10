package entities;

public class OrderItem {
	
	//atributos
	private Integer quantity;
	private Double price;
	
	//metodo padrão
	public OrderItem() {
		
	}

	//metodo com atributos
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	//metodos GETTERS e SETTERS
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//metodo para retonar o subtotal
	public Double subTotal() {
		return quantity * price;
	}
	

}
