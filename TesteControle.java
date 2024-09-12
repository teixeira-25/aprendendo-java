public class TesteControle
{
    public static void main(String[] args)
    {
        Controle lg = new Controle();
        lg.ligar();
        lg.play();
        lg.aumentarVolume();
        lg.aumentarVolume();
        lg.ligarMudo();
        lg.desligarMudo();
        lg.diminuirVolume();
        lg.abrirMenu();
        lg.fecharMenu();
    }
}
