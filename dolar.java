import java.util.Scanner;

public class dolar {
    

    public static void main(String[] args) {
        double reais = cash();
        double trump = converter(reais);

        System.out.println("A conversão de " + reais + " reais para dolar é: " + trump);
    }
    public static double cash(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor em reaixx: " );
        double dinero = leitor.nextDouble();
        return dinero;
    }

    public static double converter(double real){
        Scanner leitor = new Scanner(System.in);
        double convert = real / 5.40;
        return convert;
    }
}
