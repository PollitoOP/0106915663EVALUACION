
package modelo;

import java.util.List;

public class Farmacia {
    
    private int idFarmacia;
    private String nombre;
    private String sucursal;
    private List<producto> productos;

    public Farmacia() {
    }

    public Farmacia(int idFarmacia, String nombre, String sucursal) {
        this.idFarmacia = idFarmacia;
        this.nombre = nombre;
        this.sucursal = sucursal;
    }

    public Farmacia(List<producto> productos) {
        this.productos = productos;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public List<producto> getProductos() {
        return productos;
    }

    public void setProductos(List<producto> productos) {
        this.productos = productos;
    }
    
    
}
