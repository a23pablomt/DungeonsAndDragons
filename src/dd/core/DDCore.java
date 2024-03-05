package dd.core;

class DDCore{
    void iniciarJuego(){

    }
}


class Personaje{
    String nombre;
    int ataque;
    int salud;

    public Personaje(String nombre, int ataque, int salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.salud = salud;
    }
}

class Troll extends Personaje{
    private static final String nombre = "Troll";
    private static final int ataque = (int)(Math.random()*3);
    private static final int salud = 1000;

    public Troll(String nombre, int ataque, int salud) {
        super(nombre, ataque, salud);
    }
}

class Caballero extends Personaje{
    private static final String nombre = "";
    private static final int ataque = 0;
    private static final int salud = 1500;

    public Caballero(String nombre, int ataque, int salud) {
        super(nombre, ataque, salud);
    }
}

class Rey extends Personaje{
    private static final String nombre = "Arturo";
    private static final int ataque = 0;
    private static final int salud = 2000;

    public Rey(String nombre, int ataque, int salud) {
        super(nombre, ataque, salud);
    }
}

class Ataque{
    String tipo;
    int factor;
}

class AtaqueEspada extends Ataque{
    private static final String tipo = "AtaqueEspada";
    private static final int factor = 100;
}
class AtaqueArco extends Ataque{
    private static final String tipo = "AtaqueArco";
    private static final int factor = 50;
}
class AtaqueCuchillo extends Ataque{
    private static final String tipo = "AtaqueCuchillo";
    private static final int factor = 25;
}