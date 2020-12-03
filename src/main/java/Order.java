/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Order {
     // Private attributes
        private int orderNumber;
        private int customerID;
        private String orderDate;
        
        
        
        /**
         * @param orderNumber
         * @param customerID
         * @param orderDate
         */
        public Order(int orderNumber, int customerID, String orderDate) {
                this.orderNumber = orderNumber;
                this.customerID = customerID;
                this.orderDate = orderDate;
        }
        /**
         * @return the orderNumber
         */
        public int getOrderNumber() {
                return orderNumber;
        }
        /**
         * @return the customerID
         */
        public int getCustomerID() {
                return customerID;
        }
        /**
         * @return the orderDate
         */
        public String getOrderDate() {
                return orderDate;
        }
        /**
         * @param orderNumber the orderNumber to set
         */
        public void setOrderNumber(int orderNumber) {
                this.orderNumber = orderNumber;
        }
        /**
         * @param customerID the customerID to set
         */
        public void setCustomerID(int customerID) {
                this.customerID = customerID;
        }
        /**
         * @param orderDate the orderDate to set
         */
        public void setOrderDate(String orderDate) {
                this.orderDate = orderDate;
        }
        
        
        @Override
        public String toString() {
                return "orderNumber=" + orderNumber + ", customerID=" + customerID + ", orderDate=" + orderDate;
        }
        
        

}