package reproductor;
import ListasE.Lista;
import ListasE.Nodo;
import java.util.Scanner;
import reproductor.ListaCancion;


public class ListaCancion {


    public NodoMusic primero =null;
    public Cancion n();
    public ListaCancion() {
        primero = null;
    }


    public Cancion leerEntero() {
        System.out.println("Ingrese valor -1 para terminar");
        System.out.println(   );


        return Integer.parseInt(new Scanner(System.in).nextLine());

    }

    public ListaCancion crearLista() {
        int x = 0;
        primero = null;
        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        } while (x != -1);
        return this;

    }

}
