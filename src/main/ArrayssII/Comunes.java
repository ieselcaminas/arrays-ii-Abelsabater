package ArrayssII;

public class Comunes {

    public static String comuns(int[] llista1, int[] llista2){
        String comuns="";
        for (int i = 0; i < llista1.length; i++) {
            for (int j = 0; j < llista2.length; j++) {
                if(llista1[i]==llista2[j] ){
                    comuns+=llista1[i]+" ";
                }
            }
        }
        return comuns;
    }

    public static void main(String[] args) {
        int [] llista1={4,5,7,4,3};
        int [] llista2={4,3,6};
        System.out.println(comuns(llista1,llista2));
    }
}