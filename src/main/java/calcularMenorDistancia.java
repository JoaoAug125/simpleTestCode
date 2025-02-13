public class calcularMenorDistancia {

    int distanciaA= 110;
    int distanciaB= 110;

    public static void calcularMenorDistancia(int primeiroValor, int segundoValor){
        if (primeiroValor < segundoValor){
            System.out.println("A menor distancia é: " + primeiroValor);
        } else if (primeiroValor > segundoValor){
            System.out.println("A menor distancia é: " + segundoValor);
        } else {
            System.out.println("As distancias são iguais!");
        }
    }

    public void main (String args[]){
       calcularMenorDistancia(distanciaA, distanciaB);
    }
}

