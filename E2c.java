import java.util.Scanner;

public class E2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float area, Base, Altura;

        // entrada (o valor da base do Triangulo)
        System.out.println("Digite o lado da base do Triangulo");
        Base = teclado.nextFloat();

        System.out.println("Digite a altura do Triangulo");
        Altura = teclado.nextFloat();

        //Processamento (Calcular a area)
        area = (Base * Altura)/2;

        //Saida (Exibir o valor da area)
        System.out.println("A area do Trianbulo e = "+area);
    }

}