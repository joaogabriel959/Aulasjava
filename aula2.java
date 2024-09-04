
import java.util.Scanner;
public class aula2{  // sempre iniciar com nome do arquivo exatemnte igual, senão da erro

    public static void main(String[] args) {  
        Scanner leitorTxt = new Scanner(System.in);  // sempre colocar ; no final de cada comando, obrigatorio 
        System.out.println("Digite seu nome:\n ");
        String nome = leitorTxt.nextLine();
        System.out.println("seu nome e: " + nome);  // aqui em qualquer programa colocariamos apenas uma virgula para separar
        leitorTxt.close();                          // porém no java precisa comacar + para juntar string com a variavel
        
    }








}
