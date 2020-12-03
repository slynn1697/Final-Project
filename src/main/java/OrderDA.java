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

public class OrderDA {
        
        // Array list to store all the orders
        private ArrayList<Order> Orders;

        /**
         * @param customers
         */
        public OrderDA() {
                this.Orders = new ArrayList<>();
        }
        
        public void create(Order object) {
                Orders.add(object);
        }
        
        public ArrayList<Order> GetAll() {
                return Orders;
        }
}