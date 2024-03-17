
import java.util.Scanner;


public class Maquininha {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int opcao;
        
        do {
            Menu();
            opcao = s.nextInt();
            s.nextLine();
            
          switch (opcao) {
              case 1:
                  cartao1(s);
                  break;
              case 2:
                  cartao2(s);
                  break;
              case 3:
                  cartao3(s);
                  break;
              case 4:
                  cartao4(s);
                  break;
              case 5:
                  System.out.println("FINALIZANDO SISTEMA...");
                  break;
              default:
                  System.err.println("OPÇÃO INVÁLIDA. DIGITE NOVAMENTE");
          }
        }while (opcao !=5);       
    }
    private static void Menu() {
        System.out.println(" --------------------");
        System.out.println(" |    MAQUININHA    | ");
        System.out.println(" --------------------");
        System.out.println("(1) = MASTERCARD");
        System.out.println("(2) = VISA");
        System.out.println("(3) = ELO");
        System.out.println("(4) = HIPERCARD");
        System.out.println("(5) = FECHAR");
        System.out.println(" --------------------");
        System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
    }   
    
    private static void cartao1(Scanner s) {
        System.out.println("- MASTERCARD -");
        System.out.println("(1) DÉBITO");
        System.out.println("(2) CRÉDITO A VISTA");
        int x = s.nextInt();       
        if ( x == 1) {

            System.out.println("OPÇÃO DE * DÉBITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
              double taxa = 2.06 / 100;
              double valor = y - ( y * taxa);  
            System.out.println("O VALOR LIQUIDO É: " + valor );
            System.out.println("");
            
        } else {
            System.out.println("OPÇÃO DE * CRÉDITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
            double taxa = 2.74 / 100;
            double valor = y -(y * taxa);
            System.out.println("O VALOR LIQUIDO É: " + valor );
        }
                   
    }
    
    private static void cartao2(Scanner s) {
        System.out.println("- VISA -");
        System.out.println("(1) DÉBITO");
        System.out.println("(2) CRÉDITO A VISTA");
        int x = s.nextInt();       
        if ( x == 1) {

            System.out.println("OPÇÃO DE * DÉBITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
              double taxa = 2.06 / 100;
              double valor = y - ( y * taxa);  
            System.out.println("O VALOR LIQUIDO É: " + valor );
            
        } else {
            System.out.println("OPÇÃO DE * CRÉDITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
            double taxa = 2.74 / 100;
            double valor = y -(y * taxa);
            System.out.println("O VALOR LIQUIDO É: " + valor );
        }
    }
    
    private static void cartao3(Scanner s) {
        System.out.println("- ELO -");
        System.out.println("(1) DÉBITO");
        System.out.println("(2) CRÉDITO A VISTA");
        int x = s.nextInt();       
        if ( x == 1) {

            System.out.println("OPÇÃO DE * DÉBITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
              double taxa = 2.99 / 100;
              double valor = y - ( y * taxa);  
            System.out.println("O VALOR LIQUIDO É: " + valor );
            
        } else {
            System.out.println("OPÇÃO DE * CRÉDITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
            double taxa = 3.99 / 100;
            double valor = y -(y * taxa);
            System.out.println("O VALOR LIQUIDO É: " + valor );
        }
    }
  
    private static void cartao4(Scanner s) {
        System.out.println("- HIPERCARD -");
        System.out.println("(1) DÉBITO");
        System.out.println("(2) CRÉDITO A VISTA");
        int x = s.nextInt();       
        if ( x == 1) {

            System.out.println("OPÇÃO DE * CRÉDITO * SELECIONADA, INSIRA O VALOR:");
            double y = s.nextDouble();
              double taxa = 3.11 / 100;
              double valor = y - ( y * taxa);  
            System.out.println("O VALOR LIQUIDO É: " + valor );            
        
        }                     
    }
}
