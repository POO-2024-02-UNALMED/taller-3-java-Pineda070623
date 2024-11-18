public class TV {
    private Marca marca; // Marca asociada al televisor
    private int canal;   // Canal actual
    private int precio;  // Precio del televisor
    private boolean estado; // Estado: encendido (true) o apagado (false)
    private int volumen; // Volumen actual
    private Control control; // Control remoto asociado

    private static int numTV = 0; // Contador de televisores creados (atributo de clase)

    // Constructor
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;   // Valor por defecto
        this.volumen = 1; // Valor por defecto
        this.precio = 500; // Valor por defecto
        numTV++; // Incrementamos el contador de televisores creados
    }

    // Métodos de clase para el contador
    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    // Métodos para encender y apagar el televisor
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    // Métodos para cambiar de canal
    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    public void setCanal(int canal) {
        if (estado && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    // Métodos para cambiar el volumen
    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }

    public void setVolumen(int volumen) {
        if (estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    // Métodos para atributos adicionales
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }
}
