public class Main {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" SISTEMA DE PERSONAJES - VIDEOJUEGO");
        System.out.println("=================================================\n");

        Personaje personajeVacio = new Personaje();
        Personaje npcGenerico = new Personaje("Aldeano");
        Personaje viajero = new Personaje("Viajero", 5);
        Personaje narrador = new Personaje("El Cronista", 50, 999.0, true);

        System.out.println("--- Personajes genericos (superclase) ---");
        System.out.println(personajeVacio);
        System.out.println(npcGenerico);
        System.out.println(viajero);
        System.out.println(narrador);

        Guerrero guerrero1 = new Guerrero("Thoric", 25);
        Guerrero guerrero2 = new Guerrero("Brunhilda", 8, 40, 'H');
        Guerrero guerrero3 = new Guerrero("Magnus", 20, 200.0, true, 60, 30.0, 'M', true);

        System.out.println("\n--- Guerreros ---");
        System.out.println(guerrero1);
        System.out.println(guerrero2);
        System.out.println(guerrero3);

    }
}
