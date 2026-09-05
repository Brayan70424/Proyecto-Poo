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

    public Mago(String nombre, int nivel, double vida, boolean estaVivo,
                int mana, double poderMagico, String escuelaMagia, boolean puedeVolar) {
        super(nombre, nivel, vida, estaVivo);
        this.mana = mana;
        this.poderMagico = poderMagico;
        this.escuelaMagia = escuelaMagia;
        this.puedeVolar = puedeVolar;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public String getEscuelaMagia() {
        return escuelaMagia;
    }

    public void setEscuelaMagia(String escuelaMagia) {
        this.escuelaMagia = escuelaMagia;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

}
