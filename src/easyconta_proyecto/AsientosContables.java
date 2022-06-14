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
public class AsientosContables extends Empresa implements Porcentaje {
    private String Razon;
    private double Mercancia;
    private double ivaAcreditable;
    private double ivaAcreaditablePagar;
    private double ivaPorCobrar;
    private double ivaPorCobrarPendiente;
    private double Proveedores;
    private double Cliente;
    private double Mobiliario;
    private double DocumentoACortoPlazo;
    private double DocumentoALargoPlazo;

    public AsientosContables() {
    }

    public AsientosContables(String Razon, double Mercancia, double ivaAcreditable, double ivaAcreaditablePagar, double ivaPorCobrar, double ivaPorCobrarPendiente, double Proveedores, double Cliente, double Mobiliario, double DocumentoACortoPlazo, double DocumentoALargoPlazo) {
        this.Razon = Razon;
        this.Mercancia = Mercancia;
        this.ivaAcreditable = ivaAcreditable;
        this.ivaAcreaditablePagar = ivaAcreaditablePagar;
        this.ivaPorCobrar = ivaPorCobrar;
        this.ivaPorCobrarPendiente = ivaPorCobrarPendiente;
        this.Proveedores = Proveedores;
        this.Cliente = Cliente;
        this.Mobiliario = Mobiliario;
        this.DocumentoACortoPlazo = DocumentoACortoPlazo;
        this.DocumentoALargoPlazo = DocumentoALargoPlazo;
    }

    public AsientosContables(String Razon,double Mercancia, double ivaAcreditable, double ivaAcreaditablePagar, double ivaPorCobrar, double ivaPorCobrarPendiente, double Proveedores, double Cliente, double Mobiliario, double DocumentoACortoPlazo, double DocumentoALargoPlazo, double Capital, double Caja, double Banco) {
        super(Capital, Caja, Banco);
        this.Razon = Razon;
        this.Mercancia = Mercancia;
        this.ivaAcreditable = ivaAcreditable;
        this.ivaAcreaditablePagar = ivaAcreaditablePagar;
        this.ivaPorCobrar = ivaPorCobrar;
        this.ivaPorCobrarPendiente = ivaPorCobrarPendiente;
        this.Proveedores = Proveedores;
        this.Cliente = Cliente;
        this.Mobiliario = Mobiliario;
        this.DocumentoACortoPlazo = DocumentoACortoPlazo;
        this.DocumentoALargoPlazo = DocumentoALargoPlazo;
    }

    public String getRazon() {
        return Razon;
    }

    public void setRazon(String Razon) {
        this.Razon = Razon;
    }
    
    public double getMercancia() {
        return Mercancia;
    }

    public void setMercancia(double Mercancia) {
        this.Mercancia = Mercancia;
    }

    public double getIvaAcreditable() {
        return ivaAcreditable;
    }

    public void setIvaAcreditable(double ivaAcreditable) {
        this.ivaAcreditable = ivaAcreditable;
    }

    public double getIvaAcreaditablePagar() {
        return ivaAcreaditablePagar;
    }

    public void setIvaAcreaditablePagar(double ivaAcreaditablePagar) {
        this.ivaAcreaditablePagar = ivaAcreaditablePagar;
    }

    public double getIvaPorCobrar() {
        return ivaPorCobrar;
    }

    public void setIvaPorCobrar(double ivaPorCobrar) {
        this.ivaPorCobrar = ivaPorCobrar;
    }

    public double getIvaPorCobrarPendiente() {
        return ivaPorCobrarPendiente;
    }

    public void setIvaPorCobrarPendiente(double ivaPorCobrarPendiente) {
        this.ivaPorCobrarPendiente = ivaPorCobrarPendiente;
    }

    public double getProveedores() {
        return Proveedores;
    }

    public void setProveedores(double Proveedores) {
        this.Proveedores = Proveedores;
    }

    public double getCliente() {
        return Cliente;
    }

    public void setCliente(double Cliente) {
        this.Cliente = Cliente;
    }

    public double getMobiliario() {
        return Mobiliario;
    }

    public void setMobiliario(double Mobiliario) {
        this.Mobiliario = Mobiliario;
    }

    public double getDocumentoACortoPlazo() {
        return DocumentoACortoPlazo;
    }

    public void setDocumentoACortoPlazo(double DocumentoACortoPlazo) {
        this.DocumentoACortoPlazo = DocumentoACortoPlazo;
    }

    public double getDocumentoALargoPlazo() {
        return DocumentoALargoPlazo;
    }

    public void setDocumentoALargoPlazo(double DocumentoALargoPlazo) {
        this.DocumentoALargoPlazo = DocumentoALargoPlazo;
    }

    

    @Override
    public void ivaAcreditable(double Saldo) {
        this.ivaAcreditable = Saldo/0.16;
    }
    
    @Override
    public void ivaPorCobrar(double Saldo) {
        this.ivaPorCobrar = Saldo/0.16;
    }

    @Override
    public void calcularPorcentaje(double Valor, double porcentaje) {
        
    }
    
    
}
