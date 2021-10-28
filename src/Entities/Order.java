package Entities;

import java.util.Date;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrderStatus Status;
	
	public Order() {
		
	}

	public Order(Integer id, java.util.Date date, OrderStatus status) {
	
		this.id = id;
		this.moment = date;
		Status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", Status=" + Status + "]";
	}
	
 
	
}
