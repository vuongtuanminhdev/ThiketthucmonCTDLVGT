/**
 * CAC BUOC THUC HIEN THUAT TOAN TINH GIAI THUA (FACTORIAL):
 * 
 * 1. TRUONG HOP CO SO (DIEM DUNG DE QUY):
 *    - Neu n == 0 hoac n == 1: Tra ve 1.
 * 
 * 2. BUOC DE QUY:
 *    - Neu n > 1: Goi lai ham factorial(n - 1) va nhan voi n.
 * 
 * MA GIA (PSEUDOCODE):
 * -------------------
 * HAM Factorial(n):
 *     NEU n == 0 HOAC n == 1 THI:
 *         TRA VE 1
 *     NEU KHONG:
 *         TRA VE n * Factorial(n - 1)
 */
public class Factorial {

    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}