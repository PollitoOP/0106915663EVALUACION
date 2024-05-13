
package modelo;

public class producto {
    
    private int id_producto;
    private String nombrePro;
    private String tipo;
    private int cantidad;
    private Farmacia farmacia;

    public producto() {
    }

    public producto(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public producto(int id_producto, String nombrePro, String tipo, int cantidad, Farmacia farmacia) {
        this.id_producto = id_producto;
        this.nombrePro = nombrePro;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.farmacia = farmacia;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
    
    
}
