import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter your name:");
//        String name = scanner.nextLine();
//
//        System.out.println("Hello, " + name + "! Welcome to the Java world.");

        System.out.println("Enter a animal type:");
        String animalType = scanner.nextLine();

        if(animalType.equals("Cat")) {
            System.out.println("Meow.");
        } else if(animalType.equals("Dog")) {
            System.out.println("Woof.");
        }




    }
}
