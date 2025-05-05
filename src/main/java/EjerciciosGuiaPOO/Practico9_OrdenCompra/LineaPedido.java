package EjerciciosGuiaPOO.Practico9_OrdenCompra;

public class LineaPedido {
    private int id;
    private int cantidad;
    private Producto producto;

    public LineaPedido(int id, int cantidad, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int calcularSubtotalLíneaPedido() {
        return cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return "LineaPedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
