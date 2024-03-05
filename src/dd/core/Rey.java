package dd.core;

public class Rey extends Personaje{
    private static final int numAtaques = 3;
    public static final int salud = 2000;

    public Rey(String nombre) {
        super(nombre, numAtaques, salud);
    }
}