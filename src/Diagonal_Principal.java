import java.util.Random;

public class Diagonal_Principal {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random gerador = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = gerador.nextInt(100);
            }
        }

        System.out.println("Matriz 4x4 gerada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos da Diagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}