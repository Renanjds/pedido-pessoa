public class Comida {
    private String comidaFavorita;

    public Comida(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void escolherComida(){
        switch (comidaFavorita){
            case "Macarrão":
                System.out.println("Gosta de Macarrão");
                break;
            case "Feijoada":
                System.out.println("Gosta de Feijoada");
                break;
            case "Lasanha":
                System.out.println("Gosta de Lasanha");
                break;
            default:
                System.out.println("Opções : Lasanha, Feijoada e Macarrão");
        }
    }
}