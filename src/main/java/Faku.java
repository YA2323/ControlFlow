public class Faku {


    public static void main(String[] args) {

        double fa = faku(10);
        System.out.println(fa);

        int fa2 = fakuWhile(4);
        System.out.println(fa2);


    }

    public static double faku(int n){

        double erg =1;
        for(int i = 1;i<=n; i++){

            erg = erg*i;

        }
        return erg;
    }

    public static int fakuWhile(int n){

        int erg2 =1;
        while(n!=0){

            erg2 = erg2* n;
            n--;

        }
        return erg2;

    }


}
