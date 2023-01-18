public class Drinks {
    final double COFFE_PRICE = 50;
    final double TEA_PRICE = 25;
    final double LEMONADE_PRICE = 30;
    final double MOHITO_PRICE = 40;
    final double MINERALWATER_PRICE = 15;
    final double COCACOLA_PRICE = 20;

    int drinksCount;
    double drinksCost;

    public Drinks() {
        drinksCount = 0;
        drinksCost = 0.0;
    }

    public void makeCofee(){
        drinksCount++;
        drinksCost+=COFFE_PRICE;
    }

    public void makeTea(){
        drinksCount++;
        drinksCost+=TEA_PRICE;
    }

    public void makeLemonade(){
        drinksCount++;
        drinksCost+=LEMONADE_PRICE;
    }
    public void makeMohito(){
        drinksCount++;
        drinksCost+=MOHITO_PRICE;
    }
    public void makeMineralWater(){
        drinksCount++;
        drinksCost+=MINERALWATER_PRICE;
    }
    public void makeCocaCola(){
        drinksCount++;
        drinksCost+=COCACOLA_PRICE;
    }

    public int getDrinksCount(){
        return drinksCount;
    }

    public double getDrinksCost(){
        return drinksCost;
    }
    public double getPrice(DrinksMachine typeDrink){

        switch (typeDrink){
            case TEA -> {return TEA_PRICE;}
            case COFFEE -> {return COFFE_PRICE;}
            case MOHITO -> {return MOHITO_PRICE;}
            case COCACOLA -> {return COCACOLA_PRICE;}
            case LEMONADE -> {return LEMONADE_PRICE;}
            case MINERALWATER -> {return MINERALWATER_PRICE;}

        }
        return 0.0;
    }
}
