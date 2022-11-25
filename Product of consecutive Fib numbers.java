public class ProdFib {

    public static long[] productFib(long prod) {
        long F1 = 0, F2 = 1, temp;
        while(F1 * F2 < prod) {
            temp = F2;
            F2 += F1;
            F1 = temp;
        }
        if(F1 * F2 == prod)
            return new long[] {F1, F2, 1};
        else
            return new long[] {F1, F2, 0};
    }
}