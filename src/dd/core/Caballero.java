package dd.core;

class Caballero extends Personaje{
    private static final int numAtaques = 2;
    private static final int salud = 1500;

    public Caballero(String nombre, Ataque ataque, int numAtaques, int salud) {
        super(nombre, numAtaques, salud);
    }

    Ataque randomAtaque(){
        if((int) (Math.random()*1) == 0)return new AtaqueEspada();
        else return new AtaqueArco();
    }
}