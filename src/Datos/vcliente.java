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
public class vcliente extends vpersona{
    private String idpersona;

    public vcliente() {
    }

    public vcliente(String codigo_cliente) {
        this.idpersona = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return idpersona;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.idpersona = codigo_cliente;
    }
    
}
