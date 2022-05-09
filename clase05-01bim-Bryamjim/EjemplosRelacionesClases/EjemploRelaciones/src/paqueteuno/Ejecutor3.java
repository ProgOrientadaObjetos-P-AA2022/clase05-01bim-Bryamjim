package paqueteuno;

public class Ejecutor3 {

    public static void main(String[] args) {
        String marca = "Toshiba";
        double costo = 4000;
        UnidadDVD unidad = new UnidadDVD(marca, costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
        Computadora computadora = new Computadora(procesador, unidad);
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());
        
    }

}