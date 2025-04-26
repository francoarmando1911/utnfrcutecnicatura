package EjerciciosComposicion.Ejercicio1_EdificioInteligente;

public class SensorAmbiental {

    private String tipoSensor;
    private float valor;

    public SensorAmbiental(String tipoSensor, float valor) {
        this.tipoSensor = tipoSensor;
        this.valor = valor;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //metodo medir(float)
}
