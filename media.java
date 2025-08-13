import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1 = notas();
        double nota2 = notas();
        double nota3 = notas();
        double mediaNum = media(nota1, nota2, nota3);
        System.out.println("A média final é: " + mediaNum);

        String passoou = passou(mediaNum);
        System.out.println("Sua situação final: " + passoou);
    }
    
    public static int notas(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe uma nota: ");
        int nota =  leitor.nextInt();
        return nota;
    }

    public static  double media(double n1, double n2, double n3){
        double mediaNum = (n1 + n2 + n3) / 3;
        return mediaNum;
    }

    public static String passou(double mediaNum){
        String msg;
        if (mediaNum <=3){
            msg = "Repetiu";
        }
        else if(mediaNum <= 5){
            msg = "Recuperação";
        }
        else{
            msg = "aprovado";
        }
        return msg;
    }
}
