
package Modelo;

public class Pro_Assu {
    private int num;
    private int num_prova;
    private int num_assunto;

    public Pro_Assu(int num, int num_prova, int num_assunto) {
        this.num = num;
        this.num_prova = num_prova;
        this.num_assunto = num_assunto;
    }

    public Pro_Assu() {
        this.num = 0;
        this.num_prova = 0;
        this.num_assunto = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum_prova() {
        return num_prova;
    }

    public void setNum_prova(int num_prova) {
        this.num_prova = num_prova;
    }

    public int getNum_assunto() {
        return num_assunto;
    }

    public void setNum_assunto(int num_assunto) {
        this.num_assunto = num_assunto;
    }
    
    
    
}
