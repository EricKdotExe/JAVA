import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

        System.out.println("Escolha (1) para converter Celsius para Fahrenheit ou (2) para converter Fahrenheit para Celsius e (3) para sair:");
        Double escolha = scanner.nextDouble();
        if (escolha == 1) { // escolha de Celsius para Fahrenheit
            System.out.println("Digite uma temperatura em Celsius: ");
            Double Cels = scanner.nextDouble();
            Cels =  (Cels * 1.8) + 32;
            System.out.format("A temperatura é %.2f ºFahrenheit\n", Cels);
            
        }
        else if (escolha == 2) { // escolha de Fahrenheit para Celsius 
            System.out.println("Digite uma temperatura em Fahrenheit: ");
            Double Fahr = scanner.nextDouble();
            Fahr = (Fahr - 32) * 0.55;
             System.out.format("A temperatura é %.2f ºCelsius\n", Fahr);
            
        }
        else if (escolha == 3) { // escolha para sair
            System.err.println("Encerrando programa.");
            scanner.close();
            break;
      }
        else { // escolha para erro de digitação
            System.out.println("Opção errada.");
        }
    }
  }
}
