/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyconta_proyecto;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author IvanTron
 */
public class EasyConta_Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaInicio Pantalla = new PantallaInicio();
        Pantalla.setResizable(false);
        Pantalla.setVisible(true);
        /*Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();
        AsientosContables contables = new AsientosContables();
        boolean bReiniciar = true;
        System.out.println("Bienvenido a EasyConta!!");
        System.out.println("Porfavor ingrese los saldos iniciales de su empresa(En numeros enteros o numeros decimales.");
        do {
            try {

                System.out.println("Caja chica(Efectivo):");
                empresa.setCaja(sc.nextDouble());
                System.out.println("Banco: ");
                empresa.setBanco(sc.nextDouble());
                System.out.println("Mercancia(Costo de la mercancia que poseen): ");
                contables.setMercancia(sc.nextDouble());
                System.out.println("¿Tiene algun adeudo con un Proveedor?");
                System.out.println("Introduzca 1 para si y 0 para No");
                int SiNo = sc.nextInt();
                if (SiNo == 1) {
                    System.out.println("Ingrese el adeudo al Proveedor: ");
                    contables.setProveedores(sc.nextDouble());
                }
                empresa.setCapital(empresa.getCaja() + empresa.getBanco() + contables.getMercancia());
                System.out.println("Estos son sus saldos iniciales: ");
                System.out.println("Caja(Efectivo): " + empresa.getCaja());
                System.out.println("Banco: " + empresa.getBanco());
                System.out.println("Mercancia: " + contables.getMercancia());
                if (SiNo == 1) {
                    System.out.println("Proveedores: " + contables.getProveedores());
                }
                System.out.println("Capital(Valora de empresa, Total)" + empresa.getCapital());
                System.out.println("Los valores son correctos?");
                System.out.println("Introduzca 1 para si y 0 para No");
                SiNo = sc.nextInt();
//                Se queda en bucle
                if (SiNo == 1) {
                    bReiniciar = false;
                } else {
                    System.out.println("Vuelva a introducir los valores porfavor");
                }

            } catch (Exception e) {
                System.out.println("Uyyy, algo a salido mal vuelvalo a intentar");
            }
        } while (bReiniciar = true);*/
    }

}
