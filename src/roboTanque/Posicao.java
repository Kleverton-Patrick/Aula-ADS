
package roboTanque;

/**
 *
 * @author kleverton.pasoares
 */
public interface Posicao {
    public void moveOeste();
    public void moveLeste();
    public void moveSul();
    public void moveNorte();
    public int retPosicaoX();
    public int retPosicaoY();
}
