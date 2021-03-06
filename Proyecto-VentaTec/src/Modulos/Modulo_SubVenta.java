/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LUISM
 */
public class Modulo_SubVenta {
    //----------Declaracion de variables----------//
    public ArrayList<String> idProduc = new ArrayList<String>();
    public ArrayList<String> Cantidad = new ArrayList<String>();
    public ArrayList<String> precUnitario = new ArrayList<String>();
    public ArrayList<String> importe = new ArrayList<String>();
    public ArrayList<String> descuento = new ArrayList<String>();
    public int tamañoMaximo;
    private double total;
    private double efectivo;
    private double sobrante;
    private double iva;
    private double subtotal;
    private String fecha;
    private int folioVenta;
    private ConexionBD CBD = new ConexionBD();
    private int id_Usuario;
    //----------Declaracion de variables----------//
    
    public Modulo_SubVenta(int row,int idU) {
        this.tamañoMaximo = row;
        this.total = 0;
        this.subtotal = 0;
        this.iva = 0;
        this.fecha = "";
        this.efectivo = 0;
        this.sobrante = 0;
        this.folioVenta = buscaFolio();
        this.CBD = new ConexionBD();
        this.id_Usuario = idU;
    }
    //-----------Fin del Constructor---------------//
    //-------funciones void----------//
    public void agregaProduc(String idproc,String cant,String precUni,String impor,String desc){
        idProduc.add(idproc);
        Cantidad.add(cant);
        precUnitario.add(precUni);
        importe.add(impor);
        descuento.add(desc);
    }
    public void sumaSubTotal(){
        for(int i = 0;i < idProduc.size() ; i++){
            subtotal = subtotal + (double)(Double.parseDouble(importe.get(i))*Integer.parseInt(Cantidad.get(i)));
        }
        iva = (subtotal * 0.16);
    }
    public void sumaTodo(){
        total = subtotal + iva;
        sobrante = efectivo - total;
    }
    public void redondeaTodo(){
        this.total = redondearDecimales(total, 2);
        this.subtotal = redondearDecimales(subtotal, 2);
        this.iva = redondearDecimales(iva, 2);
        this.efectivo = redondearDecimales(efectivo, 2);
        this.sobrante = redondearDecimales(sobrante, 2);
    }
    //-------funciones void----------//
    //-------funciones retornables----------//
    public int buscaFolio(){
        int folio = 0;
        CBD.openConexion();
            String A[] = CBD.buscaFolio();
            if(A[0].equals("")){
                return 1;
            }
            folio = (Integer.parseInt(A[A.length - 1]) + 1);
        CBD.closeConexion();
        return folio;
    }
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    //-------funciones retornables----------//
    //------- get ----------//
    public double getEfectivo() {
        return efectivo;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public double getSobrante() {
        return sobrante;
    }
    public double getTotal() {
        return total;
    }
    public double getIva() {
        return (subtotal * 0.16);
    }
    public String getFecha() {
        return fecha;
    }
    public int getFolioVenta() {
        return folioVenta;
    }
    public int getId_Usuario() {
        return id_Usuario;
    }
    public double getPromedioDescuento(){
        double descuentoAcumulado = 0;
        for(int i = 0;i < tamañoMaximo;i++){
            descuentoAcumulado = Double.parseDouble(descuento.get(i));
        }
        return (descuentoAcumulado / tamañoMaximo);
    }
    //------- get ----------//
    //------- set ----------//
    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    //------- set ----------//
}
