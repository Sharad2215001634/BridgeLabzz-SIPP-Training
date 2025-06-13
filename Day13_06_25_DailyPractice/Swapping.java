package Day13_06_25_DailyPractice;
import java.util.*;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Before swapping Values Are : " +a + " " + b);
        int temp = a;
        a =b;
        b = temp;
        System.out.println("After Swapping : " +a + " " + b);
        sc.close();

    }
    
}

