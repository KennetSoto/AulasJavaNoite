package principal;

public class Program {

    /*
    public` � uma palavra-chave que indica que o m�todo pode ser acessado de qualquer lugar, ou seja, ele � p�blico.
    main` � o nome do m�todo que � executado quando o programa � iniciado. Ele � o ponto de entrada do programa.
    Em resumo, `public static void main` � um m�todo p�blico e est�tico que n�o retorna nenhum valor e � o ponto de entrada do programa.
     */
    public static void main(String[] args) {
        
        mensagem(); //Chama o m�todo mensagem()
        mensagem2(20.54); //Chama o m�todo mensagem2() passando o valor 20.54 como argumento
        System.out.println(mensagem3()); //Chama o m�todo mensagem3() e imprime o valor retornado na tela
        System.out.println(mensagem4(10)); //Chama o m�todo mensagem4() passando o valor 10 como argumento e imprime o valor retornado na tela
        System.out.println(mensagem4(254)); //Chama o m�todo mensagem4() passando o valor 254 como argumento e imprime o valor retornado na tela
        
        int meuNumero=650; //Declara e inicializa a vari�vel meuNumero com o valor 650
        System.out.println(mensagem4(meuNumero)); //Chama o m�todo mensagem4() passando o valor da vari�vel meuNumero como argumento e imprime o valor retornado na tela
        
 
        
    }
    /*
    static` � uma palavra-chave que indica que a fun��o pertence � classe em vez de uma inst�ncia da classe. Isso significa que a fun��o pode ser chamada sem criar um objeto da classe. 
    void` � um tipo de retorno que indica que a fun��o n�o retorna nenhum valor. Ou seja, a fun��o � usada apenas para executar uma a��o, como imprimir uma mensagem na tela.
     */
    static void mensagem() {
       System.out.println("Primeiro void"); //Imprime a mensagem "Primeiro void" na tela
    }
   
    static void mensagem2(double n) {
       System.out.println("O numero informado foi: " + n); //Imprime a mensagem "O numero informado foi: " seguida do valor do argumento n na tela
    }
    
    static String mensagem3() {
        return "Mensagem 3"; //Retorna a string "Mensagem 3"
    }
    
    static int mensagem4(int n) {
        return n*2; //Retorna o dobro do valor do argumento n
    }
}