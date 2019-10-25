package Exercicios3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class lista031{

    public static void main(String []args) {

        int resultado, i, valor = 0;
        String caminho = "arquivo.txt";

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor a ser calculado: ");
        
        valor = entrada.nextInt();
        entrada.close();

        try {
            BufferedWriter escrita = new BufferedWriter(new FileWriter (caminho));

            for (i=0;i<=10;i++){

                resultado = valor * i;
                escrita.append(valor + " x " + valor + " = " + resultado );
                escrita.newLine();
            }
            escrita.close();
        }

        catch (IOException alerta){
            
            alerta.printStackTrace();
    
        }   

        System.out.println("Tabuada impressa com sucesso!");
      
    }
}