/**
 * Created by Jordi on 03/11/2017.
 */
public class Obra extends Fitxa {
    protected String autor;
    protected short nrePags;

    public Obra (String referencia, String titol, String autor, short nrePags) {
        super(referencia,titol);
        this.autor = autor;
        this.nrePags=nrePags;
    }

    public Obra (Obra f) {
        this(f.referencia, f.titol, f.autor, f.nrePags);
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public String getAutor () {
        return autor;
    }

    public void setNrePags (short nrePags) {
        this.nrePags=nrePags;
    }

    public short getNrePags () {
        return nrePags;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Autor:" + autor);
        System.out.println("Nombre Pàgines:" + nrePags);
    }
}

