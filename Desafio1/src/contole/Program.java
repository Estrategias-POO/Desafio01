package controle;
import java.util.Scanner;
import controle.MateriaPrima.MateriaPrima;

public class Program {

    public static void main(String[] args){
        Materiaprima m1 = new Materiaprima();
        Scanner leia  = new Scanner(System.in);
        System.out.print("Olá, digite o número da amostra: ");
        m1.num = leia.nextInt();
        System.out.print("Olá, digite o % do conteúdo do carbono: ");
        m1.carbono =leia.nextDouble();
        System.out.print("Olá, digite o valor da dureza: ");
        m1.dureza = leia.nextDouble();
        System.out.print("Olá, digite a resistência a tração em psi: ");
        m1.tracao = leia.nextDouble();

        System.out.println();
        

        System.out.print("O grau da amostra {0} é {1}",m1.num, m1.Grau());
        
    }
    
}
