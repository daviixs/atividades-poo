public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private final String senhaCorreta;
    private boolean acessoLiberado;

    public FechaduraEletronica(String senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public void validarAcesso(String senha) {
        acessoLiberado = senhaCorreta.equals(senha);

        if (acessoLiberado) {
            System.out.println("Acesso validado.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }

    @Override
    public void ligar() {
        if (acessoLiberado) {
            System.out.println("Fechadura destrancada.");
        } else {
            System.out.println("Acesso negado para destrancar.");
        }
    }

    @Override
    public void desligar() {
        System.out.println("Fechadura trancada.");
    }
}
