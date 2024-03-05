package dd.core;

public class Troll extends Personaje{

    public Troll(String nombre) {
        super(nombre, randomAtaque(), 1, 1000);
    }

    static Ataque randomAtaque(){
        return switch ((int) (Math.random() * 2)) {
            case 0 -> new AtaqueEspada();
            case 1 -> new AtaqueArco();
            default -> new AtaqueCuchillo();
        };
    }
}