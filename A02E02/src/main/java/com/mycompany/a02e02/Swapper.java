package com.mycompany.a02e02;

public class Swapper {
    private float x, y;
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public void setX(float x){
        this.x = x;
    }
    
    public void setY(float y){
        this.y = y;
    }
    
    public void swap(){
        float aux;
        aux = x;
        x = y;
        y = aux;   
    }
}
