import java.util.*;

public class Test {
    public void run() {
        testComplex();
        testFFT();
    }

    private void testComplex() {
        System.out.println("--");
        System.out.println("Testing Complex Class");
        System.out.println("--");

        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Re(a) = " + a.re());
        System.out.println("Im(a) = " + a.im());
        System.out.println("b + a = " + b.plus(a));
        System.out.println("a - b = " + a.minus(b));
        System.out.println("a * b = " + a.times(b));
        System.out.println("b * a = " + b.times(a));
        System.out.println("a / b = " + a.divides(b));
        System.out.println("(a / b) * b = " + a.divides(b).times(b));
        System.out.println("conj(a) = " + a.conjugate());
        System.out.println("|a| = " + a.abs());
    }

    private void testFFT() {
        System.out.println("--");
        System.out.println("Testing FTT Class");
        System.out.println("--");

        int n = 16;
        Random random = new Random();
        Complex[] x = new Complex[n];

        System.out.println("Data");
        for (int i = 0; i < n; i++) {
            x[i] = new Complex(i, 0);
            double randomValue = -1.0 + (1.0 - -1.0) * random.nextDouble();
            x[i] = new Complex(randomValue, 0);
        }
        show(x, "x");

        System.out.println("FFT of original data");
        Complex[] y = FFT.fft(x);
        show(y, "y = fft(x)");

        System.out.println("Inverse FFT");
        Complex[] z = FFT.ifft(y);
        show(z, "z = ifft(y)");

        System.out.println("Circular convolution of x with itself");
        Complex[] c = FFT.cconvolve(x, x);
        show(c, "c = cconvolve(x, x)");

        System.out.println("Linear convolution of x with itself");
        Complex[] d = FFT.convolve(x, x);
        show(d, "d = convolve(x, x)");
    }

    private void show(Complex[] x, String title) {
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println();
    }
}
