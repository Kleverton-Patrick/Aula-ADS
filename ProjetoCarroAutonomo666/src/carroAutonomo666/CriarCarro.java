
package carroAutonomo666;

/**
 *
 * @author kleverton.pasoares
 */
import carroEletricoAutonomo.*;
public class CriarCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tesla modelS = new Tesla(10, "Zona Lost", "Senac", true);
        modelS.desligarModoAutonomo();
        System.err.println(modelS);
    }
    
}
