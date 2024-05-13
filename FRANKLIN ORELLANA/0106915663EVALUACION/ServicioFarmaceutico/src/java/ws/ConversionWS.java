package ws;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Farmacia;
import modelo.producto;

@WebService(serviceName = "ConversionWS")
public class ConversionWS {

    ArrayList<Farmacia> listaFarmacias = new ArrayList<>();
    ArrayList<producto> listaProductos = new ArrayList<>();

    public void crearDatos() {

        //FACTURAS
        Farmacia f1 = new Farmacia(1, "COFARMA", "PRINCIPAL");
        Farmacia f2 = new Farmacia(2, "EMPSEPHAR", "PRINCIPAL");
        Farmacia f3 = new Farmacia(3, "CEMEFAR", "PRINCIPAL");

        listaFarmacias.add(f1);
        listaFarmacias.add(f2);
        listaFarmacias.add(f3);

        //PRODUCTOS
        producto p1 = new producto(1, "Fubrex", "analgésico", 30, f1);
        producto p2 = new producto(2, "Fimur", "analéptico", 30, f2);
        producto p3 = new producto(3, "Fexofenadina", "anestésico", 30, f3);
        producto p4 = new producto(4, "Fenitoína", "antiácido", 30, f3);
        producto p5 = new producto(5, "Furosemida", "antidepresivo", 30, f1);
        producto p6 = new producto(6, "Fluoxetina", "antibióticos", 30, f2);

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        listaProductos.add(p6);

    }

    @WebMethod(operationName = "crearProducto")
    public void crearProducto(
            @WebParam(name = "idProducto") int idProducto,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "tipo") String tipo,
            @WebParam(name = "cantidad") int cantidad,
            @WebParam(name = "idFarmacia") int idFarmacia
    ) {
        // Buscar la farmacia correspondiente por su id
        Farmacia farmacia = null;
        for (Farmacia f : listaFarmacias) {
            if (f.getIdFarmacia() == idFarmacia) {
                farmacia = f;
                break;
            }
        }
        if (farmacia != null) {
            // Crear el producto y agregarlo a la lista
            producto producto = new producto(idProducto, nombre, tipo, cantidad, farmacia);
            listaProductos.add(producto);
        }
    }

    // Método para buscar un producto por su nombre
    @WebMethod(operationName = "buscarProductoPorNombre")
    public producto buscarProductoPorNombre(@WebParam(name = "nombreProducto") String nombreProducto) {
        crearDatos();
        // Buscar el producto por su nombre
        for (producto p : listaProductos) {
            if (p.getNombrePro().equalsIgnoreCase(nombreProducto)) {
                return p;
            }
        }
        // Si no se encuentra el producto, retornar null
        return null;
    }

    // Método para eliminar un producto por su nombre
    @WebMethod(operationName = "eliminarProductoPorNombre")
    public void eliminarProductoPorNombre(@WebParam(name = "nombreProducto") String nombreProducto) {
        crearDatos();
        // Buscar el producto por su nombre y eliminarlo de la lista
        Iterator<producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            producto p = iterator.next();
            if (p.getNombrePro().equals(nombreProducto)) {
                iterator.remove();
                break;
            }
        }
    }

    @WebMethod(operationName = "obtenerNombresProductos")
    public List<String> obtenerNombresProductos() {
        List<String> nombresProductos = new ArrayList<>();
        for (producto p : listaProductos) {
            nombresProductos.add(p.getNombrePro());
        }
        return nombresProductos;
    }

    // Método para extraer todos los nombres de las farmacias
    @WebMethod(operationName = "obtenerNombresFarmacias")
    public List<String> obtenerNombresFarmacias() {
        List<String> nombresFarmacias = new ArrayList<>();
        for (Farmacia f : listaFarmacias) {
            nombresFarmacias.add(f.getNombre());
        }
        return nombresFarmacias;
    }

}
