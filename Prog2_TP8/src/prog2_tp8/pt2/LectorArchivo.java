package prog2_tp8.pt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo implements ILectorArchivo {

    @Override
    public void leerArchivo(String ruta) {
        try {
            File archivo = new File(ruta);
            Scanner sc = new Scanner(archivo);
            System.out.println("Contenido del archivo:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe o la ruta es incorrecta.");
        }
    }
}
