
package strategy;

import modelo.Carga;

/**
 *
 * @author kleverton.pasoares
 */
public class CBA implements CalculoFrete{
    @Override
    public double calcularFrete(Carga carga){
        //regra de negócio
        if (carga.getPeso() <= 10) {
            return 12;
        } else if (carga.getPeso() <= 20) {
            return 14.4;
        } else {
            return 16.11;
        }
    }
    
}
