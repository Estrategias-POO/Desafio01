package controle;
import java.util.Scanner;
import MateriaPrima;

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
        Materiaprima m1 = new Materiaprima(num,carbono,dureza,tracao);

        System.out.println();
        

        System.out.print("O grau da amostra {0} é {1}",m1.num, m1.Grau());
        
    }
    
}
