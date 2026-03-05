/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c12026.clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C12026Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ejemploArregloComida();
        //ejemploArregloEdades();
        //matrixEjemplo();
        int fila=2;
        int columna=3;
        int [][] notas = new int[fila][columna];
        comoRecibirUnaMatrixPorParametroSolicitar(notas, fila, columna);
        comoRecibirUnaMatrixPorParametroImprimir(notas, fila, columna);
        
    }
    
    public static void  ejemploArregloComida(){
        // 1 sushi
        // 2 hamburguesa
        // 3 pinto
        // 4 cantones 
        String topComida[] = new String[4];
        topComida[0]="Sushi";
        topComida[1]="hamburguesa";
        topComida[2]="pinto";
        topComida[3]="cantones";
        
        
        for (int i = 0; i < topComida.length; i++) {
            JOptionPane.showMessageDialog(null, topComida[i]);
        }
        
        //topComida[5]="mac"; error
        
        JOptionPane.showMessageDialog(null, topComida[1]+topComida[2]);
    
    }
    
    
    public static void ejemploArregloEdades(){
        int cantidadEdades=0;
        String resultadoTotal="";
        cantidadEdades=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de edades a solicitar"));
        int[] edades =new int[cantidadEdades]; // nota el parentesis cuadrado se puede poner en el int o el nombre de la variable 
        for (int i = 0; i < edades.length; i++) {
            edades[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite la edade del vector en la posicion "+i));
        }
        
        for (int i = 0; i < edades.length; i++) {
            resultadoTotal+= "La posición " + i + " es de " + edades[i]+"\n";
            JOptionPane.showMessageDialog(null, "La posición " + i + " es de " + edades[i]);
        }
        
        JOptionPane.showMessageDialog(null, resultadoTotal);
    }   
    
    public static void matrixEjemplo(){
        char parqueo[][] = new char[3][3];
        // el leght solo se puede utilizar la matriz es cuadrada
        for (int i = 0; i < parqueo.length; i++) {
            for (int j = 0; j < parqueo.length; j++) {
                parqueo[i][j]=JOptionPane.showInputDialog("Digite O para ocupardo  L para libre").charAt(0);
            }
        }
        
        String resultado = "";
        for (int i = 0; i < parqueo.length; i++) {
            for (int j = 0; j < parqueo.length; j++) {
                resultado += parqueo[i][j] + "  ";
            }
            resultado += "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    
    
    }
    
    
     public static void comoRecibirUnaMatrixPorParametroSolicitar(int matrix[][], int filas, int columnas){

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrix[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Digite O para ocupardo  L para libre"));
            } 
        }

    }
    
    
    public static void comoRecibirUnaMatrixPorParametroImprimir(int matrix[][], int filas, int columnas){
        
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += matrix[i][j] + "  ";
            }
            resultado += "\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    
    
   
    
}
