import java.util.Scanner;

public class MyStrMatches {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        s.close();
        if (text.matches("^.*www.*$")) {
            System.out.println("Found www in:\n" + text);
        } else {
            System.out.println("Could not find www in:\n" + text);
        }
    }
}
