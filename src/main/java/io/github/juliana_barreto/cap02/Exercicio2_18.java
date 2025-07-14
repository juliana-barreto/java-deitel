// Aplicativo que exibe uma caixa, uma elipse, uma seta e um losango utilizando asteriscos(*)

package io.github.juliana_barreto.cap02;

public class Exercicio2_18 {
    private static final int ALTURA = 9;
    public static void imprimirCaixa() {
        // Itera sobre as linhas (eixo y)
        for (int y = 0; y < ALTURA; y++) {
            // Itera sobre as colunas (eixo x)
            for (int x = 0; x < ALTURA; x++) {
                // Verifica se o ponto (x,y) está na borda
                if (x == 0 || y == 0 || x == ALTURA-1 || y == ALTURA-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
    public static void imprimirElipse() {
        // A equação do círculo é usada por conta da distorção do terminal
        int raio = ALTURA / 2;
        for (int y = -raio; y <= raio; y++) {
            for (int x = -raio; x <= raio; x++) {
                // Calcula a distância do ponto (x, y) até o centro (0, 0)
                double distancia = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
                // Verifica se o ponto está na borda (tolerância de 0.5)
                if ((distancia >= raio - 0.5) && (distancia <= raio + 0.5)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirSeta() {
        // Impressão do triângulo (parte superior)
        int alturaTriangulo = ALTURA/3, tamBase = 0;
        for (int y = 0; y < alturaTriangulo; y++) {
            for (int esp = 0; esp < alturaTriangulo - y; esp++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast < 2*y + 1; ast++) {
                System.out.print("*");
            }
            tamBase = 2*y+1;
            System.out.println();
        }
        // Impressão da reta (parte inferior)
        int alturaReta = ALTURA - alturaTriangulo, meio= tamBase/2;
        for (int y = 0; y < alturaReta; y++) {
            for (int esp = 0; esp <= meio; esp++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void imprimirLosango() {
        int meio = ALTURA / 2;
        // Impressão do triângulo com vértice para cima (parte superior)
        for (int y = 0; y < meio; y++) {
            for (int esp = 0; esp < meio - y; esp++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast < 2*y+1; ast++) {
                // Verifica se o ponto (x,y) está na borda
                if (ast == 0 || ast == 2*y) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Impressão do triângulo com vértice para baixo (parte inferior)
        for (int y = meio-1; y >= 0; y--) {
            for (int esp = 0; esp < meio - y; esp++) {
                System.out.print(" ");
            }
            for (int ast = 0; ast < 2*y+1; ast++) {
                // Verifica se o ponto (x,y) está na borda
                if (ast == 0 || ast == 2*y) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        imprimirCaixa();
        System.out.println();
        imprimirElipse();
        System.out.println();
        imprimirSeta();
        System.out.println();
        imprimirLosango();
    }
}
