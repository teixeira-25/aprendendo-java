import java.util.Scanner;

public class Teste
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        Caneta tutu;
        tutu = new Caneta();
        tutu.cor = "azul";
        tutu.marca = "bic";
        System.out.println("A marca da caneta é " + tutu.marca );
        System.out.println("A cor da caneta é " + tutu.cor);
        tutu.estadoDaTampa();
        System.out.println("Digite [1] para tampar ou [2] para destampar");
        short h = leia.nextShort();
        tutu.estadoDaTampa(h);
        tutu.escrever("Tutu 5° lugar");
    }
}
