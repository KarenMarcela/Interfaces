
package com.mycompany.interfaz.being;


public class Human implements Move{ //Que implemente lo que tiene la interface
    private int height;
    private String name;

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    
    
    
    //Sobreescritura, deden tener los mismos metodos que la clase que estoy implementando
    @Override
    public void walk(){
        System.out.println("Esta caminando erguido");
    }
    
    @Override
    public void run(){
        System.out.println("Corriendo como naruto");
    }
    
}
