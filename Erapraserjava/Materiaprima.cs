using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Metadata.W3cXsd2001;
using System.Text;
using System.Threading.Tasks;

namespace Erapraserjava
{
    class Materiaprima
    {
        private int num;
        private double carbono;
        private double dureza;
        private double tracao;

        public  Materiaprima()
        {
            this.carbono = 0;
            this.dureza = 0;
            this.tracao = 0;
        }
        public Materiaprima(double carbono,double dureza,double tracao)
        {
            this.carbono = carbono;
            this.dureza = dureza;
            this.tracao = tracao;
        }


        public int Num
        {
            get
            {
                return num;
            }
            set
            {
                this.num = value;
            }
        }
        public double Carbono
        {
            get
            {
                return carbono;
            }
            set
            {
                this.carbono = value;
            }
        }
            public double Dureza
        {
            get
            {
                return Dureza;
            }
            set
            {
                this.dureza = value;
            }
        }
            public double Tracao
        {
            get
            {
                return tracao;
            }
            set
            {
                this.tracao = value;
            }
        }

            public int Grau()
        {
            if(carbono < 7 && dureza > 50 && tracao > 80000)
            {
                return 10;
            }

            else if(carbono < 7 && dureza > 50 && tracao < 80000)
            {
                return 9;
            }

            else if(carbono < 7 && dureza < 50 && tracao < 80000)
            {
                return 8;
            }

            else
            {
                return 7;
            }
        }
        
    }
}
