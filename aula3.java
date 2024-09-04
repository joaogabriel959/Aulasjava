import java.util.Scanner;

public class aula3{

    public static void main(String[] args) {
       System.out.println(); 
       
       Scanner leitorTxt = new Scanner(System.in);     // leitor de segue mesmo logica de uma variavel, que no caso aqui e um scanner 
      
       System.out.println("Digite seu nome: ");      // uma "variavel" que vai ler o que vai escrever, só precisa colocar uma vez
       String nome1 = leitorTxt.nextLine();            // e depois chamar ela sempre que precisar ler alguma infromação
       System.out.println("Nome 1 e: " + nome1);

       System.out.println("Digite o segundo nome: ");
       String nome2 = leitorTxt.nextLine();
       System.out.println("Nome 2 e: "+ nome2);

       System.out.println("Digite o terceiro nome: ");
       String nome3 = leitorTxt.nextLine();
       System.out.println("Nome 3 e: "+ nome3);

       System.out.println("Digite o guarto nome: ");
       String nome4 = leitorTxt.nextLine();
       System.out.println("Nome 4 e: "+ nome4);

       System.out.println("Digite o quinto nome: ");
       String nome5 = leitorTxt.nextLine();
       System.out.println("Nome 2 e: "+ nome5);
       leitorTxt.close();     // aqui ele vai fechar a leitura, do que colocar sendo atribuida ao "leitor texto"





 
    
       
   
   
   
   
    }





}