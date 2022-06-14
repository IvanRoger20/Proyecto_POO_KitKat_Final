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
public class Empresa {
    private double Capital;
    private double Caja;
    private double Banco;

    public Empresa() {
    }

    public Empresa(double Capital, double Caja, double Banco) {
        this.Capital = Capital;
        this.Caja = Caja;
        this.Banco = Banco;
    }

    public double getCapital() {
        return Capital;
    }

    public void setCapital(double Capital) {
        this.Capital = Capital;
    }

    public double getCaja() {
        return Caja;
    }

    public void setCaja(double Caja) {
        this.Caja = Caja;
    }

    public double getBanco() {
        return Banco;
    }

    public void setBanco(double Banco) {
        this.Banco = Banco;
    }

    
    
    
}
