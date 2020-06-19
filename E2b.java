import java.util.Scanner;

public class E2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, Base, Altura;

        // entrada (o valor da base do retangulo)
        System.out.println("Digite o lado da base do Retangulo");
        Base = teclado.nextFloat();

        System.out.println("Digite a altura do Retangulo");
        Altura = teclado.nextFloat();

        //Processamento (Calcular a area)
        area = Base * Altura;

        //Saida (Exibir o valor da area)
        System.out.println("A area do retangulo e = "+area);
    }

}