import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = nome();

        System.out.println("Informe sua altura: ");
        double altura = leitor.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = leitor.nextDouble();

        double calculo = IMC(peso, altura);
        System.out.println("Seu imc ai seu merda: " + calculo);
        
    }

    public static String nome(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        String nome = leitor.nextLine();
        return nome;

    }
    public static double IMC(double peso, double altura){
        Scanner leitor = new Scanner(System.in);
        double pesoo = 0;
        double alturaa = 0;
        double resultado = pesoo / Math.pow(alturaa, 2);
        return resultado;
    }
}
