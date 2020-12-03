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

public class CustomerDA {
        
        // Arraylist to store all the customers
        private ArrayList<Customer> customers;

        /**
         * @param customers
         */
        public CustomerDA() {
                this.customers = new ArrayList<Customer>();
        }
        
        public void create(Customer object) {
                customers.add(object);
        }
        
        public ArrayList<Customer> GetAll() {
                return customers;
        }
}