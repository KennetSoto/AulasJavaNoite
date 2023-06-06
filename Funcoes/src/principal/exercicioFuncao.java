package principal;

import java.util.Scanner;

public class exercicioFuncao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro n�mero da soma: ");
        int numero1 = sc.nextInt();
        System.out.print("Entre com o segundo n�mero da soma: ");
        int numero2 = sc.nextInt();
        
        // Chama a fun��o somaDoisNumeros com os n�meros inseridos pelo usu�rio
        somaDoisNumeros(numero1, numero2);
        
        // Imprime uma mensagem na tela
        System.out.println("Abaixo os n�meros foram atribu�dos manualmente");
        System.out.println();
        System.out.println();
        
        // Chama a fun��o somaDoisNumeros com dois n�meros fixos (10 e 20)
        somaDoisNumeros(10, 20);
        
        System.out.println();
        System.out.println();
        
        int num1 = 15;
        int num2 = 45;
        
        // Chama a fun��o mensagem5 com as vari�veis num1 e num2 como argumentos
        System.out.println(mensagem5(num1,num2));
        
        System.out.println();
        System.out.println();
        
        // Chama a fun��o somaDoisNumeros com as vari�veis num1 e num2 como argumentos
        somaDoisNumeros(num1,num2);
        
    }

    // Fun��o que recebe dois argumentos inteiros x e y e retorna uma string que cont�m a soma desses dois n�meros
    static String mensagem5(int x, int y) {
        return "A soma dos dois n�meros informados �: " + (x + y);
    }

    // Fun��o que recebe dois argumentos inteiros x e y e imprime o resultado da soma desses dois n�meros na tela
    static void somaDoisNumeros(int x, int y) { 
        int resultado = x + y;
        System.out.println("O resultado da soma �: " + resultado);
        System.out.println("Outra forma de mostrar o resultado da soma: " + (x+y));
    }
}