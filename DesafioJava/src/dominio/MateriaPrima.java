package dominio;
public class MateriaPrima{

    private int num;
    private double carbono;
    private double dureza;
    private double tracao;
    
    public MateriaPrima(int num,double carbono,double dureza,double tracao){
        this.num = num;
        this.carbono = carbono;
        this.dureza = dureza;
        this.tracao = tracao;
    }

    public int getnum(){
        return num;
    }

    public void setnum(int num){
        this.num = num;
    }

    public double getcarbono(){
        return carbono;
    }

    public void setcarbono(double carbono){
        this.carbono = carbono;
    }

    public double getdureza(){
        return dureza;
    }

    public void setdureza (double dureza){
        this.dureza = dureza;
    }

    public double gettracao(){
        return tracao;
    }

    public void settracao(double tracao){
        this.tracao = tracao;
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