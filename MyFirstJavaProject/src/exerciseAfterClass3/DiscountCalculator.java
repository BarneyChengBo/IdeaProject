package exerciseAfterClass3;

public class DiscountCalculator {



    public static void main(String[] args) {
        //the price for each item
        //int x = 15;
        double pricePerItem = 15.0;
        //the amount of items
        int quantity = 12;

        double totalPrice = pricePerItem * quantity;

        if ( totalPrice >= 1000) {
            double finalPayment = totalPrice * 0.9;
            System.out.println("The payment will be " + finalPayment + " kr. " + " Discounts available.");
        } else {
            System.out.println("The payment will be " + totalPrice + " kr. " + " No discounts available.");
        }

    }



    public double calculateFinalPrice(int quantity, double unitPrice) {

        double finalPrice = quantity * unitPrice;

        if ( finalPrice >= 1000) {
            return finalPrice * 0.9;
        } else {
            return finalPrice;
        }
    }







}
