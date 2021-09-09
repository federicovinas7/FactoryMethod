package models;

import interfaces.LavadoraFactory;

public class LavadoraFactoryIMP implements LavadoraFactory {

    @Override
    public Lavadora create(String tipoCarga) {
       return
               tipoCarga.equalsIgnoreCase("frontal") ?  new LavadoraCargaFrontal()
            :  new LavadoraCargaSuperior();
    }
}
