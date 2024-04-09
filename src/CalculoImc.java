import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        // entrada
        Scanner scanner = new Scanner(System.in);

        // pedir para o usuario o seu peso
        System.out.println("informe o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // pedir para o usuario a sua altura
        System.out.println("informe o sua altura em metros: ");
        double altura = scanner.nextDouble();

        // procesamento
        // calcular o imc
        double imc = peso / (altura + altura);

        // saida
        // imprime o resultado
        System.out.println("seu IMC é: " + imc);

        if (imc > 18.5) {
            System.out.println("baixo peso");
        } else if (imc < 18.5 && imc > 24.9)
            System.out.println("eutrofia");
        else if (imc < 24.9 && imc > 29.9)
            System.out.println("sobre peso");
        else if (imc < 30 && imc > 34)
            System.out.println("obesidade gral 1");
        else {
            System.out.println("recalcule");
        }




        scanner.close();
    }
}
