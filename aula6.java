// aula 16_09 por que perdir duas aula de java 
import java.util.Random;
import java.util.Scanner;
public class aula6 {

    public static void main(String[] args){
        Random aleatorio = new Random ();  // A logica do programa e a seguinte, ele vai gerar um numero aleatorio, e quando vc digitar um numero
// um numero e acertar o mesmo numero que gerou ele vai ter retornar "voce acertou 30p", quando colar menor ou maior, vc errou e ele vai descontar 10 pontos                             
        
        Scanner leitura = new Scanner(System.in); // control + j = pra abrir o terminarl sem rodar o codigo, só abrir o terminal
       
        final int sorteio = aleatorio.nextInt(6); // numero aleario de 1 ate 6, bound(limite)
        
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        
        
        int pontuacao = 30;
        if (sorteio < numero){
        // pontuação = pontuação - 10
           pontuacao -= 10;
           System.out.println("Numero digitado e maior que o numero sorteado evoce está com "+ pontuacao + " pontos");
       
        }else if (sorteio > numero){
            System.out.println("Numero digitado e menor que o numero sorterteado e voce está com "+ pontuacao + " pontos");
       
        }else{
            System.out.println("voce acertou com" + pontuacao + "pontos");
            return;
        
        }
        leitura.close();  
    
         



    
    




 

    
    
    
    }
}