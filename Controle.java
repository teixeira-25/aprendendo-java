public class Controle implements interCont
{
    //Caracteristicas/variáveis
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //getters e setters
    public void setVolume()
    {
        this.volume = volume;
    }
    public int getVolume()
    {
        return volume;
    }
    public void setligado()
    {
        this.ligado = ligado;
    }
    public boolean getLigado()
    {
        return ligado;
    }
    public void setTocando()
    {
        this.tocando = tocando;
    }
    public boolean getTocando()
    {
        return tocando;
    }
    //Metodos
    public void ligar()
    {
        ligado = true;
    }
    public void desligar()
    {
        ligado = false;
    }
    public void abrirMenu()
    {
        if (ligado == true)
        {
            System.out.println("------MENU--------");
            System.out.println("Ligado " + this.ligado);
            System.out.println("Tocando " + this.tocando);
            System.out.println("Volume " + this.volume);
        }
    }
    public void fecharMenu()
    {
        if (ligado == true)
        {
            System.out.println("Fechando o Menu......");
        }
    }

    @Override
    public void aumentarVolume()
    {
        if (ligado==true)
        {
            volume = volume + 5;
        }
    }
    @Override
    public void diminuirVolume()
    {
        if (ligado==true)
        {
            volume = volume - 5;
        }
    }

    public int aumentarVolume(int a)
    {
        if (ligado==true)
        {
            volume = volume + a;
            return volume;
        }
        return volume;
    }
    public int diminuirVolume(int a)
    {
        if (ligado==true)
        {
            volume = volume - a;
            return volume;
        }
        return volume;
    }
    public void ligarMudo()
    {
        if (ligado==true)
        {
            volume = 0;
        }
    }
    public void desligarMudo()
    {
        if (ligado==true)
        {
            volume = 50;
        }
    }
    public void play()
    {
        if (ligado == true && tocando == false)
        {
            tocando = true;
        }
    }
    public void pause()
    {
            if (ligado == true && tocando == false)
            {
                tocando = true;
            }
    }
    public Controle()
    {
        this.tocando = false;
        this.ligado = false;
        this.volume = 0;
    }
}