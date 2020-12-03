/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Product {
    // Private attributes
        private int productID;
        private String description;
        private int quantity;
        private double price;
        
        
        /**
         * @param productID
         * @param description
         * @param quantity
         * @param price
         */
        public Product(int productID, String description, int quantity, double price) {
                this.productID = productID;
                this.description = description;
                this.quantity = quantity;
                this.price = price;
        }


        /**
         * @return the productID
         */
        public int getProductID() {
                return productID;
        }


        /**
         * @return the description
         */
        public String getDescription() {
                return description;
        }


        /**
         * @return the quantity
         */
        public int getQuantity() {
                return quantity;
        }


        /**
         * @return the price
         */
        public double getPrice() {
                return price;
        }


        /**
         * @param productID the productID to set
         */
        public void setProductID(int productID) {
                this.productID = productID;
        }


        /**
         * @param description the description to set
         */
        public void setDescription(String description) {
                this.description = description;
        }


        /**
         * @param quantity the quantity to set
         */
        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }


        /**
         * @param price the price to set
         */
        public void setPrice(double price) {
                this.price = price;
        }


        @Override
        public String toString() {
                return "productID=" + productID + ", description=" + description + ", quantity=" + quantity
                                + ", price=" + price;
        }
}