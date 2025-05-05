package EjerciciosGuiaPOO.Practico9_OrdenCompra;

import java.util.ArrayList;

public class Orden {
    private int id;
    private ArrayList<LineaPedido> itemsPedido;

    public Orden(int id, ArrayList<LineaPedido> itemsPedido) {
        this.id = id;
        this.itemsPedido = new ArrayList<>(itemsPedido);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<LineaPedido> getItemsPedido() {
        return itemsPedido;
    }

    public void setItemsPedido(ArrayList<LineaPedido> itemsPedido) {
        this.itemsPedido = itemsPedido;
    }

    public int calcularTotalOrden() {
        int totalOrden = 0;
        for (LineaPedido línea : itemsPedido) {
            totalOrden = totalOrden + línea.calcularSubtotalLíneaPedido();
        }
        return totalOrden;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", itemsPedido=" + itemsPedido +
                '}';
    }

    public void addItem(int idr, int cantidad, Producto producto) {
        LineaPedido linea = new LineaPedido(id, cantidad, producto);
        itemsPedido.add(linea);
    }
}
