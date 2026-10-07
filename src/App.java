import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println("       BAI TAP THUAT TOAN");
            System.out.println("=================================");
            System.out.println("1. Tim kiem tuyen tinh (Linear Search)");
            System.out.println("2. Sap xep chen (Insertion Sort)");
            System.out.println("3. Tinh giai thua (Factorial)");
            System.out.println("0. Thoat");
            System.out.println("=================================");

            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    linearSearch(sc);
                    break;

                case 2:
                    insertionSort(sc);
                    break;

                case 3:
                    factorial(sc);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);

        sc.close();
    }

    // ==============================
    // CAU 1 - LINEAR SEARCH
    // ==============================

    public static void linearSearch(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 1: LINEAR SEARCH =====");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap gia tri can tim: ");
        int x = sc.nextInt();

        int result = LinearSearch.linearSearch(a, x);

        if (result != -1) {
            System.out.println(
                    "Tim thay " + x + " tai vi tri " + (result + 1)
            );
        } else {
            System.out.println(
                    "Khong tim thay " + x + " trong mang."
            );
        }
    }

    // ==============================
    // CAU 2 - INSERTION SORT
    // ==============================

    public static void insertionSort(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 2: INSERTION SORT =====");

        System.out.print("Nhap so phan tu n = ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Nhap cac phan tu:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        InsertionSort.insertionSort(a);

        System.out.println("Mang sau khi sap xep:");

        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    // ==============================
    // CAU 3 - FACTORIAL
    // ==============================

    public static void factorial(Scanner sc) {

        System.out.println();
        System.out.println("===== CAU 3: FACTORIAL =====");

        System.out.print("Nhap n = ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Khong the tinh giai thua so am.");
            return;
        }

        long result = Factorial.factorial(n);

        System.out.println(n + "! = " + result);
    }
}