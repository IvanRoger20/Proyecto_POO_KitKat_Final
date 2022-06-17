/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyconta_proyecto;

/**
 *
 * @author Doc Rogelio
 */
public class Convertidor {
    public static double StringADouble(String a) {
        double b;
        b = java.lang.Double.parseDouble(a);
        return b;
    }
    
    public static String DoubleaString(double a) {
        String b;
        b = String.valueOf(a);
        return b;
    }
    
    public static void CalcularIva(Porcentaje c,double a) {
        c.ivaAcreditable(a);
    }
    
    public static void CalcularIvaCobrado(Porcentaje c,double a) {
        c.ivaPorCobrar(a);
    }
}
