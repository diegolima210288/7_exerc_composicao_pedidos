package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	//atributos
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> itens = new ArrayList<OrderItem>();
	
	OrderItem orderItem = new OrderItem();
	
	//metodo padrão
	public Order() {
		
	}

	//metodo com argumentos
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	//metodos GETTERS e SETTERS
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	//metodo para adicionar itens da ordem
	public void addItem(OrderItem item) {
		itens.add(item);
	}
	
	//metodo para remover intes da ordem
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	//metodo para retornar o total
	public Double total() {
		double sum = 0.0;
		return sum += orderItem.subTotal();
	}
	

}
