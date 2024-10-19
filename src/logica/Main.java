/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import igu.*;

/**
 *
 * @author ssuaz
 */
public class Main {
    private static MenuDeOpciones menu;
    private static Member members[];
    private static int contador ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        members = new Member[35];
        Welcome w = new Welcome();
        
        for(int i = 0 ; i < 35 ; i++){
            members[i] = new Member();
            
        }
        contador =0;
        w.setVisible(true);
    }
    
    public static void SaveMember (int id , String name , boolean vip){
        members[contador].setId(id);
        members[contador].setName(name);
        members[contador].setVip(vip);
        contador++;
    }
    
    public static void Search (int bus){
        
    }
}
