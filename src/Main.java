import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome ? ");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade ? ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        Pessoa pessoa = new Pessoa(nome,idade);

        System.out.println("Qual sua comida favorita ?");
        System.out.println("<Opções: Lasanha, Feijoada, Macarrão>");
        String comidaFavorita = scanner.nextLine();
        Comida comida = new Comida(comidaFavorita);

        // Limão, Abacaxi, Kiwi, Morango
        System.out.println("Qual sua bebida favorita ? ");
        System.out.println("<Opções: Limão , Abacaxi , Kiwi , Morango>");
        String bebidaFavorita = (scanner.nextLine());
        Bebida bebida = new Bebida(bebidaFavorita);

        scanner.close();

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
        System.out.println("Gosta de comer " + comida.getComidaFavorita() + " e tomar suco de " + bebida.getBebidaFavorita() + ".");
    }
}