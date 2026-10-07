/**
 * CAC BUOC THUC HIEN THUAT TOAN TIM KIEM TUYEN TINH (LINEAR SEARCH):
 * 
 * 1. Duyet i tu 0 den n - 1.
 * 2. So sanh a[i] voi x:
 *    - Neu a[i] == x: Tra ve chi so i va ket thuc.
 * 3. Neu duyet het mang khong tim thay: Tra ve -1.
 * 
 * MA GIA (PSEUDOCODE):
 * -------------------
 * HAM LinearSearch(a, x):
 *     VOI i TU 0 DEN n - 1 LAM:
 *         NEU a[i] == x THI:
 *             TRA VE i
 *         KET NEU
 *     KET VONG LAP
 *     TRA VE -1
 */
public class LinearSearch {

    public static int linearSearch(int[] a, int x) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }
}