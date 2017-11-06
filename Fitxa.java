/**
 * Created by Jordi on 03/11/2017.
 */
public abstract class Fitxa {
    protected String referencia;
    protected String titol;

    public Fitxa (String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public Fitxa (Fitxa fitxa) {
        this(fitxa.referencia, fitxa.titol);
    }


    public void setReferencia (String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia () {
        return referencia;
    }

    public void setTitol (String titol) {
        this.titol = titol;
    }

    public String getTitol () {
        return titol;
    }

    public void mostrar() {
        System.out.println("Referència:" + referencia);
        System.out.println("Títol:" + titol);
    }

    public String toString() {
        return referencia + " " + titol;
    }
}
