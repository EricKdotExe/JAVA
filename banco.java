import java.util.Scanner;
public class banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double saldo = (double) 10000;
        String senha = "123";
        while (true) {
            System.out.println("Digite (1) para ver seu saldo, (2) para fazer um saque ou (3) para sair");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
                System.out.format("Seu saldo atual é %.2f\n", saldo);
            }
            
            else if (escolha == 2){
                System.out.println("Quanto deseja sacar? ");
                Double saque = scanner.nextDouble();

                System.out.println("Digite sua senha: ");
                String senhadigitada = scanner.next();

                if (senhadigitada.equals(senha) && saldo >= 0 && saque <= saldo) {
                saldo -= saque;
                System.out.println("Seu saque foi realizado com sucesso");
                }

                else if (saldo == 0 || saque > saldo) {
                    System.out.println("Saldo insuficiente.");

                }
                else{
                    System.out.println("Senha errada!");
                } 
            }

            else if (escolha == 3) {
            System.out.println("Encerrando programa. ");
            scanner.close();
            break;
            }

            else {
                System.out.println("Escolha errada. Reinsira");}
            }
         }
      }