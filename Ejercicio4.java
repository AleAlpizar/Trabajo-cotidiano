public class Ejercicio4{
    public static void main(String[] args){
        int recorrido = 20;
        for(int i = recorrido;i<=30;i++){
            if(recorrido <= 30){
                if(recorrido>=20){
                    int elevado = recorrido * recorrido;
                    System.out.print("el numero "+recorrido+" elevado al cuadrado es "+elevado+"\n");
                    recorrido += 1;
                }
            }
        }
    }
}
