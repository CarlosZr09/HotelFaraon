
package Datos;
//datos de tabla limpieza
public class vlimpieza {
    private int idlimpieza;
    private int idhabitacion;
    private int idtrabajador;
    private int idtrabajador2;
    private int dia;
    private int mes;
    private int ano;
    private String Hora_Entrada;
    private String Hora_Salida;

    public vlimpieza(int idlimpieza, int idhabitacion, int idtrabajador,int idtrabajador2, int dia, int mes, int ano, String Hora_Entrada, String Hora_Salida) {
        this.idlimpieza = idlimpieza;
        this.idhabitacion = idhabitacion;
        this.idtrabajador = idtrabajador;
        this.idtrabajador2 = idtrabajador2;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_Salida = Hora_Salida;
        
    }

    public vlimpieza() {
    }
    /**
     * @return the idreserva
     */
    public int getIdhabitacion() {
        return idhabitacion;
    }
    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }
    public int getIdtrabajador() {
        return idtrabajador;
    }
    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }
    public int getIdtrabajador2() {
        return idtrabajador2;
    }
    public void setIdtrabajador2(int idtrabajador2) {
        this.idtrabajador2 = idtrabajador2;
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
    public int getIdlimpieza() {
        return idlimpieza;
    }
    public void setIdlimpieza(int idlimpieza) {
        this.idlimpieza = idlimpieza;
    }
}