/**
 * Created by Jordi on 03/11/2017.
 */
public class Revista extends Fitxa {
    private short any;
    private short nro;

    public Revista (String referencia, String titol, short any, short nro) {
        super(referencia,titol);
        this.any = any;
        this.nro=nro;
    }

    public Revista (Revista f) {
        this(f.referencia, f.titol, f.any, f.nro);
    }

    public void setAny (short any) {
        this.any = any;
    }

    public short getAny () {
        return any;
    }

    public void setNro (short nro) {
        this.nro=nro;
    }

    public short getNro () {
        return nro;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Any:" + any);
        System.out.println("Nro:" + nro);
    }
}
