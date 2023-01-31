package com.driver;

import javax.sound.midi.Soundbank;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;

    private int toppings;

    boolean isExtracheese;
    boolean isExtratoppings;
    boolean isTakeaway;
    boolean isBillGen;

//    private boolean takeaway = false;
//    private int toppingprice;
//    private int cheeseprice;
//
//    private int typeprice;
//
//    private int takeawayprice;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGen = false;
        this.isExtracheese = false;
        this.isExtratoppings = false;
        this.isTakeaway = false;
        this.bill = "";
        if(isVeg) {
            this.price = 300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings = 120;
        }
        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(!isExtracheese) {
            this.price = this.price+cheese;
            this.isExtracheese = true;
        }
    }

    public void addExtraToppings() {
       if(!isExtratoppings) {
           this.price = this.price+toppings;
           isExtratoppings = true;
        }
    }

    public void addTakeaway() {
       if(!isTakeaway) {
           this.price+=20;
           isTakeaway = true;
       }
    }

    public String getBill(){
           if(!isBillGen) {
               if(isExtracheese)
               this.bill += "Extra Cheese Added: "+ this.cheese+"\n";
               if(isExtratoppings)
                   this.bill += "Extra Toppings Added: "+ this.toppings+"\n";
               if(isTakeaway)
                   this.bill += "Paperbag Added: "+"20"+"\n";
               this.bill+= "Total Price: "+this.price;
               isBillGen= true;
           }

        return this.bill;
    }
}
