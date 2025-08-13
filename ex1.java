import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        int num1 = leitor.nextInt();

        System.out.println("Informe o segundo valor: ");
        int num2 = leitor.nextInt();

    
    }

    public static void Contar(int num1, int num2){

        if(num1 > num2){
            for(int i = 0; i <= num2; i++ ){
                System.out.println(i);
            }
        }
    
    }
}



