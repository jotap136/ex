import java.util.Scanner;
public class churrasco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int pessoas =  qtdPessoas();
    }

    public static int qtdPessoas(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas: ");
        int pessoas = leitor.nextInt();
        return pessoas;
    }

    public static double qtdAlimentos(int pessoas, String alimento){
        Scanner leitor = new Scanner(System.in);
        if(alimento.equals("carne")){
            return pessoas * 0.3;
        }
        else if (alimento.equals("linguiça")){
            return pessoas * 0.2;
        }
        else if (alimento.equals("frango")){
            return pessoas * 0.15;
        }
        else{
            return 0;
        }
    }
}
