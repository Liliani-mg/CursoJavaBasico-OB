public class SmartWatch extends SmartDevice{

    // 1. Atributos
    private float duracionBateriaHoras;
    private boolean phone;
    private String color;


    // 2. Constructores

    public SmartWatch() {

    }

    public SmartWatch(String procesador, float duracionBateriaHoras, boolean phone, String color) {
        this.setProcesador(procesador);
        this.duracionBateriaHoras = duracionBateriaHoras;
        this.phone = phone;
        this.color = color;
    }

    // 3. Métodos


    public float getDuracionBateriaHoras() {
        return duracionBateriaHoras;
    }

    public void setDuracionBateriaHoras(float duracionBateriaHoras) {
        this.duracionBateriaHoras = duracionBateriaHoras;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}