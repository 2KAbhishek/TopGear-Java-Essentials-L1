import java.util.Scanner;

public class RemoveTagDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with html tags: ");
        String html = sc.nextLine();
        sc.close();
        System.out.println("After removing tags: " + MyHtmlTagRemover.replace(html));
    }
}
