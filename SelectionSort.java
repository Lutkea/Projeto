/*
 * Inicia no primeiro elemento e verifica se os proximos depois da chave sao menores que ele.
 * Se forem, joga pra casa anterior.
 */
class SelectionSort {

    public static void sortArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int nextIndex = i + 1;

            while (nextIndex < arr.length && key > arr[nextIndex]) {
                arr[nextIndex - 1] = arr[nextIndex];
                nextIndex++;
            }

            arr[nextIndex - 1] = key;
        }

        main.printArray(arr);
    }

}

public class ArquivoDeTexto{

    public static void printArray(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

   
}