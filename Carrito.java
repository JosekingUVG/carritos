public class Carrito implements  BMWClaseC{
    private float tempInt, tempExt;
    private String nivelVentilacion, zonaVent, potencia, humedad, avisos;
    private boolean calefaccion, desempañador;

    public Carrito() {
        this.tempInt = 20;
        this.tempExt = 20;
        this.nivelVentilacion = "medio";
        this.zonaVent = "parabrisas";
        this.potencia = "medio";
        this.humedad = "medio";
        this.avisos = "";
        this.calefaccion = false;
        this.desempañador = false;
    }

    public Carrito(float tempInt, float tempExt, String nivelVentilacion, String zonaVent, String potencia,
            String humedad, String avisos, boolean calefaccion, boolean desempañador) {
        this.tempInt = tempInt;
        this.tempExt = tempExt;
        this.nivelVentilacion = nivelVentilacion;
        this.zonaVent = zonaVent;
        this.potencia = potencia;
        this.humedad = humedad;
        this.avisos = avisos;
        this.calefaccion = calefaccion;
        this.desempañador = desempañador;
    }

    @Override
    public float mostrarTemp() {
        return tempInt;
    }

    @Override
    public void mostrarMenu() {
        
    }

    @Override
    public void limpiarPantalla() {
        
    }

    @Override
    public float pedirTemperatura(float temp) {
        this.tempInt = temp;
        return tempInt;
    }

    @Override
    public String mostrarEstadoVentilacion() {
        return "Estado ventilación";
    }

    @Override
    public String pedirNivelVentilacion(String nivel) {
        this.nivelVentilacion = nivel;
        return nivelVentilacion;
    }

    @Override
    public String pedirZonaVentilacion(String nivel) {
        this.zonaVent = nivel;
        return zonaVent;
    }

    @Override
    public String mostrarHumedad() {
        return humedad;
    }

    @Override
    public void pedirNivelHumedad(String nivel) {
        this.humedad = nivel;
    }

    @Override
    public String mostrarEstado() {
        return "Estado";
    }

    @Override
    public String mostrarError() {
        return "Error";
    }

    @Override
    public String mostrarAviso(String aviso) {
        return aviso;
    }

    @Override
    public int obtenerOpcionMenu() {
        return 0;
    }

    @Override
    public boolean mostrarDesempañador() {
        this.desempañador = !this.desempañador;
        return desempañador;
    }

}