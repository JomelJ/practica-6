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
    public String nombre;
    public int saldo;
    public int id;
    public String cliente;

    public cuentaBancaria(String nombre, int saldo, int id, String cliente) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.id = id;
        this.cliente = cliente;
    }

    public cuentaBancaria() {
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
        this.setSaldo(this.getSaldo()+ cantidad);
    }
    public void retirarSaldo(int cantidad){
        if(this.getSaldo()>cantidad) {
            this.setSaldo(this.getSaldo()-cantidad);
        }
        else {
            System.out.println("No hay suficiente saldo en la cuenta");
        }
    }
    public void controlSaldo(int cantidad){
        if(this.getSaldo()<cantidad){
            System.out.println("La cantidad a extra es mucho mayor quel saldo: cantidad = " + cantidad + ", saldo= "+ saldo );
        }
    }
}
