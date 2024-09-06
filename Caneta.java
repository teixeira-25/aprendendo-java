public class Caneta
{
    String cor;
    String marca;
    boolean tampa = true;
    public void escrever(String b)
    {
        if (tampa==false)
        {
            System.out.println(b);
        }else
        {
            estadoDaTampa();
            System.out.println("Incapaz de escrever");
        }
    }
    public void estadoDaTampa()
    {
        if (tampa==true)
        {
            System.out.println("Caneta tampada");
        } else
        {
            System.out.println("Caneta destampada");
        }
    }
    public void estadoDaTampa(short a)
    {
        if (a==2)
        {
            tampa = false;
        } else if (a==1)
        {
            tampa = true;
        }
    }
}