package prog2_tp6_ej1;

import java.util.ArrayList;

public class Prog2_TP6_Ej1 {

    public static void main(String[] args) {
        // Usando constructor vacío
        Inventario inventario = new Inventario();

        // Crear productos usando distintos constructores
        Producto p1 = new Producto("P001", "Arroz", 1500, 40, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor LED", 250000, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Campera", 32000, 10, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Cafetera", 180000, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan", 100);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar todos
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        inventario.listarProductos();

        // Buscar producto por ID
        System.out.println("\n--- BUSCAR PRODUCTO POR ID (P003) ---");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // Filtrar categoría
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar producto por ID
        System.out.println("\n--- ELIMINAR PRODUCTO (P002) ---");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // Actualizar stock por ID
        System.out.println("\n--- ACTUALIZAR STOCK (P001) ---");
        inventario.actualizarStock("P001", 55);

        // Total stock
        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        // Mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock:");
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 10000);

        // Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
        
        
       
    }
}
