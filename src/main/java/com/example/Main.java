package com.example;

/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = new int[1];
        x[0] = 0;
        TArbolBB arbol = new TArbolBB();

        String[] claves = ManejadorArchivosGenerico.leerArchivo("C:\\Users\\kitad\\Documents\\Ucu\\algoritmos2024\\ut4_ta2\\claves1.txt");

        for (String clave : claves) {
            TElementoAB elemento = new TElementoAB<String>((Comparable) clave, clave.toString());
            arbol.insertar(elemento, x);
            System.out.println(x[0]);
            x[0] = 0;
        }



    }

}
