import java.util.Scanner;



public class Menu {
       public static void main(String[] args) {
       int opcao = 0;
do {
        System.out.println("|  MENU                |");
        System.out.println("|  Opções:             |");
        System.out.println("|      1. Opção 1      |");
        System.out.println("|      2. Opção 2      |");
        System.out.println("|      3. Sair         |");
        Scanner menu = new Scanner(System.in);

        System.out.println("Selecione uma Opção:");
        opcao = menu.nextInt(); 
  

        switch (opcao) {
        case 1:
            System.out.println("Opção 1 selecionada");
            break;
        case 2:
            System.out.println("Opção 2 selecionada");
            break;
        case 3:
            System.out.println("Sair");
            break;
        default:
            System.out.println("Seleção inválida");
            break;

        } 
    }while(opcao!=3);        
if (opcao==3) {
    System.out.println("Programa Finalizado");
}
}
} 

    
    
