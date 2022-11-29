package com.driver;

import javax.sound.midi.Soundbank;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese = false;

    private boolean toppings = false;

    private boolean takeaway = false;
    private int toppingprice;
    private int cheeseprice;

    private int typeprice;

    private int takeawayprice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg==true) {
            this.typeprice = 300;
            this.price = this.price+this.typeprice;
        }
        else {
            this.typeprice = 400;
            this.price = this.price+this.typeprice;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(cheese == false) {
            this.cheeseprice = 80;
            this.price = this.price + this.cheeseprice;
        }
        cheese = true;
    }

    public void addExtraToppings() {
        toppings = true;
        if (toppings == true) {
            if (isVeg == true) {
                this.toppingprice = 70;
                this.price = this.price + this.toppingprice;
            } else {
                this.toppingprice = 120;
                this.price = this.price + this.toppingprice;
            }
        }
    }

    public void addTakeaway() {
        if (takeaway == false) {
            this.takeawayprice = 20;
            this.price = this.price + this.takeawayprice;
        }
        takeaway = true;
    }

    public String getBill(){
            System.out.println("Base Price Of The Pizza:"+typeprice);
            if(cheese==true) {
                System.out.println("Extra Cheese Added:"+cheeseprice);
            }
            if(toppings==true) {
                System.out.println("Extra Toppings Added:"+toppingprice);
            }
            if(takeaway==true) {
                System.out.println("Paperbag Added:"+takeawayprice);
            }
            this.bill = Integer.toString(this.price);
        return this.bill;
    }
}
