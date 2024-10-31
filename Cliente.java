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
public class Cliente {
   private String nombre;
   private String cedula;
   private String correo;
   private int edad;
   private Pedido [] pedidos;
   private int cantidadPedidos;

    public Cliente(String nombre, String cedula, String correo, int edad, int cantidadPedidos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.edad = edad;
        this.pedidos = new Pedido [cantidadPedidos] ;
        this.cantidadPedidos = 0;
    }
    
    public void agregarPedido(Pedido pedido) {
        if (cantidadPedidos < pedidos.length) {
            pedidos[cantidadPedidos] = pedido;
            cantidadPedidos++;
        } else {
            System.out.println("No se pueden agregar más pedidos.");
        }
    }
    
    public void pedidoCliente (){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula :"+cedula);
        System.out.println("Correo :"+correo);
        System.out.println("Edad: "+edad);
        System.out.println("Cantidad de pedidos: "+cantidadPedidos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }

    public void setCantidadPedidos(int cantidadPedidos) {
        this.cantidadPedidos = cantidadPedidos;
    }
 
}
