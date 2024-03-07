
package carroEletricoAutonomo;

/**
 *
 * @author kleverton.pasoares
 */
public interface CarroEletricoAutonomo extends Bateria, VeiculoAutonomo{
    public void monitorarBateria();
    public void definirRota(String partida, String destino);
    
}
