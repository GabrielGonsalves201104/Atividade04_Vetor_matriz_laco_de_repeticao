import java.util.Random;
import java.util.Scanner;

public class Batalha_Naval_Simplificada {
    public static void main(String[] args) {
        char[][] mar = new char[7][7];
        int naviosEncontrados = 0;
        int tentativas = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Inicializa o mar com 'o' (água)
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                mar[i][j] = 'o';
            }
        }

        // Sorteia 3 posições de navios (marcado como 'N' internamente)
        for (int i = 0; i < 3; i++) {
            int linha = rand.nextInt(7);
            int coluna = rand.nextInt(7);
            if (mar[linha][coluna] == 'N') {
                i--; // Evita que navios fiquem na mesma posição
            } else {
                mar[linha][coluna] = 'N';
            }
        }

        System.out.println("--- Batalha Naval Simplificada ---");
        System.out.println("Tente encontrar 3 navios em um mar 7x7!");

        while (naviosEncontrados < 3) {
            System.out.print("Tentativa " + (tentativas + 1) + ": Digite a linha (0-6) e a coluna (0-6): ");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            if (linha >= 0 && linha < 7 && coluna >= 0 && coluna < 7) {
                if (mar[linha][coluna] == 'N') {
                    System.out.println("BOOOM! Você acertou um navio!");
                    mar[linha][coluna] = 'X'; // Marca o acerto
                    naviosEncontrados++;
                } else {
                    System.out.println("Água! Você errou.");
                    mar[linha][coluna] = '~'; // Marca o erro
                }
                tentativas++;
            } else {
                System.out.println("Coordenadas inválidas. Tente novamente.");
            }
        }

        System.out.println("\nParabéns! Você encontrou todos os 3 navios em " + tentativas + " tentativas.");
        sc.close();
    }
}