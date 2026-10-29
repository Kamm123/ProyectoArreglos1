package Arreglos.Tienda.Modelo;

public class Juego {
    private String nombre;
    private String categoria;
    private int tamanio;
    private double precio;
    private int licenciaDisponible;
    private int licenciaVendidas;

    //Constructor
    public Juego(String nombre, String categoria, int tamanio, double precio, int licenciaDisponible) {
        //los parametros son los q el usuario me ingresa por ende las
        //licencias vendidas no le puede ingresar ese dato, por eso no hay paramtero de ese y se inicializa en 0.
        this.nombre = nombre;
        this.categoria = categoria;
        this.tamanio = tamanio;
        this.precio = precio;
        this.licenciaDisponible = licenciaDisponible;
        this.licenciaVendidas = 0;
    }

    //Get()

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getTamanio() {
        return tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public int getLicenciaDisponible() {
        return licenciaDisponible;
    }

    public int getLicenciaVendidas() {
        return licenciaVendidas;
    }

    //set()

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            System.out.println("ERROR.");
        }else{
            this.nombre = nombre;
        }
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()){
            System.out.println("ERROR.");
        }else{
            this.categoria = categoria;
        }
    }

    public void setTamanio(int tamanio) {
        if (tamanio > 0)
            this.tamanio = tamanio;
    }

    public void setPrecio(double precio) {
        if (precio > 0)
            this.precio = precio;
    }

    public boolean comprar(int cantidad){
        if (cantidad > 0){
            licenciaDisponible += cantidad;
            return true;
        }
        return false;
    }

    public boolean vender(int cantidad){
        if (cantidad > 0 && cantidad <= licenciaDisponible){
            licenciaDisponible -= cantidad;
            licenciaVendidas += cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                ", licenciaDisponible=" + licenciaDisponible +
                ", licenciaVendidas=" + licenciaVendidas +
                '}';
    }
}
