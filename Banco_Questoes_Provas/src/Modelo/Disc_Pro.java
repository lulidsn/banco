
package Modelo;

public class Disc_Pro {
    
    private int num;
    private int num_disc;
    private int cod_prof;

    public Disc_Pro(int num, int num_disc, int cod_prof) {
        this.num = num;
        this.num_disc = num_disc;
        this.cod_prof = cod_prof;
    }

    public Disc_Pro() {
        this.num = 0;
        this.num_disc = 0;
        this.cod_prof = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum_disc() {
        return num_disc;
    }

    public void setNum_disc(int num_disc) {
        this.num_disc = num_disc;
    }

    public int getCod_prof() {
        return cod_prof;
    }

    public void setCod_prof(int cod_prof) {
        this.cod_prof = cod_prof;
    }

    
    
    
    
}
