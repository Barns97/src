/**
 * Created by Jordi on 03/11/2017.
 */
public class Volum extends Obra{
    private short nro;

    public Volum (String referencia, String titol, String autor,short nrePags, short nro) {
        super(referencia,titol,autor,nrePags);
        this.nro=nro;
    }

    public Volum (Volum f) {
        this(f.referencia, f.titol, f.autor, f.nrePags, f.nro);
    }

    public void setNro (short nro) {
        this.nro=nro;
    }

    public short getNro () {
        return nro;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Nro:" + nro);
    }
}
