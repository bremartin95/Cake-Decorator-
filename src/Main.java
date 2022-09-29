import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Are you ready to make a cake? Y or N");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();
        if (response.equalsIgnoreCase("Y")) {
            System.out.println("Okay! Lets get started, type: GET STARTED ");
            response = userInput.nextLine();
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Okay! Come back another time!");

        }
        System.out.println("How Many Eggs do you want to add? ");
        response = userInput.nextLine();
        //todo add eggs to cake
        System.out.println("How many cups of flour do you want to add?");
        response = userInput.nextLine();
        System.out.println("How many drops of vanilla do you want to add?");
        response = userInput.nextLine();
        System.out.println("How many sticks of butter would you like to add?");
        response = userInput.nextLine();
        System.out.println("How many cups of milk would you like to add?");
        response = userInput.nextLine();
        System.out.println("How many tsp of baking soda will you add?");
        response = userInput.nextLine();
        System.out.println("Finally, what flavor would you like? Chocolate, Vanilla or Surprise?");
        response = userInput.nextLine();

        Cake userCake = new Cake();
        userCake.setEggsEach(userInput.nextInt());
        userCake.setFlavorings(userInput.nextLine());
        userCake.setCupsOfFlour(userInput.nextInt());
        userCake.setCupsOfMilk(userInput.nextInt());
        userCake.setTspBakingSoda(userInput.nextInt());
        userCake.setSticksOfButter(userInput.nextInt());
        userCake.setDropsOfVanilla(userInput.nextInt());

        if (userCake.getEggsEach() == 1
                && userCake.getCupsOfMilk() == 1
                && userCake.getCupsOfFlour() == 1
                && userCake.getDropsOfVanilla() == 1
                && userCake.getSticksOfButter() == 1
                && userCake.getTspBakingSoda() == 1
                && userCake.getFlavorings().equalsIgnoreCase("Plain")) {

            System.out.println("You've made a simple white cake!");
        }

    }
}

