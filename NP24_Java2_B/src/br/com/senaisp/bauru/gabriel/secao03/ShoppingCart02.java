package br.com.senaisp.bauru.gabriel.secao03;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity. 
        
        double price = 5.00;
        double tax = 0.05;		
        int quantity = 90;
        
        
        // Declare and assign a calculated totalPrice
        
        double totalPrice = price * quantity * (1+tax);
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+ quantity + " of the " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        message = "Total : $" + totalPrice;
        System.out.println(message);
        
    }    
}
