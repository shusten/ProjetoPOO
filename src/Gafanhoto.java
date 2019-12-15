public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistido;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistido = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "login='" + login + '\'' +
                ", totAssistindo=" + totAssistido +
                '}';
    }
}
