/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.pkg1;
import java.util.Scanner;

/**
 *
 * @author shaim
 */
public class Git1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
    char a [][]={{'A','B','A','C','C','D'},{'D','B','A','B','C','A'},{'E','D','D','A','C','B'},{'C','B','A','E','D','C'}};
   
    char key []={'D','B','D','C','C','D'};
    
    for(int i=0;i<a.length;i++){
        int c =0;
    for(int j=0 ;j<a[i].length;j++){
    if(a[i][j]==key[j])
        c++;
    }
    System.out.println("Studen "+i+"'s correct count is "+c+" out of "+a[i].length);
    }    }
    
}
