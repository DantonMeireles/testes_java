// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String dia = "Sexta" +"-"+ "Feira";
        System.out.println(dia);

        // A partir do momento que o java identifica um caractere ele concatena
        String concatena = "?";
        concatena = 1+1+1+"1"; // Aqui ele retorna 31
        System.out.println(concatena);
        concatena = "1"+1+1+1; // Aqui ele retorna 1111
        System.out.println(concatena);

        // Caso eu queira deixar um numero negativo, e por algum motivo maluco eu resolver deixar ele positivo
        // novamente seria necessario multiplicar por -1, pois se eu colocar apenas o sinal de '+' o java entende que
        // eu estou somando algo

        int numero_aleatorio = 10;
        System.out.println(numero_aleatorio); // Retorna valor 10

        numero_aleatorio = - numero_aleatorio;
        System.out.println(numero_aleatorio); // Retorna valor -10

        numero_aleatorio = + numero_aleatorio;
        System.out.println(numero_aleatorio); // Retorna valor -10

        numero_aleatorio = numero_aleatorio * -1;
        System.out.println(numero_aleatorio); // Retorna valor 10

        numero_aleatorio++; //11
        numero_aleatorio--; //10
        System.out.println(numero_aleatorio);

        boolean sla = false;
        sla = !sla;

        System.out.println(sla);

        // && 'e'
        // || 'ou'
        // > 'maior'
        // < 'menor'
        // == 'igual'
        // != 'diferente, ou nao igual'
        // >= 'maior igual'
        // <= 'menor igual'

        int c,a,b;
        a= 1;
        b=1;
        c=1;
        if (a>=b){
            System.out.println("A>=B");
        }else{
            System.out.println("A nao e maior que B");
        }

        if (a == b && c == a){
            System.out.println("A = B = C");
        }else {

        }

        if (a + b > c || c + a > b){
            System.out.println("2 > 1");
        }else {

        }
    }
}