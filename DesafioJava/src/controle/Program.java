package controle;
import java.util.Scanner;
import dominio.MateriaPrima;

public class Program {

    public static void main(String[] args){

        Scanner leia  = new Scanner(System.in);
        System.out.print("Ol�, digite o n�mero da amostra: ");
        int num = leia.nextInt();
        System.out.print("Ol�, digite o % do conte�do do carbono: ");
        double carbono =leia.nextDouble();
        System.out.print("Ol�, digite o valor da dureza: ");
        double dureza = leia.nextDouble();
        System.out.print("Ol�, digite a resist�ncia a tra��o em psi: ");
        double tracao = leia.nextDouble();
        MateriaPrima m1 = new MateriaPrima(num,carbono,dureza,tracao);

        System.out.println();

        int grau = m1.Grau();
        System.out.print("O grau da amostra "+num+ " � "+grau);

    }

}