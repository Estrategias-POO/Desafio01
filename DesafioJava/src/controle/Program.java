package controle;
import java.util.Scanner;
import dominio.MateriaPrima;

public class Program {

    public static void main(String[] args){

        Scanner leia  = new Scanner(System.in);
        System.out.print("Olá, digite o número da amostra: ");
        int num = leia.nextInt();
        System.out.print("Olá, digite o % do conteúdo do carbono: ");
        double carbono =leia.nextDouble();
        System.out.print("Olá, digite o valor da dureza: ");
        double dureza = leia.nextDouble();
        System.out.print("Olá, digite a resistência a tração em psi: ");
        double tracao = leia.nextDouble();
        MateriaPrima m1 = new MateriaPrima(num,carbono,dureza,tracao);

        System.out.println();

        int grau = m1.Grau();
        System.out.print("O grau da amostra "+num+ " é "+grau);

    }

}