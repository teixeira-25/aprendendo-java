public class Caneta
{
    private String cor;
    public String getCor()
    {
        return cor;
    }
    public void setCor(String c)
    {
        this.cor = c;
    }
    private String marca;
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public boolean tampa = true;
    public boolean isTampa() {
        return tampa;
    }
    public void setTampa(boolean tampa) {
        this.tampa = tampa;
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
    public void escrever(String b)
    {
        if (!tampa)
        {
            System.out.println(b);
        }else
        {
            estadoDaTampa();
            System.out.println("Incapaz de escrever");
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
    public Caneta(boolean tampa, String cor, String marca)
    {
        this.setTampa(tampa);
        this.setCor(cor);
        this.setMarca(marca);
    }
    public Caneta()
    {
        this.setTampa(true);
        this.setCor("Azul");
        this.setMarca("BIC");
    }
    public void status()
    {
        System.out.println("Cor " + cor );
        System.out.println("Tampada " + tampa);
        System.out.println("Marca " + marca);
    }
}