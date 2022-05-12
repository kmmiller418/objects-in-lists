import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<TVShow> shows = new ArrayList<>();

        System.out.println("Enter some TV shows:");

        while (true){

            System.out.println("Show name: (enter a blank line to break the loop)");
            String name = s.nextLine();
            if (name.equals("")){
                break;
            }

            System.out.println("How many episodes?");
            int episodes = Integer.parseInt(s.nextLine());

            System.out.println("What is the genre?");
            String genre = s.nextLine();

            shows.add(new TVShow(name, episodes, genre));
        }
        for (TVShow show : shows) {
            System.out.println(show);
        }
    }
}
