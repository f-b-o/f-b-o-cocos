import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de cocos: ");
        int cocos = scanner.nextInt();

        System.out.print("Digite o valor de um coco: R$ ");
        double valor = scanner.nextDouble();

        
        double valorTotal = valor* cocos;

        
        System.out.println("O valor total da venda é: "+ valorTotal);

        scanner.close();
    }
}
