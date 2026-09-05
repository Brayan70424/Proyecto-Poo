public class Personaje {

    private String nombre;
    private int nivel;
    private double vida;
    private boolean estaVivo;

    public Personaje() {
        this("Sin nombre", 1);
    }

    public Personaje(String nombre) {
        this(nombre, 1);
    }

    public Personaje(String nombre, int nivel) {
        this(nombre, nivel, 100.0, true);
    }

    public Personaje(String nombre, int nivel, double vida, boolean estaVivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.estaVivo = estaVivo;
    }

}
