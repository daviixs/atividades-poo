package composicao;

public class Funcionario {
    private int Id;
    private String nome, cpf, funcao;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cpf, String funcao) {
        Id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpr() {
        return cpf;
    }

    public void setCpr(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
