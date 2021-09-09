package interfaces;

import models.Lavadora;

public interface LavadoraFactory {
     Lavadora create(String tipoCarga);
}
