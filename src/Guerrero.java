public class Guerrero extends Personaje {

    private int fuerza;
    private double resistenciaArmadura;
    private char tipoArma;
    private boolean escudoActivo;

    public Guerrero(String nombre, int fuerza) {
        super(nombre);
        this.fuerza = fuerza;
        this.resistenciaArmadura = 10.0;
        this.tipoArma = 'E';
        this.escudoActivo = false;
    }

}
