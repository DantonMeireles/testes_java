// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv(); // Criando uma classe

        System.out.println(smartTv.ligada); // quero saber se a tv ta ligada
        System.out.println(smartTv.volume); // quero saber o volume
        System.out.println(smartTv.canal); // quero saber o canal

        System.out.println("");

        smartTv.ligar(); // Tv esta ligada

        System.out.println(smartTv.ligada); // True

        smartTv.maisCanal();
        smartTv.maisCanal();
        smartTv.maisCanal();
        smartTv.menorVolume();
        smartTv.mudarVolume(200);
    }
}