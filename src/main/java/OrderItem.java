/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class OrderItem {
    // Private attributes
                private int orderNumber;
                private int lineNumber;
                private int productID;
                private String productDesc;
                private int quantity;
                private double price;
                
                /**
                 * @param orderNumber
                 * @param lineNumber
                 * @param productID
                 * @param productDesc
                 * @param quantity
                 * @param price
                 */
                public OrderItem(int orderNumber, int lineNumber, int productID, String productDesc, int quantity, double price) {
                        this.orderNumber = orderNumber;
                        this.lineNumber = lineNumber;
                        this.productID = productID;
                        this.productDesc = productDesc;
                        this.quantity = quantity;
                        this.price = price;
                }

                /**
                 * @return the orderNumber
                 */
                public int getOrderNumber() {
                        return orderNumber;
                }

                /**
                 * @return the lineNumber
                 */
                public int getLineNumber() {
                        return lineNumber;
                }

                /**
                 * @return the productID
                 */
                public int getProductID() {
                        return productID;
                }

                /**
                 * @return the productDesc
                 */
                public String getProductDesc() {
                        return productDesc;
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
                 * @param orderNumber the orderNumber to set
                 */
                public void setOrderNumber(int orderNumber) {
                        this.orderNumber = orderNumber;
                }

                /**
                 * @param lineNumber the lineNumber to set
                 */
                public void setLineNumber(int lineNumber) {
                        this.lineNumber = lineNumber;
                }

                /**
                 * @param productID the productID to set
                 */
                public void setProductID(int productID) {
                        this.productID = productID;
                }

                /**
                 * @param productDesc the productDesc to set
                 */
                public void setProductDesc(String productDesc) {
                        this.productDesc = productDesc;
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
                        return "orderNumber=" + orderNumber + ", lineNumber=" + lineNumber + ", productID=" + productID
                                        + ", productDesc=" + productDesc + ", quantity=" + quantity + ", price=" + price;
                }
}