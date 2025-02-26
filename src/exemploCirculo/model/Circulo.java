package exemploCirculo.model;

public class Circulo{
    private String cor;// estado Intrinseco do objeto, alem do qual esse atrbuto é compartilhadp entre todos os objetos da mesma cor

    public Circulo(String cor){
        setCor(cor);
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void desenhar(int x, int y, int raio){
        System.out.println("Desenhando um círculo de cor " + getCor() + " em (" + x + ", " + y + ") com raio " + raio);
    }
}