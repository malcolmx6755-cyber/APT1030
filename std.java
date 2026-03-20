import java.util.Scanner;

public class std{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter number of registered units: ");
        int units = input.nextInt();

        String status;
        if(units>7){
            status = "Overload - Approval Required";
        }
        else{
            status = "Registration Accepted";
        }
        System.out.println("NAME:"+ name);
        System.out.println("UNITS:"+ units);
        System.out.println("STATUS:"+ status);
    }

}