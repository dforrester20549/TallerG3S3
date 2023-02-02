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
    
    public int sacaPosmayor(int[]array){
        if(array.length==0){
            return -1;
        }else{
            return sacaPosmayorR (array, 0, array[0], 0);
        }
    }
    
    private int sacaPosmayorR(int[]array, int i, int posM, int temp){
        if(i>=array.length){
            return posM;
        }else if(array[i]>temp){
            return sacaPosmayorR(array, i+1, array[i], i);
        }else{
            return sacaPosmayorR(array, i+1, temp, posM);
        }
    }
}
