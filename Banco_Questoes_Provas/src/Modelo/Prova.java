
package Modelo;

public class Prova {
    
    private int num;
    private int cod_professor;
    private String nome;

    public Prova(int num, int cod_professor, String nome) {
        this.num = num;
        this.cod_professor = cod_professor;
        this.nome = nome;
    }

    public Prova() {
        this.num = 0;
        this.cod_professor = 0;
        this.nome = "";
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    
    
    
    
    
}
