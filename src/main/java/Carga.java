import java.time.Year;
import java.util.Date;

public class Carga {
    private int ano;
    private float peso;
    private int classe;
    private float taxa;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int calcularClasse(){
        if (this.ano <=1970){
            if(this.peso < 1200){
                return 1;
            }
            if(this.peso <=1700) {
                return 2;
            }
            else {
                return 3;
            }
        }
        if (this.ano <=1979){
            if(this.peso <=1200){
                return 4;
            }
            if(this.peso <=1700) {
                return 5;
            }
            else {
                return 6;
            }
        }
        else {
            if(this.peso <1600){
                return 7;
            }
            else {
                return 8;
            }
        }
    }
    public double calcularTaxa(){
        if (this.ano <=1970){
            if(this.peso < 1200){
                return 16.50;
            }
            if(this.peso <=1700) {
                return 25.50;
            }
            else {
                return 46.50;
            }
        }
        if (this.ano <=1979){
            if(this.peso <=1200){
                return 27.50;
            }
            if(this.peso <=1700) {
                return 30.50;
            }
            else {
                return 52.50;
            }
        }
        else {
            if(this.peso <1600){
                return 19.50;
            }
            else {
                return 55.50;
            }
        }
    }
}
