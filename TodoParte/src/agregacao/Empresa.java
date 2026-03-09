package agregacao;

import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nome;
    private ArrayList Freelancers;
    private String cnpj;

    public Empresa() {
        this.Freelancers = new ArrayList();
    }

    public Empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.Freelancers = new ArrayList();
    }

    public void adcionarFreelancer(FreeLancer freelancer) {
        this.Freelancers.add(freelancer);
    }

    public void removerFreelancer(FreeLancer freelancer) {
        this.Freelancers.remove(freelancer);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Freelancers=" + Freelancers +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getFreelancers() {
        return Freelancers;
    }

    public void setFreelancers(ArrayList freelancers) {
        Freelancers = freelancers;
    }

}
