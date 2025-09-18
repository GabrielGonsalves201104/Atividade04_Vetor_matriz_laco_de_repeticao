import java.util.Random;
import java.util.ArrayList;

public class Pares_Impares {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random gerador = new Random();

        for (int i = 0; i < 15; i++) {
            numeros[i] = gerador.nextInt(100) + 1; // Números entre 1 e 100
        }

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Vetor gerado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");

        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }
}