/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientepedido;

import java.util.Scanner;


/**
 *
 * @author CAMILO
 */
public class ClientePedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese el numero de clientes que desea ingresar");
        int cant = datos.nextInt();
        Cliente[] clientes = new Cliente[cant];
        
        for (int x=0; x <cant; x++){
            System.out.println("ingrese nombre del cliente numero "+(x+1));
            String nombre = datos.next();
            System.out.println("ingrese número de cedula del cliente numero "+(x+1));
            String cedula = datos.next();
            System.out.println("ingrese el correo del cliente numero "+(x+1));
            String correo = datos.next();
            System.out.println("ingrese la edad del cliente numero "+(x+1));
            int edad = datos.nextInt();
            
            System.out.println("Ingrese el numero de pedidos del cliente numero "+(x+1));
            int cantidadPedidos = datos.nextInt();
            
            Cliente cliente = new Cliente(nombre, cedula, correo, edad, cantidadPedidos);
            
            for (int i=0; i < cantidadPedidos;i++){
                System.out.println("ingrese el nombre del producto del pedido numero "+(i+1));
                String nombrePedido = datos.next();
                System.out.println("ingrese la cantidad del pedido numero "+(i+1));
                int cantidadPedido = datos.nextInt();
                System.out.println("Ingrese el precio del pedido numero "+(i+1));
                int precioPedido = datos.nextInt();
                
                Pedido nuevoPedido = new Pedido(nombrePedido, cantidadPedido, precioPedido);
                cliente.agregarPedido(nuevoPedido);    
                
                }
            clientes[x] = cliente;
        }
        for (Cliente cliente : clientes) {
            cliente.pedidoCliente();
            System.out.println("Pedidos del cliente:");
            for (Pedido pedido : cliente.getPedidos()) {
                if (pedido != null) {
                    pedido.mostrarPedido();

                }
            }
            System.out.println("-------------------------------");
        }
        datos.close();
    }
}

