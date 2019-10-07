/*
 * Inicia no primeiro elemento e verifica se os proximos depois da chave sao menores que ele.
 * Se forem, joga pra casa anterior.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = { 5,2,3,4,1 };
        sortArray(array);
    }
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

        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    

}

