package Exercicios2;
import java.util.Scanner;

public class lista024{
    public static void main(String[] args) {
     
    Scanner tabuada = new Scanner(System.in);
    int valor = tabuada.nextInt();
    tabuada.close();
    int resultado;

    int i = 0;

    for (i=0;i<=10;i++){

    resultado = valor * i;         
    
    System.out.println(resultado);
        
    }   
    
}
   
    
}