/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Recursividad {
    
      public void recorrerArrayFor(int[]array){
        for(int i=0; i<array.length; i++){
            System.out.printf("Indice %d, valor %d\n", i, array[i]);
        }
    }
    
    public void recorrerArrayRecursivo(int[] array, int i){
        if(i<array.length){
            System.out.printf("Indice %d, valor %d\n", i, array[i]);
            recorrerArrayRecursivo(array, i+1);
        }
    }
    
    public int sacaPosmayorFor(int[]array){
        int posM=0;
        int temp=array[0];
        
        for (int i=0; i<array.length; i++){
            if(array[i]>temp){
                posM=i; 
                temp=array[i];
            }
        }
        return posM;
    }
}
