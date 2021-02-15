package io.javalab;

public class Main {

    static class Key{
        public void runEngine(Engine key){
            key.start();
        }

    }

    public static void main(String[] args) {
        Engine e=new Truck();
        new Key().runEngine(e);
    }
}
