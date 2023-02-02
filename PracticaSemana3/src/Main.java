/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursividad recu = new Recursividad();
        
        int[] array = {16,900,34,78,100};
        
        /*recu.recorrerArrayFor(array);
        
        System.out.println("=============POR RECURSIVIDAD==============");
        recu.recorrerArrayRecursivo(array, 0);
        */
        int posMayor=recu.sacaPosmayorFor(array);
        System.out.printf("Pos Mayor: %d\n", posMayor);
        }   
    }
