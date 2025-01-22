import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Qual seu nome ? ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Qual sua idade ? ");
        pessoa.setIdade(scanner.nextInt());
        scanner.nextLine();

        Comida comida = new Comida();
        System.out.println("Qual sua comida favorita ?");
        System.out.println("Opções: Lasanha, Feijoada, Macarrão");
        comida.setComidaFavorita(scanner.nextLine());

        Bebida bebida = new Bebida();
        // Limão, Abacaxi, Kiwi, Morango
        System.out.println("Qual sua bebida favorita ? ");
        System.out.println("Opções : Limão , Abacaxi , Kiwi , Morango");
        bebida.setBebidaFavorita(scanner.nextLine());

        scanner.close();

    }
}