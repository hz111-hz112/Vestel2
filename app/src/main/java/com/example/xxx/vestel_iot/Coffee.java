package com.example.xxx.vestel_iot;

public class Coffee {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Coffee[] coffees = {
            new Coffee("Turkish Coffee", "Prepared using very finely ground coffee beans, unfiltered. " +
                    "The same method is used in many Middle Eastern and Southeastern European countries.", R.drawable.turkish),
            new Coffee("Café Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Coffee("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
            new Coffee("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter),
            new Coffee("Caffè Americano", "Drink preapared by diluting an espresso with hot water", R.drawable.americano),
            new Coffee("Espresso", "Brewed by expressing or forcing a small amount of nearly boiling water " +
                    "under pressure through finely ground coffee beans.", R.drawable.espresso),
            new Coffee("Flat White", "Coffee drink consisting of espresso with microfoam", R.drawable.flatwhite),
            new Coffee("Latte Macchiato", "The name literally means stained milk. This refers to the method of preparation, " +
                    "wherein the milk is \"stained\" by the addition of espresso.", R.drawable.macchiato),
            new Coffee("Caffè mocha", "Also called mocaccino, is a chocolate-flavored variant of a caffè latte", R.drawable.mocha),
            new Coffee("Doppio", "Doppio espresso is a double shot, extracted using a double coffee filter in the portafilter.", R.drawable.doppio),
            new Coffee("Breve", "Espresso served with half milk and half cream.", R.drawable.doppio),
            new Coffee("Cortado", "An espresso cut with a small amount of warm milk to reduce the acidity.", R.drawable.cortado),
            new Coffee("Eiskaffee", "A German drink made with iced coffee and vanilla ice cream.", R.drawable.eiskaffee),
            new Coffee("Chai Latte", "Espresso mixed with spiced tea and steamed milk.", R.drawable.chailatte),
            new Coffee("Cafe Bombon", "Popularized in Spain, this drink is an espresso made with sweetened condensed milk.", R.drawable.cafebombon),


    };

    // Each drink has a name, description, and an image resource

    public Coffee(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }


}