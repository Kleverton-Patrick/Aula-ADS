

package cliente;

/**
 *
 * @author kleverton.pasoares
 */
import heranca.*;
public class UsaHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p=new Pessoa("Sandra");
        
        PessoaFisica pf=new PessoaFisica("Gerson", 12345678901L);
        
        PessoaJuridica pj=new PessoaJuridica(123456789053L, "XPTO");
        
        Funcionario f=new Funcionario(123, "Mel", 0123456);
       
        System.out.println(pf);
    }
    
}


