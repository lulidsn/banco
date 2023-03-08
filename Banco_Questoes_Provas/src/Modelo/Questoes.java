
package Modelo;

public class Questoes {
    
    private int num;
    private String enunciado;
    private String alternativa_a;
    private String alternativa_b;
    private String alternativa_c;
    private String alternativa_d;
    private String alternativa_correta;
    private int cod_prof;
    private int num_disc;
    private int num_assu;

    public Questoes(int num, String enunciado, String alternativa_a, String alternativa_b, String alternativa_c, String alternativa_d, String alternativa_correta, int cod_professor, int num_disciplina, int num_assunto) {
        this.num = num;
        this.enunciado = enunciado;
        this.alternativa_a = alternativa_a;
        this.alternativa_b = alternativa_b;
        this.alternativa_c = alternativa_c;
        this.alternativa_d = alternativa_d;
        this.alternativa_correta = alternativa_correta;
        this.cod_prof = cod_professor;
        this.num_disc = num_disciplina;
        this.num_assu = num_assunto;
    }

    public Questoes() {
        this.num = 0;
        this.enunciado = "";
        this.alternativa_a = "";
        this.alternativa_b = "";
        this.alternativa_c = "";
        this.alternativa_d = "";
        this.alternativa_correta = "";
        this.cod_prof = 0;
        this.num_disc = 0;
        this.num_assu = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAlternativa_a() {
        return alternativa_a;
    }

    public void setAlternativa_a(String alternativa_a) {
        this.alternativa_a = alternativa_a;
    }

    public String getAlternativa_b() {
        return alternativa_b;
    }

    public void setAlternativa_b(String alternativa_b) {
        this.alternativa_b = alternativa_b;
    }

    public String getAlternativa_c() {
        return alternativa_c;
    }

    public void setAlternativa_c(String alternativa_c) {
        this.alternativa_c = alternativa_c;
    }

    public String getAlternativa_d() {
        return alternativa_d;
    }

    public void setAlternativa_d(String alternativa_d) {
        this.alternativa_d = alternativa_d;
    }

    public String getAlternativa_correta() {
        return alternativa_correta;
    }

    public void setAlternativa_correta(String alternativa_correta) {
        this.alternativa_correta = alternativa_correta;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    public int getNum_disc() {
        return num_disc;
    }

    public void setNum_disc(int num_disc) {
        this.num_disc = num_disc;
    }

    public int getNum_assu() {
        return num_assu;
    }

    public void setNum_assu(int num_assu) {
        this.num_assu = num_assu;
    }
    
    
}
