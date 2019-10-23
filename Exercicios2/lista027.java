package Exercicios2;
import java.util.Scanner;

public class lista027{

    public static void main(String[] args){

        double nota, total = 0;
        int i = 0;

        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Insira a nota do aluno: ");
            
            nota = entrada.nextDouble();

            if(nota>=0){
                total = nota + total;
                i++;
            }
        }while(nota>=0);
        total = total / i;
        System.out.println(total);
    }
}