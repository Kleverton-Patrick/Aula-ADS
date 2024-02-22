package roboTanque;

/**
 *
 * @author kleverton.pasoares
 */
public class TanqueRobo implements Posicao, Canhao, Cor {

    private int x;
    private int y;
    private String nome;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;

    public TanqueRobo() {
    }

    public TanqueRobo(int x, int y, String nome, CoresRGB corTanqye, CoresRGB corCanhao) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        this.corTanque = corTanqye;
        this.corCanhao = corCanhao;
    }

    @Override
    public void moveOeste() {
        x--;
    }

    @Override
    public void moveLeste() {
        x++;
    }

    @Override
    public void moveSul() {
        y--;
    }

    @Override
    public void moveNorte() {
        y++;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;
    }

    @Override
    public void atirar() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(long cadencia) {
        for (int i = 1; i <= 5; i++) {
            esperar(cadencia * 1000);
            System.out.println("Atirando...");
        }
    }
    /**
     * Cria um intervalo de tempo para o metodo atirar.
     * @param cadencia long(milisegundos)
     */
    private void esperar(long cadencia) {
        try {
            if(cadencia>5000){
                throw new IllegalArgumentException("Valor invãlido!");
            }
            Thread.sleep(cadencia);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;
    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

}
