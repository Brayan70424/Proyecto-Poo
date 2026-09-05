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

}
