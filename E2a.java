import java.util.Scanner;

public class E2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float lado, area;

        // entrada (o valor do lado do quadrado)
        System.out.println("Digite o lado do Quadrado");
        lado = teclado.nextFloat();

        //Processamento (Calcular a area)
        area = lado * lado;

        //Saida (Exibir o valor da area)
        System.out.println("O valor da area = "+area);
    }

}