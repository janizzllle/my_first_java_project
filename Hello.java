/**
 * Hello
 */
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello");
Scanner scan = new Scanner(System.in);
System.out.println("Please enter your name: ");
String name = scan.nextLine();
System.out.println("Hello " + name);
scan.close();


    }
}