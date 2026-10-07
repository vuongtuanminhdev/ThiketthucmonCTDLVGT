/**
 * CAC BUOC THUC HIEN THUAT TOAN SAP XEP CHEN (INSERTION SORT):
 * 
 * 1. Duyet i tu 1 den n - 1 (a[0] coi nhu da sap xep).
 * 2. Luu key = a[i] va j = i - 1.
 * 3. Duyet khi j >= 0 va a[j] > key:
 *    - DICH CHUYEN a[j] sang a[j + 1].
 *    - Giam j xuong 1 (j--).
 * 4. Chen key va o a[j + 1].
 * 
 * MA GIA (PSEUDOCODE):
 * -------------------
 * HAM InsertionSort(a):
 *     VOI i TU 1 DEN n - 1 LAM:
 *         key = a[i]
 *         j = i - 1
 *         TRONG KHI (j >= 0 VA a[j] > key) LAM:
 *             a[j + 1] = a[j]
 *             j = j - 1
 *         KET TRONG KHI
 *         a[j + 1] = key
 *     KET VONG LAP
 */
public class InsertionSort {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

}