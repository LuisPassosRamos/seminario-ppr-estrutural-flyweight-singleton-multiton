package exemploCirculo.service;
import java.util.HashMap;
import java.util.Map;

import exemploCirculo.model.Circulo;

public class FabricaDeCirculos {
    
    private Map<String,Circulo> circulos;


    public FabricaDeCirculos() {
        setCirculos(new HashMap());
    }

    public Circulo getCirculo(String cor){
        Circulo circulo = getCirculos().get(cor);// verifica se já existe um círculo com a cor especificada
        if(circulo == null){
            circulo = new Circulo(cor);
            getCirculos().put(cor, circulo);
            System.out.println("Criando um círculo de cor " + cor);
        }
        return circulo; 
    }

    public Map<String, Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(Map<String, Circulo> circulos) {
        this.circulos = circulos;
    }


}
