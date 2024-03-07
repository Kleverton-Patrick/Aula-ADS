package modelo;

/**
 *
 * @author kleverton.pasoares
 */
public class Carga { //Tipo abstrato de dados

    private double peso;
    private String descricao;

    public Carga() {
    }

    public Carga(double peso, String descricao) {
        this.peso = peso;
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Carga{" + "peso=" + peso + ", descricao=" + descricao + '}';
    }

}
