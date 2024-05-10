// Se eu quiser mover esse arquivo .java para outra pasta dentro deste projeto, eu preciso na primeira linha do
// codigo digitar `package` e o caminho das pastas, lembrando que tem que estar dentro da pasta src

public class MinhaClasse {

    public static void main (String [] args) { //Quando eu tiver uma classe que e possivel rodar, realizar a execucao
        // dela, precisa desse metodo `main`
        System.out.println("Salve salve");

        //Sempre que for criar uma variavel ela tera a seguinte forma: Tipo de variavel -> Nome da variavel -> valor

        String MeuNome = "Danton";
        int Ano_nascimento = 2005;
        double PI = 3.14; // o tipo de variavel double ou float fazem a msm coisa, porem o float e menor (comporta
        // menos numeros)


        // Eu criei o metodo nome completo ali em baixo, aqui eu estou chamando ele
        String primeiroNome="cleiton";
        String segundoNome="aaaaa";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);

    }
    //Metodo
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
