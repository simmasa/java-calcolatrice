public class CalcoliHelper {

    //constructor
    private CalcoliHelper() {}

    public static int somma(int primo,int secondo) {
        return primo+secondo;
    }
    public static int differenza(int primo,int secondo) {
        return primo-secondo;
    }
    public static int moltiplicazione(int primo,int secondo) {
        return primo*secondo;
    }

    // Math.abs()
    public static int assoluto(int primo) {
        if (primo<0) {
            return primo*-1;
        } else
            return primo;
    }
    //Math.min
    public static int minimo (int primo,int secondo) {
        if (primo<secondo) {
            return primo;
        } else
            return secondo;
    }
    //Math.max
    public static int massimo (int primo,int secondo) {
        if (primo>secondo) {
            return primo;
        } else
            return secondo;
    }

    // Overload per i double

    public static double somma(double primo,double secondo) {
        return primo+secondo;
    }
    public static double differenza(double primo,double secondo) {
        return primo-secondo;
    }
    public static double moltiplicazione(double primo,double secondo) {
        return primo*secondo;
    }

    public static double assoluto(double primo) {
        if (primo<0) {
            return primo*-1;
        } else
            return primo;
    }

    public static double minimo (double primo,double secondo) {
        if (primo<secondo) {
            return primo;
        } else
            return secondo;
    }

    public static double massimo (double primo,double secondo) {
        if (primo>secondo) {
            return primo;
        } else
            return secondo;
    }

    // bonus 2
    public static long potenza (int numero, int potenza) {
        if (numero==0 && potenza ==0) {
            return 1;
        } else if (potenza ==0) {
            return 1;
        } else {
            long result=1;
            while (potenza!=0) {
                result*=numero;
                potenza--;
            }
            return result;
        }
    }
}
