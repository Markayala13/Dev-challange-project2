package org.example;

public class Auto {

    private String brand;
    private String model;
    private int year;
    private double price;
    private double discount;
    private double finalPrice;

    ////////////SHOW DETAILS AND APPLYDESCOUNT BELING TO CLASS AUTO
    void showDetails() {
        System.out.println("The brand is : " + brand);
        System.out.println("The model is: " + model);
        System.out.println("The year of the car is: " + year);
        System.out.println("The price of the car is: " + price);
        System.out.println("The discount of the car is the: " + discount + "%");
      

    }

    double applyDiscount() {

        return (price*discount/100);
        
    }
    double getFinalPrice(){
        return  price-applyDiscount();
    }

    public static void main(String[] args) {
        Auto dealerShip = new Auto();

        dealerShip.brand = "Kia";
        dealerShip.model = "Forte GT";
        dealerShip.year = 2022;
        dealerShip.price = 30000;
        dealerShip.discount=10;

        dealerShip.showDetails();
        dealerShip.applyDiscount();
        dealerShip.getFinalPrice();
        System.out.println("The discount applied is: "+dealerShip.applyDiscount());
        System.out.println("Your final price is: "+ dealerShip.getFinalPrice());
    }
}
