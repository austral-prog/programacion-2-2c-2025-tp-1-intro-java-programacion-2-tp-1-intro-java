package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        int suma = a + b;
        return suma;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        return number % 2 == 0;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a>b) {
            return a; }
        else {
            return b;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int conteo = n;
        int resultado = 1;
        while (conteo>0){
            resultado *= conteo;
            conteo--;
        }
        return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        int contador = input.length() -1;
        String invertido = "";
        while (contador>=0) {
            invertido += input.charAt(contador);
            contador--;
        }
        return invertido;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        int contador = 2;
        while (contador < number) {
            if (number <= 1) {
                return false;
            }
            if (number%contador == 0) {
                return false;
            }
            contador += 1;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int smallest = array[0];
        for (int i: array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int suma = 0;
        for (int i: array) {
            suma += i;
        }
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return ((celsius * (9.0/5.0)) + 32);
    }
}
