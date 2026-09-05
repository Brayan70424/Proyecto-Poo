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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
        if (this.vida <= 0) {
            this.estaVivo = false;
        }
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

}
