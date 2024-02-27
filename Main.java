
import java.util.Scanner;
public class Main {
    static void checkNum(int n){
    if(n<0){
        throw new ArithmeticException("Cannot use negative numbers.");
    }else{
        System.out.println(Math.sqrt(n));
    }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = {"Walter","Ashley","Pawan","Aghil","Tyran","Olufemi","Isabella","Coulton","Jill","Amelia"};
        System.out.println("Enter a number to index an element from list.");

        int resp = sc.nextInt();

        try{
            System.out.println(names[resp]);
        }catch(Exception e){
            System.out.println("Something went wrong.");
        }

        System.out.println("Enter a number to square root");
        resp = sc.nextInt();

        try{
            checkNum(resp);
        }catch(ArithmeticException e){
            System.out.println("Cannot square root this.");
        }
    }
}
