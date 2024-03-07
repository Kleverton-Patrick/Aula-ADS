
package strategy;

import modelo.Carga;

/**
 *
 * @author kleverton.pasoares
 */
public class XPTO implements CalculoFrete{
    
    @Override
    public double calcularFrete(Carga carga){
        //regra de negócio
        if (carga.getPeso() <= 10) {
            return 9.69;
        } else if (carga.getPeso() <= 20) {
            return 11.12;
        } else {
            return 14.87;
        }
    }
    
}
