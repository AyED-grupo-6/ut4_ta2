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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public String preOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public String inOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inOrden'");
    }

    @Override
    public String postOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrden'");
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

       }
