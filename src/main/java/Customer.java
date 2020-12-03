/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Customer {
      // Private attributes
        private int customerID;
        private String firstName;
        private String lastName;
        private String phone;
        
        /**
         * @param customerID
         * @param firstName
         * @param lastName
         * @param phone
         */
        public Customer(int customerID, String firstName, String lastName, String phone) {
                this.customerID = customerID;
                this.firstName = firstName;
                this.lastName = lastName;
                this.phone = phone;
        }
        /**
         * @param customerID the customerID to set
         */
        public void setCustomerID(int customerID) {
                this.customerID = customerID;
        }
        /**
         * @param firstName the firstName to set
         */
        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }
        /**
         * @param lastName the lastName to set
         */
        public void setLastName(String lastName) {
                this.lastName = lastName;
        }
        /**
         * @param phone the phone to set
         */
        public void setPhone(String phone) {
                this.phone = phone;
        }
        /**
         * @return the customerID
         */
        public int getCustomerID() {
                return customerID;
        }
        /**
         * @return the firstName
         */
        public String getFirstName() {
                return firstName;
        }
        /**
         * @return the lastName
         */
        public String getLastName() {
                return lastName;
        }
        /**
         * @return the phone
         */
        public String getPhone() {
                return phone;
        }
        
        @Override
        public String toString() {
                return "customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone="
                                + phone;
        }       
        
}