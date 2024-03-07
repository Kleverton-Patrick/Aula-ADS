
package heranca;

/**
 *
 * @author kleverton.pasoares
 */
public class Funcionario extends PessoaFisica{
    private int matricula;

    public Funcionario() {
    }

    public Funcionario(int matricula, String nome, long cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +" nome="+getNome()+" cpf="+getCpf() + " matricula=" + matricula + '}';
    }
    
    
}
