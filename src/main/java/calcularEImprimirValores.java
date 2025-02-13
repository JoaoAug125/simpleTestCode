public class calcularEImprimirValores {

    int valorA= 110;
    int valorB= 110;

    public static void somaValores(int primeiroValor, int segundoValor){
        int valorC  = primeiroValor + segundoValor;
        System.out.println(valorC);
    }

    public void main (String args[]){
       somaValores(valorA, valorB);
    }
}

