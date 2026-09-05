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

    public Guerrero(String nombre, int nivel, int fuerza, char tipoArma) {
        super(nombre, nivel);
        this.fuerza = fuerza;
        this.tipoArma = tipoArma;
        this.resistenciaArmadura = 15.0;
        this.escudoActivo = false;
    }

    public Guerrero(String nombre, int nivel, double vida, boolean estaVivo,
                     int fuerza, double resistenciaArmadura, char tipoArma, boolean escudoActivo) {
        super(nombre, nivel, vida, estaVivo);
        this.fuerza = fuerza;
        this.resistenciaArmadura = resistenciaArmadura;
        this.tipoArma = tipoArma;
        this.escudoActivo = escudoActivo;
    }

}
