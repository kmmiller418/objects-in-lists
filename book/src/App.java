import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Hop Skip Jump", 42, 2022));
        books.add(new Book("Briefcases: a brief case", 20, 2022));
        books.add(new Book("Verily", 621, 1995));
        books.add(new Book());
        books.add(new Book("How Could You?"));
        books.add(new Book(1997, 478));
        books.add(new Book("Rocks are Neat", 732));

        System.out.println("There are already some books in the list; add more?");

        while (true){
            System.out.println("Enter a name (or an empty line to stop adding books):");
            String title = s.nextLine();
            if (title.isEmpty()){
                break;
            }

            System.out.println("How many pages is this book?");
            int pages = Integer.parseInt(s.nextLine());

            System.out.println("What year was it published?");
            int year = Integer.parseInt(s.nextLine());

            books.add(new Book(title, pages, year));
            System.out.println("Book has been added.");
        }
        while (true) {
            System.out.println("What information would you like about the books? (everything/titles?)");
            String reply = s.nextLine();
            if (reply.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                return;
            } else if (reply.equalsIgnoreCase("titles")) {
                for (Book book : books) {
                    System.out.println(book.getTitle());
                }
                return;
            } else {
                System.out.println("Sorry, that's not an option at this time.");
            }
        }
    }
}
