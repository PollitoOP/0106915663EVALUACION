
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarProductoPorNombre_QNAME = new QName("http://ws/", "buscarProductoPorNombre");
    private final static QName _BuscarProductoPorNombreResponse_QNAME = new QName("http://ws/", "buscarProductoPorNombreResponse");
    private final static QName _CrearDatos_QNAME = new QName("http://ws/", "crearDatos");
    private final static QName _CrearDatosResponse_QNAME = new QName("http://ws/", "crearDatosResponse");
    private final static QName _CrearProducto_QNAME = new QName("http://ws/", "crearProducto");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://ws/", "crearProductoResponse");
    private final static QName _EliminarProductoPorNombre_QNAME = new QName("http://ws/", "eliminarProductoPorNombre");
    private final static QName _EliminarProductoPorNombreResponse_QNAME = new QName("http://ws/", "eliminarProductoPorNombreResponse");
    private final static QName _ObtenerNombresFarmacias_QNAME = new QName("http://ws/", "obtenerNombresFarmacias");
    private final static QName _ObtenerNombresFarmaciasResponse_QNAME = new QName("http://ws/", "obtenerNombresFarmaciasResponse");
    private final static QName _ObtenerNombresProductos_QNAME = new QName("http://ws/", "obtenerNombresProductos");
    private final static QName _ObtenerNombresProductosResponse_QNAME = new QName("http://ws/", "obtenerNombresProductosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProductoPorNombre }
     * 
     */
    public BuscarProductoPorNombre createBuscarProductoPorNombre() {
        return new BuscarProductoPorNombre();
    }

    /**
     * Create an instance of {@link BuscarProductoPorNombreResponse }
     * 
     */
    public BuscarProductoPorNombreResponse createBuscarProductoPorNombreResponse() {
        return new BuscarProductoPorNombreResponse();
    }

    /**
     * Create an instance of {@link CrearDatos }
     * 
     */
    public CrearDatos createCrearDatos() {
        return new CrearDatos();
    }

    /**
     * Create an instance of {@link CrearDatosResponse }
     * 
     */
    public CrearDatosResponse createCrearDatosResponse() {
        return new CrearDatosResponse();
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link EliminarProductoPorNombre }
     * 
     */
    public EliminarProductoPorNombre createEliminarProductoPorNombre() {
        return new EliminarProductoPorNombre();
    }

    /**
     * Create an instance of {@link EliminarProductoPorNombreResponse }
     * 
     */
    public EliminarProductoPorNombreResponse createEliminarProductoPorNombreResponse() {
        return new EliminarProductoPorNombreResponse();
    }

    /**
     * Create an instance of {@link ObtenerNombresFarmacias }
     * 
     */
    public ObtenerNombresFarmacias createObtenerNombresFarmacias() {
        return new ObtenerNombresFarmacias();
    }

    /**
     * Create an instance of {@link ObtenerNombresFarmaciasResponse }
     * 
     */
    public ObtenerNombresFarmaciasResponse createObtenerNombresFarmaciasResponse() {
        return new ObtenerNombresFarmaciasResponse();
    }

    /**
     * Create an instance of {@link ObtenerNombresProductos }
     * 
     */
    public ObtenerNombresProductos createObtenerNombresProductos() {
        return new ObtenerNombresProductos();
    }

    /**
     * Create an instance of {@link ObtenerNombresProductosResponse }
     * 
     */
    public ObtenerNombresProductosResponse createObtenerNombresProductosResponse() {
        return new ObtenerNombresProductosResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Farmacia }
     * 
     */
    public Farmacia createFarmacia() {
        return new Farmacia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorNombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorNombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarProductoPorNombre")
    public JAXBElement<BuscarProductoPorNombre> createBuscarProductoPorNombre(BuscarProductoPorNombre value) {
        return new JAXBElement<BuscarProductoPorNombre>(_BuscarProductoPorNombre_QNAME, BuscarProductoPorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorNombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProductoPorNombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buscarProductoPorNombreResponse")
    public JAXBElement<BuscarProductoPorNombreResponse> createBuscarProductoPorNombreResponse(BuscarProductoPorNombreResponse value) {
        return new JAXBElement<BuscarProductoPorNombreResponse>(_BuscarProductoPorNombreResponse_QNAME, BuscarProductoPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDatos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearDatos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearDatos")
    public JAXBElement<CrearDatos> createCrearDatos(CrearDatos value) {
        return new JAXBElement<CrearDatos>(_CrearDatos_QNAME, CrearDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDatosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearDatosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearDatosResponse")
    public JAXBElement<CrearDatosResponse> createCrearDatosResponse(CrearDatosResponse value) {
        return new JAXBElement<CrearDatosResponse>(_CrearDatosResponse_QNAME, CrearDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProducto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProductoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoPorNombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProductoPorNombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "eliminarProductoPorNombre")
    public JAXBElement<EliminarProductoPorNombre> createEliminarProductoPorNombre(EliminarProductoPorNombre value) {
        return new JAXBElement<EliminarProductoPorNombre>(_EliminarProductoPorNombre_QNAME, EliminarProductoPorNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoPorNombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProductoPorNombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "eliminarProductoPorNombreResponse")
    public JAXBElement<EliminarProductoPorNombreResponse> createEliminarProductoPorNombreResponse(EliminarProductoPorNombreResponse value) {
        return new JAXBElement<EliminarProductoPorNombreResponse>(_EliminarProductoPorNombreResponse_QNAME, EliminarProductoPorNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombresFarmacias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNombresFarmacias }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerNombresFarmacias")
    public JAXBElement<ObtenerNombresFarmacias> createObtenerNombresFarmacias(ObtenerNombresFarmacias value) {
        return new JAXBElement<ObtenerNombresFarmacias>(_ObtenerNombresFarmacias_QNAME, ObtenerNombresFarmacias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombresFarmaciasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNombresFarmaciasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerNombresFarmaciasResponse")
    public JAXBElement<ObtenerNombresFarmaciasResponse> createObtenerNombresFarmaciasResponse(ObtenerNombresFarmaciasResponse value) {
        return new JAXBElement<ObtenerNombresFarmaciasResponse>(_ObtenerNombresFarmaciasResponse_QNAME, ObtenerNombresFarmaciasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombresProductos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNombresProductos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerNombresProductos")
    public JAXBElement<ObtenerNombresProductos> createObtenerNombresProductos(ObtenerNombresProductos value) {
        return new JAXBElement<ObtenerNombresProductos>(_ObtenerNombresProductos_QNAME, ObtenerNombresProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNombresProductosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNombresProductosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerNombresProductosResponse")
    public JAXBElement<ObtenerNombresProductosResponse> createObtenerNombresProductosResponse(ObtenerNombresProductosResponse value) {
        return new JAXBElement<ObtenerNombresProductosResponse>(_ObtenerNombresProductosResponse_QNAME, ObtenerNombresProductosResponse.class, null, value);
    }

}
