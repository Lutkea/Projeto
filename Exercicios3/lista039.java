package Exercicios3;
import java.util.Scanner;

public class lista039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float lado1, lado2, area;
        
        System.out.println("Digite o valor do lado 1: ");
        lado1 = input.nextFloat();
        System.out.println("Digite o valor do lado 2: ");
        lado2 = input.nextFloat();

        area = (lado1 * lado2);

        System.out.println("A área é igual a: " + area + "m2");
        input.close();
    }
}