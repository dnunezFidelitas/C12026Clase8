/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasovectoresymartrices;

/**
 *
 * @author viti
 */
public class Fernando {
    private String celulares[];
    private int id;

    public Fernando(int cantidad) {
        this.celulares=new String[cantidad];
        celulares[0]="nokia";
    }
    
    

    public String[] getCelulares() {
        return celulares;
    }

    public void setCelulares(String[] celulares) {
        this.celulares = celulares;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String datos ="";
        for (int i = 0; i < celulares.length; i++) {
            datos += celulares[i]+",";
        }
        return "Fernando{" + "celulares=" + datos + ", id=" + id + '}';
    }
    
    
    
    
}
