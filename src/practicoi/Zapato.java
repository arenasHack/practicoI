package practicoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 416pc13
 */
public class Zapato extends Producto {
    
    private int talla;
    public Zapato(double precio, String nombre, String marca, int talla) {
        super(precio, nombre, marca);
        this.talla = talla;
    }

    /**
     * @return the talla
     */
    public int getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}
