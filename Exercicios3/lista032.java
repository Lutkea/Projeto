package Exercicios3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lista032{

    public static void main(String [] args){

        File arquivo = new File("C:\\Users\\amanda.lutke.ALUNOS\\Desktop\\Projeto\\arquivo.txt");
        Scanner ler = null;

        try{
            ler = new Scanner(arquivo);
            while (ler.hasNextLine()){
                System.out.println(ler.nextLine());
            }
        }
        catch (IOException erro){
            System.out.println("Erro encontrado: " + erro.getMessage());
        }
        
    }
}