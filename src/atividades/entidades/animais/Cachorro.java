package atividades.entidades.animais;

import atividades.entidades.animais.classes.Mamifero;

public class Cachorro extends Mamifero {
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au");
    }
}
