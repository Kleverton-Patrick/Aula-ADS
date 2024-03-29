
package heranca;

/**
 *
 * @author kleverton.pasoares
 */
public class PessoaJuridica extends Pessoa{
     private long cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(long cnpj, String nome) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +"nome="+ getNome()+ " cnpj=" + cnpj + '}';
    } 
}

