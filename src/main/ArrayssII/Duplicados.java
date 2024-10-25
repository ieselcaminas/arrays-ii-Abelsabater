package ArrayssII;

public class Duplicados {

    public static int repetidos(int[]lista){
        int duplicados=0;
        int num=0;
        int posicion=0;
        for (int i = 0; i < lista.length; i++) {
            num=lista[i];
            posicion++;
            for (int j = posicion; j < lista.length; j++) {
                if(lista[i]==lista[j]){
                    duplicados++;
                }
            }
        }
        return duplicados+1;
    }

    public static void main(String[] args) {
        int[] llista={1,2,2,4,5,6,4,2};
        System.out.println("Hi han "+repetidos(llista)+" duplicados");
    }
}
