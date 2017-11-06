/**
 * Created by Jordi on 03/11/2017.
 */
public class Prova {
    public static void main(String args[])
    {
        Revista r = new Revista("MC001","Mundo Científico", (short)2005,(short)1);
        Obra o = new Obra("EQ001","El Quixot","Miguel de Cervantes",(short)200);
        Volum v1 = new Volum("EC001","Enciclopèdia Catalana","Varis",(short)573,(short)1);
        Volum v2 = new Volum("EC002","Enciclopèdia Catalana","Varis",(short)602,(short)2);

        System.out.println("\nVisualització de la revista r:\n");
        r.mostrar();
        System.out.println("\nVisualització de l'obra o:\n");
        o.mostrar();
        System.out.println("\nVisualització del volum v1:\n");
        v1.mostrar();
        System.out.println("\nVisualització del volum v2:\n");
        v2.mostrar();
    }
}
