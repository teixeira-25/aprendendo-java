import java.util.Random;

public class Banco
{
    Random aleatorio =  new Random();
    public String numConta;
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    protected String tipo;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int saldo;
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    private boolean status;
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Banco( )
    {
        this.saldo=0;
        this.status=false;
        numConta();
    }
    public boolean abrirConta(boolean a)
    {
        if (a=true)
        {
            status = true;
        }else
        {
            status = false;
        }
    return status;
    }
    public boolean fecharConta(boolean a)
    {
        if (a=true)
        {
            status = false;
        }else
        {
            status = true;
        }
        return status;
    }
    public boolean depositar(int a) {
        if (status == true) {
            this.saldo = saldo + a;
            return true;
        } else {
            System.out.println("Impossivel depositar, conta fechada.");
            return false;
        }
    }
    public boolean sacar(int a)
    {
        if (a<saldo)
        {
            if (status == true) {
                this.saldo = saldo - a;
                return true;
            } else {
                System.out.println("Impossivel sacar, conta fechada.");
                return false;
            }
        }else
        {
            System.out.println("Saldo insificiente");
            return true;
        }
    }
    public int pagamentoMensal(boolean a)
    {
            if (a = true) {
                this.saldo = saldo - 12;
            }
            return saldo;
    }
    public void estadoConta()
    {
        System.out.println("N° Conta " + this.numConta);
        System.out.println("Tipo da Conta " + this.tipo);
        System.out.println("Nome " + this.nome);
        System.out.println("Saldo da conta " + this.saldo);
        System.out.println("Conta aberta " + this.status);
    }
    public void numConta()
    {
        String randon = "";
        for (int i = 0; i<10; i++)
        {
            int numeroAleatorio = aleatorio.nextInt(10);
            randon = randon + numeroAleatorio;
        }
        numConta = randon;
    }
}