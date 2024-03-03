import java.util.Scanner;
public class imc{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digite sua idade: "); //define a idade (não usado por enquanto)
         @SuppressWarnings("unused")
         String idade = scanner.next();

         System.out.println("Digite seu gênero: (f) para feminino ou (h) para homem: "); //seleciona o gênero
         String gender = scanner.next();
         
         System.out.println("Digite seu peso em KGs: "); //define o peso
         Double peso = scanner.nextDouble();

         System.out.println("Digite sua altura em metros: "); //define a altura
         Double altura = scanner.nextDouble();

         scanner.close();
         Double alturaquadrada = (altura * altura);
         Double imc = peso/alturaquadrada; //calcula o imc base

         if (gender.equals("h")) {
            System.out.format("Seu gênero é %s e seu imc é %.1f\n", gender, imc);
            if (imc < 20) {
                System.err.println("Você está abaixo do peso!");
            }
            else if (imc >= 20 && imc <= 24.9) {
                System.out.println("Você está no peso normal!");
            }
            else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está com obesidade leve");
            }
            else if (imc >= 30 && imc <= 39.9){
                System.out.println("Você está com obesidade moderada");
            }
            else if (imc >= 43){
                System.err.println("Você está com obesidade mórbida");
            }

         }
         else if (gender.equals("f")) {
            System.out.format("Seu gênero é %s e seu imc é %.1f\n", gender, imc);
            if (imc < 19) {
                System.err.println("Você está abaixo do peso");
            }
            else if (imc >= 19 && imc <= 23.9){
                System.out.println("Você está no peso normal");
            }
            else if (imc >= 24 && imc <= 28.9){
                System.out.println("Você está com obesidade leve");
            }
            else if (imc >= 29 && imc <= 38.9){
                System.out.println("Você está com obesidade moderada");
            }
            else if (imc >= 39){
                System.err.println("Você está com obesidade mórbida");
            }
            
         }
         else {
            System.out.println("Escolha errada ");
         }
    }    
}