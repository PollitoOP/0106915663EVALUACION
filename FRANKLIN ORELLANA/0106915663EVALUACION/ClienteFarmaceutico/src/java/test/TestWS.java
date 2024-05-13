package test;

import java.util.List;
import ws.ConversionWS;
import ws.ConversionWS_Service;
import ws.Producto;

public class TestWS {
    
    // Método para llamar al método crearProducto del servicio web
    public static void crearProducto(int idProducto, String nombre, String tipo, int cantidad, int idFarmacia) {
        // Crear una instancia del servicio web
        ConversionWS_Service service = new ConversionWS_Service();
        ConversionWS port = service.getConversionWSPort();

        // Llamar al método crearProducto del servicio web
        port.crearProducto(idProducto, nombre, tipo, cantidad, idFarmacia);
    }
    
    // Método para llamar al método buscarProducto del servicio web
    public static Producto buscarProducto(String nombreProducto) {
        // Crear una instancia del servicio web
        ConversionWS_Service service = new ConversionWS_Service();
        ConversionWS port = service.getConversionWSPort();

        // Llamar al método buscarProducto del servicio web
        return port.buscarProductoPorNombre(nombreProducto);
    }
    
    // Método para llamar al método eliminarProducto del servicio web
    public static void eliminarProducto(String nombrePro) {
        // Crear una instancia del servicio web
        ConversionWS_Service service = new ConversionWS_Service();
        ConversionWS port = service.getConversionWSPort();

        // Llamar al método eliminarProducto del servicio web
        port.eliminarProductoPorNombre(nombrePro);
    }
    
//    // Método para llamar al método obtenerNombresProductos del servicio web
//    public static List<String> obtenerNombresProductos() {
//        // Crear una instancia del servicio web
//        ConversionWS_Service service = new ConversionWS_Service();
//        ConversionWS port = service.getConversionWSPort();
//
//        // Llamar al método obtenerNombresProductos del servicio web
//        return port.obtenerNombresProductos();
//    } 

}
