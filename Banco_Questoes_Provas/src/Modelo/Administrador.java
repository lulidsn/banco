
package Modelo;

public class Administrador {
    private int cod;
    private String nome;
    private String login;
    private String senha;

    public Administrador() {
        this.cod = 0;
        this.nome = "";
        this.login = "";
        this.senha = "";
    }

    public Administrador(int cod, String nome, String login, String senha) {
        this.cod = cod;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
