public class MainSistemaStock {

    public static void main(String[] args) {

        Inventario inv = new Inventario();

        Producto p1 = new Producto("A01", "Leche", 850, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E10", "Auriculares", 4999, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R05", "Campera", 12000, 8, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H08", "Lámpara LED", 2500, 25, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A22", "Galletitas", 700, 40, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println("\n--- LISTA COMPLETA ---");
        inv.listarProductos();

        System.out.println("\n--- BUSCAR POR ID (E10) ---");
        if (inv.buscarProductoPorId("E10") != null)
            inv.buscarProductoPorId("E10").mostrarInfo();

        System.out.println("\n--- FILTRAR POR CATEGORIA ALIMENTOS ---");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("\n--- ELIMINAR PRODUCTO R05 ---");
        inv.eliminarProducto("R05");
        inv.listarProductos();

        System.out.println("\n--- ACTUALIZAR STOCK A A01 ---");
        inv.actualizarStock("A01", 50);
        inv.buscarProductoPorId("A01").mostrarInfo();

        System.out.println("\n--- TOTAL STOCK ---");
        System.out.println(inv.obtenerTotalStock());

        System.out.println("\n--- PRODUCTO CON MÁS STOCK ---");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("\n--- FILTRAR PRECIOS ENTRE 1000 Y 3000 ---");
        inv.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- CATEGORÍAS DISPONIBLES ---");
        inv.mostrarCategoriasDisponibles();
    }
}
