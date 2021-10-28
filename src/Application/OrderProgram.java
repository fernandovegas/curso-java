package Application;

import java.util.Date;

import Entities.Order;
import Entities.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) {
		
		Order order = new Order(1080,new Date(), OrderStatus.Pending_payment);
		System.out.println(order);

	}

}
