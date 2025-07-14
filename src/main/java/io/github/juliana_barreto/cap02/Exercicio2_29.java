/*  Aplicativo·que exibe os equivalentes inteiros de algumas letras maiúsculas,minúsculas,dígitos e
símbolos especiais.*/

package io.github.juliana_barreto.cap02;

public class Exercicio2_29 {
    public static void main(String[] args) {
        char[] caracteres = {'A','B','C','a','b','c','0','1','2','$','*','+', '/',' '};
        for (int i = 0; i < caracteres.length; i++){
            System.out.printf("O caractere %c tem valor %d%n", caracteres[i], ((int)caracteres[i]));
        }
    }
}
