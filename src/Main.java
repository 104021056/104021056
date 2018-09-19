import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("輸入兩個整數");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = a+b;
        int d = a-b;

        System.out.println("相加"+" "+ c);
        System.out.println("相乘"+" "+ a*b);
        System.out.println("相減"+" "+ d);
    }
}
