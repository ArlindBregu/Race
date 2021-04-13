/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread4;

/**
 *
 * @author arlin
 */
public class Corridore implements Runnable{

    Thread t;
    
    public Corridore(String nome) {
        this.t = new Thread(this, nome);
        t.start();
    }
    
    @Override
    public void run(){
    
        for(int i=0; i<100; i++){
        
            System.out.println(t.getName() +i +"metri");
            
            try{
            
                Thread.sleep((long)(Math.random() * 400));
            } catch (Exception e){
            
            } 
        }
        
        System.out.println(t.getName() + " Arrivato");
        
    }
    
    
    
}
