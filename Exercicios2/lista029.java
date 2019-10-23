package Exercicios2;
import java.util.Scanner;

public class lista029{
public static void main(String[] args) {
    
    double peso;
    double altura;
    double imc;

    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o peso em KG: ");
    peso = entrada.nextDouble();
    System.out.println("Digite a altura em CM: ");
    altura = entrada.nextDouble();
    altura = altura*altura;
    imc = peso / altura;
    

    if(imc<=18.5){
        System.out.println("Abaixo do peso");
    }else if(imc>=18.5 && imc<=24.9){
        System.out.println("Peso Ideal");
    }else if(imc>=25.0 && imc<=29.9){
        System.out.println("Levemente Acima do Peso");
    }else if(imc>=30.0 && imc<=34.9){
        System.out.println("Obesidade Grau I");
    }else if(imc>=35.0 && imc<=39.9){
        System.out.println("Obesidade Grau II");
    }else{
        System.out.println("Obesidade Grau III (mórbida)");
    }
    }
}