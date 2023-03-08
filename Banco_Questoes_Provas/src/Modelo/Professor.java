
package Modelo;

public class Professor {
    private int cod;
    private String nome;
    private String login;
    private String senha;
    private int cod_adm; //foreign key

    public Professor(int cod, String nome, String login, String senha, int cod_adm) {
        this.cod = cod;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cod_adm = cod_adm;
    }

    public Professor() {
        this.cod = 0;
        this.nome = "";
        this.login = "";
        this.senha = "";
        this.cod_adm = 0;
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

    public int getCod_adm() {
        return cod_adm;
    }

    public void setCod_adm(int cod_adm) {
        this.cod_adm = cod_adm;
    }
    
    
    
    
}
