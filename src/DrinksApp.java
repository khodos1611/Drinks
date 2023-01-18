import java.util.Scanner;
public class DrinksApp {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int wantedDrinksCount;

        Drinks drinkObject = new Drinks();

        System.out.println("Введіть кількість напоїв, яку ви хочете придбати :");
        wantedDrinksCount = scanner.nextInt();

        System.out.println("Готуємо наступні напої:");

        DrinksMachine[] drinks = DrinksMachine.values();
        for (DrinksMachine s : drinks) {
            System.out.println(s.name()+" - " + drinkObject.getPrice(s));
        }

        System.out.println("Щоб завершити на меншій кількості напоїв -  введіть EXIT)");

        for (int i = 0; i < wantedDrinksCount; i++) {

            System.out.println("Введіть назву напію №"+(i+1)+":");

            String drinksChoice = scanner.next();

            drinksChoice = drinksChoice.toUpperCase();

            if (drinksChoice.equals("EXIT")) break;

            boolean wrongChoice = true;

            for (DrinksMachine s : drinks) {
                if (drinksChoice.equals(s.name())){
                    wrongChoice = false;
                }
            }

            if (wrongChoice) {
                System.out.println("Ви ввели невірну назву напою. Спробуйте ще раз, або введіть EXIT");
                i--;
                continue;
            }

            DrinksMachine drinkEnumValue = DrinksMachine.valueOf(drinksChoice);

            switch (drinkEnumValue){
                case TEA -> drinkObject.makeTea();
                case COFFEE -> drinkObject.makeCofee();
                case LEMONADE -> drinkObject.makeLemonade();
                case MOHITO -> drinkObject.makeMohito();
                case MINERALWATER -> drinkObject.makeMineralWater();
                case COCACOLA -> drinkObject.makeCocaCola();
            }
        }

        System.out.println("Замовлено напоїв : "+ drinkObject.getDrinksCount());
        System.out.println("Загальна вартість замовлення : "+ drinkObject.getDrinksCost());

    }
}
