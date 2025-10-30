package InvertirArray;
import java.util.Scanner;
public class InvertirArray {
    public static String[] invertirArray(String[] array){
        String[] invertido = new String[array.length];

        for (int i = 0; i< array.length; i++){
            invertido[i] = array[array.length - 1 - i ];
        }
        return invertido;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos del array");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[n];

        for (int i = 0; i<n; i++){
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        System.out.print("Array original: ");
        System.out.println(java.util.Arrays.toString(array));

        String[] invertido = invertirArray(array);

        System.out.print("Array invertido: ");
        System.out.println(java.util.Arrays.toString(invertido));

        scanner.close();
    }
}
