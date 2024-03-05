package dd.core;

import java.util.Objects;

public class Caballero extends Personaje{

    public Caballero(String nombre) {
        super(nombre, nombreCaballero(nombre), 2, 1500);
    }

    static Ataque nombreCaballero(String nombre){
        if(Objects.equals(nombre, "Lancelot")) return new AtaqueEspada();
        else return new AtaqueArco();
    }
}