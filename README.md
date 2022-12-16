# Fast Fourier Transform and Complex Class

## Info

-   Author: Michael Slain
-   Acknowledgements: Mr. Kuszmaul

## Outline

-   Complex
    -   _constructor_
        -   **input:** real number, imaginary number
        -   **output:** _none_
        -   **effect:**saves real and imaginary number provided
    -   toString
        -   **input:** _none_
        -   **output:** a string
        -   **effect:** returns a string that represents the complex class
    -   abs
        -   **input:** _none_
        -   **output:** complex modulus
        -   **effect:** calculates complex modulus based on the saved real and imaginary numbers
    -   phase
        -   **input:** _none_
        -   **output:** a phase
        -   **effect:** calculates the phase based on the saved real and imaginary numbers
    -   plus
        -   **input:** an instance of the complex class
        -   **output:** an instance of the complex class
        -   **effect:** adds the two instances together
    -   minus
        -   **input:** an instance of the complex class
        -   **output:** an instance of the complex class
        -   **effect:** subtracts the two instances by each other
    -   times
        -   **input:** an instance of the complex class
        -   **output:** an instance of the complex class
        -   **effect:** multiplies the two instances together
    -   scale
        -   **input:** an alpha value
        -   **output:** an instance of the complex class
        -   **effect:** returns a new instance of the complex class whose value is (this \* alpha)
    -   conjugate
        -   **input:** _none_
        -   **output** a new instance of the complex class
        -   **effect:** returnes the conjugate of this instance of the complex class
    -   reciprocal
        -   **input:** _none_
        -   **output:** a new instance of the complex class
        -   **effect:** calculates the recpiprocal of this instance of the complex class
    -   re
        -   **input:** _none_
        -   **output:** a real number
        -   **effect:** returns the real number part of the complex class
    -   im
        -   **input:** _none_
        -   **output:** an imaginary number
        -   **effect:** returns the imaginary number part of the complex class
    -   divides
        -   **input:** an instance of the complex class
        -   **output:** an instance of the complex class
        -   **effect:** divides the complex class provided by the current one
-   FFT
    -   fft
        -   **input:** an array of instances of the complex class
        -   **output:** an array of instances of the complex class
        -   **effect:**
            calculates the fast fourier transform of a complex array
    -   ifft
        -   **input:** an array of instances of the complex class
        -   **output:** an array of instances of the complex class
        -   **effect:**
            calculates the inverse fast fourier transform of a complex array
    -   cconvolve
        -   **input:** 2 arrays that consist of instances of the complex class
        -   **output:** an array of instances of the complex class
        -   **effect:** calculates the circular convolution of the two complex class arrays
    -   convolve
        -   **input:** 2 arrays that consist of instances of the complex class
        -   **output:** an array of instances of the complex class
        -   **effect:** calculates the linear convolution of the two complex class arrays

## Dev

-   Run tests

```zsh
java Main.java
```
