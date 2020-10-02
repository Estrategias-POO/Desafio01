using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Erapraserjava
{
    class Program
    {
        static void Main(string[] args)
        {
            Materiaprima m1 = new Materiaprima();
            Console.Write("Olá, digite o número da amostra: ");
            m1.Num = int.Parse(Console.ReadLine());
            Console.Write("Olá, digite o % do conteúdo do carbono: ");
            m1.Carbono = double.Parse(Console.ReadLine());
            Console.Write("Olá, digite o valor da dureza: ");
            m1.Dureza = double.Parse(Console.ReadLine());
            Console.Write("Olá, digite a resistência a tração em psi: ");
            m1.Tracao = double.Parse(Console.ReadLine());

            Console.WriteLine();

            Console.Write("O grau da amostra {0} é {1}",m1.Num, m1.Grau());
            Console.ReadKey();

        }

    }
}
