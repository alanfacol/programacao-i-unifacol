package atividades.entidades.animais.classes;

public class Mamifero extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Mamífero");
    }

    @Override
    public void comer() {
        System.out.println("Por ser um " + this.getAlimentacao().name().toLowerCase() + ", ele esta "
                + this.getAlimentacao().getDesc());
    }

    @Override
    public void reproduzir() {
        System.out.println("Este animal é do tipo " + this.getReproducao().getDesc());

    }

    @Override
    public void locomover() {
        System.out.println("Este animal se locomove " + this.getLocomocao().getDesc());

    }

}
