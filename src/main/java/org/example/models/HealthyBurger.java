package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String breadRollType, double price,String name) {
        super(breadRollType, name,price, "Tofu" );
    }

    @Override
    public double getPrice(){
        double totalPrice=super.getPrice();
        if(healthyExtra1Name!=null) {
            totalPrice += healthyExtra1Price;
        }
        if(healthyExtra2Name!=null){
            totalPrice += healthyExtra2Price;
        }

        return totalPrice;
    }

    public void addHealthyAddition1(String name,double price){
       this.healthyExtra1Name=name;
       this.healthyExtra1Price=price;

    }

    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;

    }

     @Override
    public void itemizeHamburger(){
         StringBuilder builder =new StringBuilder();
         builder.append("Name: ").append(super.getName()).append("\n");
         builder.append("Meat: ").append("tofu").append("\n");
         builder.append("BreadRollType: ").append(super.getBreadRollType()).append("\n");
         if(healthyExtra1Name!=null) builder.append("HealthyAddition1: ").append(healthyExtra1Name).append("\n");
         if(healthyExtra2Name!=null) builder.append("HealthyAddition2: ").append(healthyExtra1Name).append("\n");
         double check=super.getPrice()+healthyExtra1Price+healthyExtra2Price;
         builder.append("Price: ").append(check).append("\n");
         System.out.println(builder.toString());
    }

}
