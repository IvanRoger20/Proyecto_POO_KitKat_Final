/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyconta_proyecto;

/**
 *
 * @author IvanTron
 */
public interface Porcentaje {
    public void ivaAcreditable(double Saldo);
    public void ivaPorCobrar(double Saldo);
    public void calcularPorcentaje(double Valor,double porcentaje);
}
