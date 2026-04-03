package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import config.DatabaseConnection;

public class TestConnectionJDBC {

    public static void main(String[] args) {

        // Intentamos obtener una conexión con try-with-resources para que se cierre sola
        try (Connection conn = DatabaseConnection.getConnection()) {

            if (conn != null) {
                System.out.println("✓ Conexión establecida con éxito.");

                // Sentencia SQL para seleccionar todos los productos
                String sql = "SELECT * FROM clientes";

                // Preparar la sentencia para prevenir inyección SQL y optimizar ejecución
                try (PreparedStatement pstmt = conn.prepareStatement(sql); // Ejecutar la consulta y obtener el resultado
                        ResultSet rs = pstmt.executeQuery()) {

                    System.out.println("Listado de Clientes:");

                    // Recorrer el ResultSet fila por fila mientras haya registros
                    while (rs.next()) {
                        // Obtener los campos id, nombre y precio de cada fila
                        int codigo = rs.getInt("codigo");
                        String nombre = rs.getString("nombre");
                        String apellido = rs.getString("apellido");

                        // Mostrar los datos por consola
                        System.out.println("Código: " + codigo + ", Nombre: " + nombre + apellido);
                    }
                }

            } else {
                // En caso que la conexión no se haya establecido correctamente
                System.out.println("X No se pudo establecer la conexión.");
            }

        } catch (SQLException e) {
            // Captura y muestra errores relacionados con la base de datos
            System.err.println("A Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
