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

}
