
package Modelo;

public class Disc_Pro {
    
    private int num;
    private int num_disciplina;
    private int cod_professor;

    public Disc_Pro(int num, int num_disciplina, int cod_professor) {
        this.num = num;
        this.num_disciplina = num_disciplina;
        this.cod_professor = cod_professor;
    }

    public Disc_Pro() {
        this.num = 0;
        this.num_disciplina = 0;
        this.cod_professor = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum_disciplina() {
        return num_disciplina;
    }

    public void setNum_disciplina(int num_disciplina) {
        this.num_disciplina = num_disciplina;
    }

    public int getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }
    
    
    
    
}
