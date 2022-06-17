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
public final class SaldosFinales extends AsientosContables {
    private double capitalFinal;
    private double cajaFinal;
    private double bancoFinal;

    public SaldosFinales(double capitalFinal, double cajaFinal, double bancoFinal, String Razon, double Mercancia, double ivaAcreditable, double ivaAcreaditablePagar, double ivaPorCobrar, double ivaPorCobrarPendiente, double Proveedores, double Cliente, double Mobiliario, double DocumentoACortoPlazo, double DocumentoALargoPlazo, double Renta, double Terreno, double EquipoDeReparto, double Edificio, double Capital, double Caja, double Banco) {
        super(Razon, Mercancia, ivaAcreditable, ivaAcreaditablePagar, ivaPorCobrar, ivaPorCobrarPendiente, Proveedores, Cliente, Mobiliario, DocumentoACortoPlazo, DocumentoALargoPlazo, Renta, Terreno, EquipoDeReparto, Edificio, Capital, Caja, Banco);
        this.capitalFinal = capitalFinal;
        this.cajaFinal = cajaFinal;
        this.bancoFinal = bancoFinal;
    }

    

    public SaldosFinales() {
    }

    public double getCapitalFinal() {
        return capitalFinal;
    }

    public void setCapitalFinal(double capitalFinal) {
        this.capitalFinal = capitalFinal;
    }

    public double getCajaFinal() {
        return cajaFinal;
    }

    public void setCajaFinal(double cajaFinal) {
        this.cajaFinal = cajaFinal;
    }

    public double getBancoFinal() {
        return bancoFinal;
    }

    public void setBancoFinal(double bancoFinal) {
        this.bancoFinal = bancoFinal;
    }
    
    
}
