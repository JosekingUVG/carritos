public class Carrito implements  BMWClaseC{
    private float tempInt, tempExt;
    private String nivelVentilacion, zonaVent, potencia, humedad, avisos;
    private boolean calefaccion, desempañador;

    public Carrito() {
        this.tempInt = 20;
        this.tempExt = 20;
        this.nivelVentilacion = "Medio";
        this.zonaVent = "Medio";
        this.potencia = "Medio";
        this.humedad = "Medio";
        this.avisos = "";
        this.calefaccion = true;
        this.desempañador = true;
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
        String menu = "Escoja una opción:\n1. Encender o apagar\n2. Ajustar temperatura\n3. Modo automático\n4. Nivel de ventilación\n5. Ventilación automática limitada\n6. Ventilación a zona específica\n7. Modo silencioso\n8. Calefacción rápida\n9. Distribución de aire\n10. Desempañador\n11. Personalizar niveles de humedad\n12. Indicador de humedad\n13. Historial de mantenimiento\n14. Programar mantenimiento";
    }

    @Override
    public void limpiarPantalla() {
        
    }

    @Override
    public float pedirTemperatura(float temp) {
        this.tempExt = temp;
        return tempExt;
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
        return desempañador;
    }

}