package models;

import interfaces.LavadoraFactory;

public abstract class Lavadora  {

    protected boolean tieneTambor;
    protected boolean tieneMandos;
    protected String  tipoCarga;

    public void ponerTambor() {
        tieneTambor = true;
    }

    public void ponerMandos() {
        tieneMandos = true;
    }

    public String toString(){
        return "Esta es una lavadora con carga "+tipoCarga +" \n" +
                "mandos: "+tieneMandos;
    }

}
