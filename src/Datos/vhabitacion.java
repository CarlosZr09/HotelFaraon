/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author BryvnPaulCG
 */
public class vhabitacion {
    private int idhabitacion;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double precio_diario;
    private Double precio_x3h;
    private Double precio_xh; 
    private String estado;


    public vhabitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas, Double precio_diario, Double precio_x3h, Double precio_xh, String estado) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_diario = precio_diario;
        this.precio_x3h = precio_x3h;
        this.precio_xh = precio_xh;
        this.estado = estado;
    }
    public vhabitacion() {
    }

    public int getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPrecio_diario() {
        return precio_diario;
    }

    public void setPrecio_diario(Double precio_diario) {
        this.precio_diario = precio_diario;
    }

    public Double getPrecio_x3h() {
        return precio_x3h;
    }

    public void setPrecio_x3h(Double precio_x3h) {
        this.precio_x3h = precio_x3h;
    }

    public Double getPrecio_xh() {
        return precio_xh;
    }

    public void setPrecio_xh(Double precio_xh) {
        this.precio_xh = precio_xh;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}