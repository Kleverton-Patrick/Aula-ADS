
package strategy;

import modelo.Carga;

/**
 *
 * @author kleverton.pasoares
 */
public class ABC implements CalculoFrete{
    
    @Override
    public double calcularFrete(Carga carga){
        //regra de negócio
        if (carga.getPeso() <= 10) {
            return 10.15;
        } else if (carga.getPeso() <= 20) {
            return 12.34;
        } else {
            return 15.28;
        }
    }
    
}
