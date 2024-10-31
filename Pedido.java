/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientepedido;

/**
 *
 * @author CAMILO
 */
public class Pedido {
    
    private String nombrePedido;
    private int cantidadPedido;
    private int precioPedido;

    public Pedido(String nombre, int cantidad, int precio) {
        this.nombrePedido = nombre;
        this.cantidadPedido = cantidad;
        this.precioPedido = precio;
    }
    
    public int calcularImporte (){
        return cantidadPedido * precioPedido;
    }
    
    public void mostrarPedido (){
        System.out.println("Producto: "+nombrePedido);
        System.out.println("Cantidad: "+cantidadPedido);
        System.out.println("Precio: "+precioPedido);
        System.out.println("Total a pagar: "+calcularImporte());
        System.out.println("-----------------------------");
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    public double getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(int precioPedido) {
        this.precioPedido = precioPedido;
    }
}
