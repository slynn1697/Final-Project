/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
import java.util.ArrayList;

public class OrderItemDA {
        
        // Array list to store all the orders
        private ArrayList<OrderItem> orderItems;

        /**
         * @param customers
         */
        public OrderItemDA() {
                this.orderItems = new ArrayList<>();
        }
        
        public void create(OrderItem object) {
                orderItems.add(object);
        }
        
        public ArrayList<OrderItem> GetAll() {
                return orderItems;
        }
}
