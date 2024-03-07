package cliente;

import modelo.Carga;

/**
 *
 * @author kleverton.pasoares
 */
import strategy.*;

public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carga carga = new Carga(22, "Livros da Gof");
        //double frete = ListaEmpresas.ABC.calcularFrete(carga);
        double frete = ListaEmpresas.values()[2].calcularFrete(carga);
        System.out.println(frete);
        //System.out.println(calcularFrete(1, carga));
    }

//    public static double calcularFrete(int opc, Carga carga) {
//        CalculoFrete empresa;
//        if (opc == 1) {//ABC
//            empresa = new ABC();
//        } else if (opc == 2) {//CBA
//            empresa = new CBA();
//        } else if (opc == 3) {//XPTO
//            empresa = new XPTO();
//        } else {
//            throw new IllegalArgumentException("Empresa Inválida!");
//        }
//        return empresa.calcularFrete(carga);
//    }

}
