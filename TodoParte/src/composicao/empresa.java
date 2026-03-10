package composicao;

import java.util.ArrayList;

public class empresa {
    private int id;
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public empresa(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(int id, String nome, String cpf, String funcao) {
        this.funcionarios.add(new Funcionario(id, nome, cpf, funcao));
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(int id) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == id) {
                this.funcionarios.remove(i);
                return;
            }
        }
        System.out.println("Funcionario nao encontrado");
    }

}
