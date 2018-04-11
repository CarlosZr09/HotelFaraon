
package Datos;

import java.sql.Date;
import java.sql.Time;

public class vreserva {
 private int idreserva;
    private int idhabitacion;
    private int idcliente;
    private int idtrabajador;
    private int dia;
    private int mes;
    private int ano;
    private String Hora_Entrada;
    private String Hora_Salida;
    private String Salida_Real;
    private Double costo_alojamiento;
    private String estado;
    private Double total_consumos;
    private Double costo_extra;

    public vreserva(int idreserva, int idhabitacion, int idcliente, int idtrabajador, int dia, int mes, int ano, String Hora_Entrada, String Hora_Salida, String Salida_Real, Double costo_alojamiento, String estado, Double total_consumos, Double costo_extra) {
        this.idreserva = idreserva;
        this.idhabitacion = idhabitacion;
        this.idcliente = idcliente;
        this.idtrabajador = idtrabajador;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        this.Salida_Real = Salida_Real;
        this.costo_alojamiento = costo_alojamiento;
        this.estado = estado;
        this.total_consumos= total_consumos;
        this.costo_extra=costo_extra;
        
    }

    public vreserva() {
    }
    /**
     * @return the idreserva
     */
    public int getIdreserva() {
        return idreserva;
    }
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }
    public int getIdhabitacion() {
        return idhabitacion;
    }
    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }
    public int getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public int getIdtrabajador() {
        return idtrabajador;
    }
    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getHora_Entrada() {
        return Hora_Entrada;
    }
    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }
    public String getHora_Salida() {
        return Hora_Salida;
    }
    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }
    public String getSalida_Real() {
        return Salida_Real;
    }
    public void setSalida_Real(String Salida_Real) {
        this.Salida_Real = Salida_Real;
    }
    public Double getCosto_alojamiento() {
        return costo_alojamiento;
    }
    public void setCosto_alojamiento(Double costo_alojamiento) {
        this.costo_alojamiento = costo_alojamiento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Double getTotal_consumos() {
        return total_consumos;
    }
    public double getCosto_extra() {
        return costo_extra;
    }
    public void setTotal_consumos(Double total_consumos) {
        this.total_consumos = total_consumos;
    }
    public void setCosto_extra(Double costo_extra) {
        this.costo_extra = costo_extra;
    }
}