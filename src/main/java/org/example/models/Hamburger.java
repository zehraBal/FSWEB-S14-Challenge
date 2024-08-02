package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger(String breadRollType, String name,double price, String meat) {
        this.breadRollType = breadRollType;
        this.name = name;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }



    public String getMeat() {
        return meat;
    }



    public double getPrice() {
        double totalPrice = this.price;
        if (addition1Name != null) {
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
        }
        return totalPrice;
    }



    public String getBreadRollType() {
        return breadRollType;
    }



//    public String getAddition1Name() {
//        return addition1Name;
//    }

//    public void setAddition1Name(String addition1Name) {
//        this.addition1Name = addition1Name;
//    }
//
//    public String getAddition2Name() {
//        return addition2Name;
//    }
//
//    public void setAddition2Name(String addition2Name) {
//        this.addition2Name = addition2Name;
//    }
//
//    public String getAddition3Name() {
//        return addition3Name;
//    }
//
//    public void setAddition3Name(String addition3Name) {
//        this.addition3Name = addition3Name;
//    }
//
//    public String getAddition4Name() {
//        return addition4Name;
//    }
//
//    public void setAddition4Name(String addition4Name) {
//        this.addition4Name = addition4Name;
//    }
//
//    public double getAddition2Price() {
//        return addition2Price;
//    }
//
//    public void setAddition2Price(double addition2Price) {
//        this.addition2Price = addition2Price;
//    }
//
//    public double getAddition1Price() {
//        return addition1Price;
//    }
//
//    public void setAddition1Price(double addition1Price) {
//        this.addition1Price = addition1Price;
//    }
//
//    public double getAddition3Price() {
//        return addition3Price;
//    }
//
//    public void setAddition3Price(double addition3Price) {
//        this.addition3Price = addition3Price;
//    }
//
//    public double getAddition4Price() {
//        return addition4Price;
//    }
//
//    public void setAddition4Price(double addition4Price) {
//        this.addition4Price = addition4Price;
//    }

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }

    public void addHamburgerAddition2(String name,double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }

    public void addHamburgerAddition3(String name,double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }

    public void addHamburgerAddition4(String name,double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }

    public void itemizeHamburger(){
        StringBuilder builder =new StringBuilder();
        builder.append("Name: ").append(name).append("\n");
      //  builder.append("Price: ").append(price).append("\n");
        builder.append("Meat: ").append(meat).append("\n");
        builder.append("BreadRollType: ").append(breadRollType).append("\n");
        if(addition1Name!=null) builder.append("Addition1Name: ").append(addition1Name).append("\n");
        if(addition2Name!=null) builder.append("Addition2Name: ").append(addition2Name).append("\n");
        if(addition3Name!=null) builder.append("Addition3Name: ").append(addition3Name).append("\n");
        if(addition4Name!=null) builder.append("Addition4Name: ").append(addition4Name).append("\n");
        double check= price+addition1Price+addition2Price+addition3Price+addition4Price;
        builder.append("Price: ").append(check).append("\n");

        System.out.println(builder.toString());
    }
}
