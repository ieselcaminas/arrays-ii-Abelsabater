package ArrayssII;

public class Iguales {
    public static boolean iguales(int [] lista1, int[] lista2){
        return lista1 == lista2;
    }
    public static void main(String[] args) {
        int [] lista1={5,4,3,2,1,4};
        if(iguales(lista1,lista1.clone())){
            System.out.println("Son iguals");
        }
    }
}
