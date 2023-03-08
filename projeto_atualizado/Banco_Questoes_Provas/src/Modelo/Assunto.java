
package Modelo;


public class Assunto {
    
    private int num;
    private String nome;
    private double carga_horaria;
    private int num_disciplina;

    public Assunto(int num, String nome, double carga_horaria, int num_disciplina) {
        this.num = num;
        this.nome = nome;
        this.carga_horaria = carga_horaria;
        this.num_disciplina = num_disciplina;
    }

    public Assunto() {
        this.num = 0;
        this.nome = "";
        this.carga_horaria = 0;
        this.num_disciplina = 0;
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

    public int getNum_disciplina() {
        return num_disciplina;
    }

    public void setNum_disciplina(int num_disciplina) {
        this.num_disciplina = num_disciplina;
    }
    
    
    
}
