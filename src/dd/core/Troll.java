package dd.core;

public class Troll extends Personaje{
    private static final String nombre = "Troll";
    private static final int numAtaques = 1;
    private static final int salud = 1000;

    public Troll(String nombre) {
        super(nombre, numAtaques, salud);
        setAtaque(randomAtaque());
    }

    Ataque randomAtaque(){
        switch ((int) (Math.random()*2)){
            case 0: return new AtaqueEspada();
            case 1: return new AtaqueArco();
            case 2: return new AtaqueCuchillo();
        }
        return new AtaqueCuchillo();
    }
}