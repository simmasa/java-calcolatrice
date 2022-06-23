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
        int assoluto;
        if (primo<0) {
            assoluto = primo+(primo*2);
        } else
            assoluto=primo;
        return assoluto;
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
}
