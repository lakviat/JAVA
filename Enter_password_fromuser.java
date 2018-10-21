package Arrays;
import java.util.Scanner;
public class Practice_Purpose {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = scan.nextLine();
        sayHello(pass);


    }
    public static void sayHello(String password){
        System.out.println("This is the value: " + password);
        if(password.equalsIgnoreCase("magic")){
            System.out.println("Hello World");
        }

        else{
            System.out.println("password is invalid. Try again");
        }
    }

}
