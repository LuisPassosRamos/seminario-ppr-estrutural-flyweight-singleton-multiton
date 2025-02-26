package exemploCirculo;

import exemploCirculo.service.FabricaDeCirculos;

public class Main {

    private static final String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo", "Rosa", "Branco"};
    
    /*  nesse exemplo a fabrica de círculos é responsável por criar círculos de cores diferentes,
        se um círculo de cor especificada já foi criado, a fabrica retorna o círculo já criado  isso evita que círculos de mesma cor sejam criados mais de uma vez
        Seria algo semelhante a um Multiton em que nos temos varias chave-valor, onde a chave é a cor e o valor é o círculo
        por essa relação de chave e valor é garantido que não havera redundancias de círculos de mesma cor
    */
    public static void main(String[] args) {
        FabricaDeCirculos fabrica = new FabricaDeCirculos();// estancia a fabrica
        for(int i = 0; i < 10; i++){// cria 10 círculos aleatórios desenhando-os com atributos de valores aleatorios 
            fabrica.getCirculo(getCorAleatoria())
                .desenhar(getXAleatorio(),
                getYAleatorio(),
                getRaioAleatorio());
        }    
    }

    private static String getCorAleatoria(){
        return cores[(int)(Math.random()*cores.length)];
    }

    private static int getRaioAleatorio(){
        return (int)(Math.random()*100);
    }

    private static int getXAleatorio(){
        return (int)(Math.random()*100);
    }

    private static int getYAleatorio(){
        return (int)(Math.random()*100);
    }
}
