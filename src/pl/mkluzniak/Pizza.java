package pl.mkluzniak;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;


    Pizza(String bread) { //constructor of 1 ingredient of pizza

        this.bread = bread;


    }

    Pizza(String bread, String sauce) { //constructor of 2 ingredient of pizza

        this.bread = bread;
        this.sauce = sauce;

    }

    Pizza(String bread, String sauce, String cheese) { //constructor of 3 ingredient of pizza

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce, String cheese, String topping) { //constructor of 4 ingredient of pizza

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }
}
