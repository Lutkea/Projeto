package Exercicios2;
import java.util.Scanner;

public class lista028{

    public static void main(String [] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Insira um valor para cálculo vetorial: ");

// não ocupar espaço na memoria

        int i = entrada.nextInt();
        entrada.close();
        int a = i;
        a--;
        
        do{
            i = i*a;
            a = a-1;
            
        }while(a>=1);
        
        System.out.println("O valor fatorial  é = " + i);
    }

}