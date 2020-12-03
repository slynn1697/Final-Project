/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class OrderSystem {

        public static void main(String[] args) {
                // Create customer Data Access Object
                CustomerDA customers = new CustomerDA();
                
                // Add  three customers
                customers.create(new Customer(100, "Mai", "Mark", "14145252"));
                customers.create(new Customer(101, "Peter", "Jo", "23636376373"));
                customers.create(new Customer(102, "David", "Rok", "4745843332"));
                
                // Create Product Data access object
                ProductDA products = new ProductDA();
                
                // Add three products
                products.create(new Product(200, "Apple Monitor", 10, 450.50));
                products.create(new Product(201, "iPhone", 5, 1199.99));
                products.create(new Product(202, "iPad", 7, 299.99));
                
                // create one order per customer
                OrderDA orders = new OrderDA();
                orders.create(new Order(300, 100, "12/02/2020"));
                orders.create(new Order(301, 101, "12/03/2020"));
                orders.create(new Order(302, 102, "12/04/2020"));
                
                // Add two items to each order
                OrderItemDA orderItems = new OrderItemDA();
                orderItems.create(new OrderItem(300, 400, 200, "Apple Monitor", 1, 450.50));
                orderItems.create(new OrderItem(300, 401, 201, "iPhone", 1, 1199.99));
                
                orderItems.create(new OrderItem(301, 402, 202, "iPad", 1, 299.99));
                orderItems.create(new OrderItem(301, 403, 201, "iPhone", 1, 1199.99));
                
                orderItems.create(new OrderItem(302, 404, 200, "Apple Monitor", 1, 450.50));
                orderItems.create(new OrderItem(302, 405, 202, "iPad", 2, 599.98));
                
                // Loop through the customers, print all the order and items per customer
                for(Customer cust: customers.GetAll()) {
                        System.out.println(cust.toString());
                        // Loop through and print customer order
                        for(Order order: orders.GetAll()) {
                                // verify if the order belong to current customer
                                if(order.getCustomerID() == cust.getCustomerID()) {
                                        // then print the order details
                                        System.out.println("\t" + order.toString());
                                        
                                        // print the order item
                                        for(OrderItem item: orderItems.GetAll()) {
                                                // verify if the order item belongs to this order
                                                if(item.getOrderNumber() == order.getOrderNumber()) {
                                                        System.out.println("\t\t" + item.toString());
                                                }                                               
                                        }
                                }
                        }
                        
                        System.out.println();
                }
                

        }

}