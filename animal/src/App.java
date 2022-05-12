import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");

        while (true){
            System.out.println("Add a new animal! (entering nothing will stop the loop)");
            System.out.println("Please enter a name: ");
            String name = s.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Is it a dog? yes/no?");
            Boolean isDog = s.nextLine().equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
            System.out.println("Animal added.");
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
