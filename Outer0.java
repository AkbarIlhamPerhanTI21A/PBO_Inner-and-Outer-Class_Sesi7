/*
 * Tugas Sesi7 PBO
 * Nama  : Akbar Ilham Perhan
 * NIM   : 20210040083
 * Kelas : TI21A
 */

package Outer;

public class Outer0 {
     int number = 0;

    void outerMethod() {

    class Inner {
        public void print() {
            System.out.println("Mengakses inner class yang ke: " + (number++));
        }
    }

        Inner in = new Inner();
        in.print();
    }
}

class Main {
    public static void main(String[] args) {
        Outer0 out = new Outer0();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();

    }
}


