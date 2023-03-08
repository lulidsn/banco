
package Modelo;

public class Disciplina {
    
    private int num;
    private String nome;
    private double carga_horaria;
    private int cod_administrador;

    public Disciplina(int num, String nome, double carga_horaria, int cod_administrador) {
        this.num = num;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.cod_administrador = cod_administrador;
    }

    public Disciplina() {
        this.num = 0;
        this.nome = "";
        this.carga_horaria = 0;
        this.cod_administrador = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(double carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public int getCod_administrador() {
        return cod_administrador;
    }

    public void setCod_administrador(int cod_administrador) {
        this.cod_administrador = cod_administrador;
    }
    
    
}
