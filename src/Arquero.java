public class Arquero extends Personaje {

    private int precision;
    private double distanciaAtaque;
    private char tipoFlecha;
    private boolean tieneAljabaExtra;

    public Arquero(String nombre, int precision) {
        super(nombre);
        this.precision = precision;
        this.distanciaAtaque = 15.0;
        this.tipoFlecha = 'N';
        this.tieneAljabaExtra = false;
    }

    public Arquero(String nombre, int nivel, double distanciaAtaque, char tipoFlecha) {
        super(nombre, nivel);
        this.distanciaAtaque = distanciaAtaque;
        this.tipoFlecha = tipoFlecha;
        this.precision = 70;
        this.tieneAljabaExtra = false;
    }

}
