public class Exercicio01e{

   public static void main(String[] args) {
       int a = 10;
       int b = 2;
       int c = 5;

       int deltaValue = ((b * b) + (4 * a * c));

       double x = (-b + Math.sqrt(deltaValue)) / (2 * a);
       double xLine = (-b - Math.sqrt(deltaValue)) / (2 * a);

       System.out.println("O valor do delta é: " + deltaValue);
       System.out.println("O valor de x é: " + x);
       System.out.println("O valor de x linha é:" + xLine);
        
    }
} 