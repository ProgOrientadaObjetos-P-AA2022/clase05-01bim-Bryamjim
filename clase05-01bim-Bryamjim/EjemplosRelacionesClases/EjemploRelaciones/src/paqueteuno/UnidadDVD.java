    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

public class UnidadDVD {

    private String marca;
    private double costo;

    public UnidadDVD(String a,double m) {
        marca = a;
        
    }
    public UnidadDVD(double m){
       costo = m; 
    }
   
    public void establecerMarca(String n, double m) {
        marca = n;
    }
        public void establecercosto(double m) {
        costo = m;
    }
    public String obtenerMarca() {
        return marca;
    }
    public double obtenercosto() {
        return costo;
    }
    

}
