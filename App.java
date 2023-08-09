import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os dados do veículo:");
        System.out.println("(País); (Placa); (Combustivel);");
        Placa p1 = new Placa(in.next(),in.next());
        

        
        Veiculo v = new Veiculo(p1);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");
        in.close();

        
        v.abastece(65);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(250);
        System.out.println("Dados do veiculo depois de percorrer 250Km:");
        System.out.println(v);
        System.out.println("----------------");
        }
}