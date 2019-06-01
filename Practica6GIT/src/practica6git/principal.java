/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6git;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=1,edad,id,cantidad;
        String nombre,apellido,direccion,telefono,nombreCuenta;
        
        Scanner letras= new Scanner(System.in);
        Scanner numero= new Scanner(System.in);
        
        cuentaBancaria llamarCuenta = new cuentaBancaria();

        while (opcion!=0){
            System.out.println("\tOpcion: ");
            System.out.println("1:Crear cliente");
            System.out.println("2:Crear cuenta");
            System.out.println("3:Ingresar saldo");
            System.out.println("4:Retirar saldo");
            System.out.println("0:Salir");
            System.out.println("Escribe una de las siguientes opciones");
            opcion =numero.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Seleccionaste la opción: Crear cliente");
                   
                    System.out.println("Escriba su nombre");
                    nombre=letras.nextLine();
                    
                    System.out.println("Escriba su primer apellido");
                    apellido=letras.nextLine();
                    
                    System.out.println("¿Cúal es su edad?");
                    edad=numero.nextInt();
                    
                    System.out.println("Escriba su dirección");
                    direccion=letras.nextLine();
                    
                    System.out.println("Escriba su numero de telefono");
                    telefono=letras.nextLine();
                    
                    System.out.println("Su cliente ha sido creado con éxito");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opción: Crear cuenta");
                    System.out.println("Escriba su nombre de la cuenta");
                    nombreCuenta=letras.nextLine();
                    System.out.println("Escriba el id de su cuenta");
                    id=numero.nextInt();
                    System.out.println("Su cuenta ha sido creada con éxito");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción: Ingresar");
                    System.out.println("Escriba la cantidad que quiera ingresar");
                    cantidad=numero.nextInt();
                    System.out.println("Has ingresado saldo correctamente");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción: Retirar");
                    System.out.println("Escriba la cantidad que quiera retirar");
                    cantidad=numero.nextInt();
                    System.out.println("Has retirado saldo correctamente");
                    break;
                case 0:
                    System.out.println("Has elegido la opción: Salir");
                    System.out.println("VENGA, HASTA A DIOS");
                    break;
                default:
                    System.out.println("Solo deberias introducir numeros del 0 al 4");
                   
            }
        }   
    }
}
