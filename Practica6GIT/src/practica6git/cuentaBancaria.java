/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6git;

/**
 *
 * @author Alejandro
 */
public class cuentaBancaria {
    private String nombre;
    private int saldo;
    private int id;
    private String cliente;

    public cuentaBancaria(String nombre, int saldo, int id, String cliente) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.id = id;
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void ingresarSaldo(int cantidad){
        saldo = saldo + cantidad;
    }
    public void retirarSaldo(int cantidad){
        saldo = saldo - cantidad;
    }
}
