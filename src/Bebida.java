public class Bebida {
    private String bebidaFavorita;

    public Bebida(String bebidaFavorita) {
        this.bebidaFavorita = bebidaFavorita;
    }

    public String getBebidaFavorita() {
        return bebidaFavorita;
    }
    public void setBebidaFavorita(String bebidaFavorita) {
        this.bebidaFavorita = bebidaFavorita;
    }

    public void escolherBebida() {
            switch (bebidaFavorita){
                case "Limão":
                    System.out.println("Caipirinha de Limão");
                    break;
                case "Abacaxi":
                    System.out.println("Caipirinha de Abacaxi");
                    break;
                case "Kiwi":
                    System.out.println("Caipirinha de Kiwi");
                    break;
                case "Morango":
                    System.out.println("Caipirinha de Morango");
                    break;
                default:
                    System.out.println("Escolha uma opção valida");
                    break;
            }
    }
}
