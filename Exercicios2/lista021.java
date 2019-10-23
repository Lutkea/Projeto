package Exercicios2;

// o caminho para a execução do programa

import java.util.Scanner;
// funciona para utilizar o scanner, o scanner serve pra dar entrada(inserir valores) no terminal
public class lista021 {

    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        int media;
        Scanner entrada = new Scanner(System.in);
    // criando um scanner dentro da classe(lista2) sempre dar um nome para o scanner
        System.out.println("Insira a primeira nota");
        nota1 = entrada.nextInt();

        System.out.println("Insira a segunda nota");
        nota2 = entrada.nextInt();

        System.out.println("Insira a terceira nota");
        nota3 = entrada.nextInt();

        entrada.close();

        media = (nota1+nota2+nota3)/3;

        if(media<=6){

            System.out.println("Está abaixo da média");
        }else{

            System.out.println("Está na média");
        }

        }
}