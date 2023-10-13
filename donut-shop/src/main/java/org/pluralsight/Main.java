package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to our donut shop!");

        Donut myDonuts[]= new Donut[6];
        myDonuts[0]= new Donut("Jelly",170,2.50,"A delicious raspberry jelly-filled donut");
        myDonuts[1]= new Donut("Jelly",170,2.50,"A delicious raspberry jelly-filled donut");
        myDonuts[2]= new Donut("Apple Cider",210,3.50,"An amazing fusion of apples and cinnamon");
        myDonuts[3]= new Donut("Apple Cider",210,3.50,"An amazing fusion of apples and cinnamon");
        myDonuts[4]= new Donut("Oreo Crumble",300,3.00,"Our signature donut,baked and topped with oreos");
        myDonuts[5]= new Donut("Oreo Crumble",300,3.00,"Our signature donut, baked and topped with oreos");

        double totalPrice= 0.00;
        for (Donut d: myDonuts) {
            System.out.println(d.type + " " + d.description + " "+ d.price);
            totalPrice+= d.price;
        }
        System.out.printf("Your total is: $%.2f" , totalPrice);
    }
}
