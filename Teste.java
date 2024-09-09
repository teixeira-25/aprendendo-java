import java.util.Scanner;

public class Teste
{
    public static void main(String[] args)
    {
        String c = " ";
        Scanner leia = new Scanner(System.in);
        Caneta tutu = new Caneta();
        tutu.status();
        System.out.println("Digite [1] para tampar ou [2] para destampar");
        short h = leia.nextShort();
        leia.nextLine();
        tutu.estadoDaTampa(h);
        if (!tutu.tampa)
        {
            System.out.println("O que quer que seja escrito?");
            c =  leia.nextLine();
        }
        tutu.escrever(c);
    }
}