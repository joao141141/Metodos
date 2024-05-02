public class SmartTv {

    boolean ligada = false;
    int canal = 5;
    int volume = 25;


    public void ligar() {
        ligada = true;
    }
    
    public void desligar() {
        ligada = false;
    }

    public void volumeMais (){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void volumeMenos (){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void canalMais(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void canalMenos(){
        canal++;
        System.out.println("Diminuindo o canal para: " + canal);

    }

    public void definirCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal Atual é: " + canal);

    }
}    