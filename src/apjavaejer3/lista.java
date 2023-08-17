/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apjavaejer3;

/**
 *
 * @author santi
 */
public class lista {
    
    private  String categotria;
    private int precio;
    private String nproducto;

    public lista(String categotria) {
        this.categotria = categotria;
        
       
    }

    public String getCategotria() {
        return categotria;
    }

    public void setCategotria(String categotria) {
        this.categotria = categotria;
    }
    
    
    

    public lista(int precio, String nproducto) {
        this.precio = precio;
        this.nproducto = nproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNproducto() {
        return nproducto;
    }

    public void setNproducto(String nproducto) {
        this.nproducto = nproducto;
    }

    @Override
    public String toString() {
        return categotria;
    }
    

    


}

   
