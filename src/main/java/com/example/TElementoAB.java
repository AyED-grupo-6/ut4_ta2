package com.example;

public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEtiqueta'");
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHijoIzq'");
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHijoDer'");
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHijoIzq'");
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHijoDer'");
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
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
    public T getDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDatos'");
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }


}
