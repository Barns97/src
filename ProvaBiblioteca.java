import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Jordi on 03/11/2017.
 */
public class ProvaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int menu=0;
        int posicio=0;
        String referencia = null;

        boolean error = false, sortir = false;
        Revista revista = new Revista("Revista1","Sport", (short)2017,(short)4);
        Obra obra = new Obra("Obra1","CIEN AÑOS DE SOLEDAD","Gabriel García Márquez",(short)3);
        Volum volum = new Volum("Volum1","Origen","Kokei",(short)30,(short)3);

        Obra obra2 = new Obra("Obra2","ROMEO Y JULIETA","William Shakespeare",(short)3);

        biblioteca.capacitat();
        biblioteca.numExemplars();

        biblioteca.afegir(obra);
        biblioteca.afegir(revista);
        biblioteca.afegir(volum);


        do{

            try{
                error=true;
                System.out.println("\n\n--------------------MENÚ-------------------------");
                System.out.println("1-Mostrar capacitat biblioteca");
                System.out.println("2-Mostrar nº d'exemplars");
                System.out.println("3-Afegir");
                System.out.println("4-Cercar una fitxa a partir de la seva referència");
                System.out.println("5-Extreure una fitxa a partir de la seva referència");
                System.out.println("6-Cercar una fitxa a partir de la seva posició");
                System.out.println("7-Visualitzar el contingut de la biblioteca");
                System.out.println("0-Sortir");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("\nLa capacitat de la biblioteca es de: "+biblioteca.capacitat());
                        break;
                    case 2:
                        System.out.println("\nNúmero d'exemplars: "+biblioteca.numExemplars());
                        break;
                    case 3:
                        biblioteca.afegir(obra2);
                        break;
                    case 4:
                        System.out.println("\nEntri la referencia que vol crecar: ");
                        referencia = sc.next();
                        biblioteca.cercar(referencia);
                        break;
                    case 5:
                        System.out.println("\nEntri la referencia que vol extreure: ");
                        referencia = sc.next();
                        biblioteca.extreure(referencia);
                        break;
                    case 6:
                        System.out.println("\nEntri la posició que vol cercar: ");
                        posicio = sc.nextInt();
                        biblioteca.exemplarPerPosicio(posicio);
                        break;
                    case 7:
                        biblioteca.visualitzar();
                        break;
                    case 0:
                        sortir = true;
                        break;
                }
            }catch (NullPointerException e){
                System.out.println("\nEntri una opció valida.\n");
                error= true;
            }


        }while (!sortir || !error);
    }
}
