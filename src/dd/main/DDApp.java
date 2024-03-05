package dd.main;

import dd.core.*;


public class DDApp {
    public static void main(String[] args) {
        new ControlLucha();
    }
}

class ControlLucha{
    public ControlLucha(){
        Personaje[] cruzados = {new Rey("Arturo"), new Caballero("Lancelot"), new Caballero("Percival")};
        int amenaza = (int)((Math.random()*5)+5);
        Personaje[] trolls = new Personaje[amenaza];
        for(int i = amenaza-1; i >= 0; i--){
            trolls[i] = new Troll("Troll " + (i+1));
        }

        int cruzadosVivos = cruzados.length-1;
        int trollsVivos= amenaza-1;
        String ganadores = "Ciudadanos";

        while(cruzadosVivos >= 0 && trollsVivos >= 0){

            printAtaque(cruzados[cruzadosVivos], trolls[trollsVivos]);
            if(trolls[trollsVivos].getSalud() <= 0) {
                trollsVivos--;
                if (trollsVivos < 0) {ganadores = "Caballeros de la Mesa Triangular"; break;}
            }

            printAtaque(trolls[trollsVivos], cruzados[cruzadosVivos]);
            if((cruzados[cruzadosVivos].getSalud() <= 0)) {
                cruzadosVivos--;
                if (cruzadosVivos < 0) ganadores = "Trols Aplastar (TM)";
            }
        }

        System.out.println("Vencieron los " + ganadores);
    }

    private void printAtaque(Personaje p1, Personaje p2){
        System.out.println(p1 +" ataca a "+ p2);
        int[] valoresAtaque=p1.ataca(p2);
        for(int valor:valoresAtaque){
            System.out.println( "   El valor del ataque es: " + (valor>0?valor:"falla"));
        }
    }
}



/*public class  ControlBasico{
    public static void main(String[] args) {
        //pruebas sin ejercitos ni victorias
        Personaje p1= new Rey("Arturo");
        p1.setAtaque(new AtaqueEspada());
        Personaje p2= new Troll("Troll 1");
        p2.setAtaque(new AtaqueArco());
        System.out.println(p1+","+p1.getAtaque());
        System.out.println(p2+","+p2.getAtaque());
        int[] valoresAtaque=p1.ataca(p2);
        for(int valor:valoresAtaque){
            System.out.println("p1 ataca a p2 y el valor del ataque es: "+
                    (valor>0?valor:"falla"));
        }
        System.out.println("comprobar salud actualizada de p2");
        //con salud <=0 lo considero muerto
        System.out.println(p2.getSalud()<=0?"MUERTO" + p2.getNombre():p2);

        System.out.println("Vamos a repetir el ataque pero ahora forzando que p2 muera poniendo salud a 1");
        //si todos los ataques son fallidos se salva!!!
        p2.setSalud(1);

        valoresAtaque=p1.ataca(p2);
        //si el ataque puede tener valor 0 para simular un fallo
        for(int valor:valoresAtaque){
            System.out.println("p1 ataca a p2 y el valor del ataque es: "+
                    (valor>0?valor:"falla"));
        }

        System.out.println("comprobar salud actualizada de p2");
        System.out.println(p2.getSalud()<0?"MUERTO maldito " + p2.getNombre():p2);
    }
}*/
