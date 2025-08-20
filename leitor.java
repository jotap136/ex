
import java.util.Scanner;

public class leitor {
    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        String nome = nome();
        String livro = nomeLivro();

        double pag = pagTempo();

        System.out.println(nome + " você finalizará a leitura do livro " + livro + " em aproximadamente " + String.format("%.2f", pag) + " horas.");
    }

    public static String nome(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nome = leitor.nextLine();
        return nome;
    }

    public static String nomeLivro(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome do livro:");
        String livro = leitor.nextLine();
        return livro;
    }

    public static double pagTempo(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número de páginas:");
        int pag = leitor.nextInt();

        System.out.println("informe a quantidade de segundos por páginas: ");
        double sec = leitor.nextDouble();

        double horas = (pag * sec) / 3600;
        return horas;
    }
}
