
package Modelo;

public class Prova {
    
    private int num;
    private int cod_professor;

    public Prova(int num, int cod_professor) {
        this.num = num;
        this.cod_professor = cod_professor;
    }

    public Prova() {
        this.num = 0;
        this.cod_professor = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }
    
    
    
}
