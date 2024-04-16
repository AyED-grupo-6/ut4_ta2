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
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("UT4_TA2.pdf");
        int[] contador = new int[1];
        String[] paraEscribir = new String[archivo.length];

        TArbolBB arbolAB;
        for (int i = 0; i < archivo.length; i++) {
            paraEscribir[i] = arbolAB.buscar(archivo[i], contador).toString() + contador[0];
            contador[0] = 0;
        }

        ManejadorArchivosGenerico.escribirArchivo("busquedas.txt", paraEscribir);
    }

}
