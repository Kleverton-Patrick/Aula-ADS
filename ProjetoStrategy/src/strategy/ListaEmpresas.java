package strategy;

import modelo.Carga;

/**
 *
 * @author kleverton.pasoares
 */
public enum ListaEmpresas implements CalculoFrete {
    //são classes internas
    ABC {
        @Override
        public double calcularFrete(Carga carga) {
            //regra de negócio
            if (carga.getPeso() <= 10) {
                return 10.15;
            } else if (carga.getPeso() <= 20) {
                return 12.34;
            } else {
                return 15.28;
            }
        }

    },
    CBA {
        @Override
        public double calcularFrete(Carga carga) {
            //regra de negócio
            if (carga.getPeso() <= 10) {
                return 12;
            } else if (carga.getPeso() <= 20) {
                return 14.4;
            } else {
                return 16.11;
            }
        }

    },
    XPTO {
        @Override
        public double calcularFrete(Carga carga) {
            //regra de negócio
            if (carga.getPeso() <= 10) {
                return 9.69;
            } else if (carga.getPeso() <= 20) {
                return 11.12;
            } else {
                return 14.87;
            }
        }

    };

}
