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

public class ProductDA {
        
        // Array list to store all the orders
        private ArrayList<Product> products;

        /**
         * @param customers
         */
        public ProductDA() {
                this.products = new ArrayList<>();
        }
        
        public void create(Product object) {
                products.add(object);
        }
        
        public ArrayList<Product> GetAll() {
                return products;
        }
}