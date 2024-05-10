public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){ // metodo de ligar a tv
        ligada = true;
        System.out.println("Ligando a TV");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Desligando a TV");
    }

    public void maisVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void menorVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }

    public void maisCanal(){
        canal++;
        System.out.println("Passando para o canal: "+canal);
    }
    public void menosCanal(){
        canal--;
        System.out.println("Voltando para o canal: "+canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void mudarVolume (int novoVolume){
        if(novoVolume >= 1 && novoVolume <= 100){
            volume = novoVolume;
            System.out.println("O volume escolhido foi: "+volume);
        }else{
            System.out.println("Escolha um volume entre 1 ou 100 ");
        }
    }
}
