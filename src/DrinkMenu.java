public class DrinkMenu {

    public static void main(String[] args) {

        Drink drink = new Drink();

        drink.name = "Mojito";
        drink.alcohol = true;
        drink.price = 15.50;
        drink.ingredients.partOneName = "White rum";
        drink.ingredients.partTwoName = "Sugar";
        drink.ingredients.partThreeName = "Lime";
        drink.ingredients.partOneVol = 0.2;
        drink.ingredients.partTwoVol = 0.2;
        drink.ingredients.partThreeVol = 0.4;


        System.out.println(drink.name+" "+ "is a popular drink");
        System.out.println("Contains alcohol? " + drink.alcohol);
        System.out.println("Price is: " + drink.price + " $");
        System.out.println("Ingredients : \n" + drink.ingredients.partOneName+ "(" + drink.ingredients.partOneVol +")");
        System.out.println(drink.ingredients.partTwoName + "(" +drink.ingredients.partTwoVol +")");
        System.out.println(drink.ingredients.partThreeName + "(" +drink.ingredients.partThreeVol +")");
    }
}
