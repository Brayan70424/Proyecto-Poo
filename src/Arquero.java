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

    public Arquero(String nombre, int nivel, double vida, boolean estaVivo,
                    int precision, double distanciaAtaque, char tipoFlecha, boolean tieneAljabaExtra) {
        super(nombre, nivel, vida, estaVivo);
        this.precision = precision;
        this.distanciaAtaque = distanciaAtaque;
        this.tipoFlecha = tipoFlecha;
        this.tieneAljabaExtra = tieneAljabaExtra;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public double getDistanciaAtaque() {
        return distanciaAtaque;
    }

    public void setDistanciaAtaque(double distanciaAtaque) {
        this.distanciaAtaque = distanciaAtaque;
    }

    public char getTipoFlecha() {
        return tipoFlecha;
    }

    public void setTipoFlecha(char tipoFlecha) {
        this.tipoFlecha = tipoFlecha;
    }

    public boolean isTieneAljabaExtra() {
        return tieneAljabaExtra;
    }

    public void setTieneAljabaExtra(boolean tieneAljabaExtra) {
        this.tieneAljabaExtra = tieneAljabaExtra;
    }

}
