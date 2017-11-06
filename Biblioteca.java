/**
 * Created by Jordi on 03/11/2017.
 */
public class Biblioteca {

    private Fitxa fitxas[];
    private int nExemplars;

    public int capacitat(){
        fitxas = new Fitxa[50];

        return fitxas.length;
    }

    public int numExemplars(){


        return  nExemplars;
    }

    public void afegir(Fitxa fitxa){
        Boolean igual=false;
        if(fitxa==null){
            System.out.println("No es pot afegir perque és null.");
        }
        if(nExemplars==fitxas.length){
            System.out.println("No es pot afegir perque no hi ha capacitat.");
        }
        int i =0;
        for(i = 0; i<nExemplars; i++){
           if( fitxas[i].getReferencia().equals(fitxa.getReferencia())==true){
               igual = true;
               System.out.println("Esta repetit");
               break;
           }
        }
        if(!igual) {
            System.out.println("Afegit");
            fitxas[nExemplars] = fitxa;
            nExemplars++;
        }


    }

    public void cercar(String referencia){
        boolean igual = false;
        for(int i =0; i<nExemplars ; i++){
            if(fitxas[i].getReferencia().equals(referencia)==true){
                igual = true;
                System.out.println(fitxas[i]);
                break;
            }

        }
        if(!igual) {
            System.out.println("No hi ha cap fitxa amb aquesta referencia.");
        }
    }

    public void extreure(String referencia){
        int i;
        for (i=0; i<nExemplars && fitxas[i].getReferencia().equals(referencia)==false; i++);
        if (i==nExemplars) System.out.println("No s'ha trobat la fitxa");
        for (; i<nExemplars-1; i++) fitxas[i]=fitxas[i+1];
        fitxas[nExemplars-1]=null;
        nExemplars--;
        System.out.println("S'ha eliminat correctament");
    }

    public void exemplarPerPosicio(int i) {
        if (i<0 || i>=nExemplars){
            System.out.println("Entra correctament la posició");
        }else System.out.println(fitxas[i]);
    }

    public void visualitzar(){

        for(int i=0; i<nExemplars;i++){
            System.out.println("Fitxa nº"+i+" "+fitxas[i]);
        }
    }
}
