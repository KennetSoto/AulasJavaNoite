package principal;

import java.util.Scanner;

public class exercicioFuncao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro número da soma: ");
        int numero1 = sc.nextInt();
        System.out.print("Entre com o segundo número da soma: ");
        int numero2 = sc.nextInt();
        
        // Chama a função somaDoisNumeros com os números inseridos pelo usuário
        somaDoisNumeros(numero1, numero2);
        
        // Imprime uma mensagem na tela
        System.out.println("Abaixo os números foram atribuídos manualmente");
        System.out.println();
        System.out.println();
        
        // Chama a função somaDoisNumeros com dois números fixos (10 e 20)
        somaDoisNumeros(10, 20);
        
        System.out.println();
        System.out.println();
        
        int num1 = 15;
        int num2 = 45;
        
        // Chama a função mensagem5 com as variáveis num1 e num2 como argumentos
        System.out.println(mensagem5(num1,num2));
        
        System.out.println();
        System.out.println();
        
        // Chama a função somaDoisNumeros com as variáveis num1 e num2 como argumentos
        somaDoisNumeros(num1,num2);
        
    }

    // Função que recebe dois argumentos inteiros x e y e retorna uma string que contém a soma desses dois números
    static String mensagem5(int x, int y) {
        return "A soma dos dois números informados é: " + (x + y);
    }

    // Função que recebe dois argumentos inteiros x e y e imprime o resultado da soma desses dois números na tela
    static void somaDoisNumeros(int x, int y) { 
        int resultado = x + y;
        System.out.println("O resultado da soma é: " + resultado);
        System.out.println("Outra forma de mostrar o resultado da soma: " + (x+y));
    }
}