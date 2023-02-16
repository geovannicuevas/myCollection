
import java.util.Scanner;


public class myCollection {
    public static Item[] item = new Item[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);


        String userChoice,bookTitle,bookAuthor,periodicalName;
        int isbnNum, issueNum;
        for(int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            userChoice = sc.next();
            if (userChoice.equals("B")) {
                System.out.println("Please enter the name of the Book");
                bookTitle = scanner.nextLine();
                System.out.println("Please enter the author of the Book");
                bookAuthor = in.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                isbnNum = Integer.parseInt(scanner.nextLine());
                item[i] = new Book(bookTitle, isbnNum, bookAuthor);
            }
            else if (userChoice.equals("P")) {
                System.out.println("Please enter the name of Periodical\r");
                periodicalName = in.nextLine();
                System.out.println("Please enter the issue number");
                issueNum = Integer.parseInt(scanner.nextLine());
                item[i] = new Periodical(issueNum, periodicalName);
            }


        }
        System.out.println("Your Items: ");
        for (int i = 0; i < item.length; i++) {
            System.out.println( item[i].getListing());
        }
    }
}
