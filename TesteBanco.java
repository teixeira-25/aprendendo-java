public class TesteBanco
{
    public static void main(String[] args)
    {
     Banco bnv = new Banco();
     bnv.setNome("Gabriel");
     bnv.setTipo("cp");
     bnv.abrirConta(true);
     bnv.depositar(200);
     bnv.sacar(90);
     bnv.estadoConta();


    }
}