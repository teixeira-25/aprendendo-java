public class Caneta
{
    private String cor;
    String marca;
    static boolean tampa = true;
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
            System.out.println("Tampado");
        } else
        {
            System.out.println("Destampado");
        }
    }
    public void estadoDaTampa(String a)
    {
        if (a=="Destampar")
        {
            tampa = false;
        } else if (a=="Tampar")
        {
            tampa = true;
        }
    }
}