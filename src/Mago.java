public class Mago extends Personaje {

    private int mana;
    private double poderMagico;
    private String escuelaMagia;
    private boolean puedeVolar;

    public Mago(String nombre, String escuelaMagia) {
        super(nombre);
        this.escuelaMagia = escuelaMagia;
        this.mana = 50;
        this.poderMagico = 20.0;
        this.puedeVolar = false;
    }

    public Mago(String nombre, int nivel, int mana, double poderMagico) {
        super(nombre, nivel);
        this.mana = mana;
        this.poderMagico = poderMagico;
        this.escuelaMagia = "Arcana";
        this.puedeVolar = false;
    }

}
