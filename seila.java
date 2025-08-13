import java.util.Scanner;
public class seila {
    public static void main(String[] args) {
        double salario0 = salario();
        double bonus0 = bonus();
        double desconto0 = desconto();
        double fim = conta(salario0, bonus0, desconto0);

        System.out.println("O seu salário final será: " + fim);
        System.out.println(desconto0);
    }

    public static double salario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salary = leitor.nextDouble();
        return salary;
    }

    public static double bonus(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o bonus mensal: ");
        double mensal = leitor.nextDouble();
        return mensal;
    }
    
    public static double desconto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o desconto mensal: ");
        double discount = leitor.nextDouble();
        return discount;
    }

    public static double conta(double salario0, double bonus0, double desconto0){
        
        double bonusperc = (bonus0 / 100) * salario0;
        double resultado = (salario0 + bonusperc) - desconto0;
        return resultado;
    }

}
