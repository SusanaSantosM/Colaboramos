import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introducir numero 1: ");
        int num1 = sc.nextInt();
        System.out.println(" Introducir numero 2: ");
        int num2 =  sc.nextInt();
        System.out.println(" Introducir numero 3: ");
        int num3 = sc.nextInt();

        Lucia ob = new Lucia();
        ob.setLucia(num1,num2,num3);
    }
}