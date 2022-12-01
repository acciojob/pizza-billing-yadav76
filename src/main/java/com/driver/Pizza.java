package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;

    private int extraToppingsPrice;

    private int takeAwayPrice;

    private boolean isCheeseAdded;

    private boolean isToppingsAdded;

    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.extraCheesePrice = 80;

        this.takeAwayPrice = 20;

        this.isVeg = isVeg;
        if (isVeg == true) {
            this.price = 300;
            this.extraToppingsPrice = 70;
        }else {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }

        // No matter what type of pizza it is base prize is always printed
        this.bill = "Base Price Of The Pizza: "+this.price + "\n";

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isCheeseAdded == false) {
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true;   // I don't want to add it again and again
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isToppingsAdded == false) {
            this.price = this.price + this.extraToppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isTakeAwayAdded == false) {
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (isBillGenerated == false) {

            isBillGenerated = true;

            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingsAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "PaperBag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " +this.price + "\n";
        }
        return this.bill;
    }
}
