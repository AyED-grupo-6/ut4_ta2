package com.example;

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (raiz == null) {
            raiz = unElemento;
            return true;
        }
        else{
            return raiz.insertar(unElemento);
        }
    }

    public boolean insertar(TElementoAB<T> unElemento, int[] contador) {
        if (raiz == null) {
            raiz = unElemento;
            return true;
        }
        else{
            return raiz.insertar(unElemento, contador);
        }
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (raiz == null) {
            return null;
        }
        return raiz.buscar(unaEtiqueta);
    }

    public TElementoAB<T> buscar(Comparable unaEtiqueta, int[] contador) {
        if (raiz == null) {
            return null;
        }
        return raiz.buscar(unaEtiqueta, contador);
    }

    @Override
    public String preOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public String inOrden() {
        return this.raiz.inOrden();
    }

    @Override
    public String postOrden() {
        return this.raiz.postOrden();
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

}
