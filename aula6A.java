import java.util.Scanner;

public class aula6A {   // aqui temos a logica da liss que assim como no pyton as carteristicas da lista sempre são enumeradas automaticamnte, e sempre começando com 0
    public static void main(String[] args) {
        String[] resposta = {"feliz","Triste","inteligente","bonito(a)","dedicado","delicado","focado(a)","estudioso"};
        // [] para chamar lista
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma cor: ");
        switch (leitura.nextLine()) {
            case "rosa":
            System.out.println(resposta[7]);  // te pede pra mostar a string da lista de que ta na posição
                break;
            case "azul":
            System.out.println(resposta[5]);
                break;
            case "amarelo":
            System.out.println(resposta[4]);
                break;
            case "vermelho":
            System.out.println(resposta[0]);
                break;
            case "verde":
            System.out.println(resposta[3]); 
                break;
            case "preto":
            System.out.println(resposta[2]);
                break;
            case "roxo":
            System.out.println(resposta[1]);
                break;
            case "branco":
                System.out.println(resposta[6]);
                break;
            default:
                System.out.println("cor invalida");
                break;
            
        }    
   
   
   
   
   
   
   
   
    }


}
