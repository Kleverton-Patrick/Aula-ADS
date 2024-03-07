package arena;

/**
 *
 * @author kleverton.pasoares
 */
import roboTanque.TanqueRobo;
import roboTanque.CoresRGB;

public class Arena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TanqueRobo tanqueTeste = new TanqueRobo(0, 0, "Crazy", CoresRGB.BLUE, CoresRGB.RED);
        try {
            tanqueTeste.atirar(6);
        } catch (IllegalArgumentException e) {
            System.err.println("Digite valores antre 1 e 5");
        }
        tanqueTeste.moveLeste();
        tanqueTeste.moveLeste();
        System.err.println("Posição X: " + tanqueTeste.retPosicaoX());
    }

}
