package com.template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

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


    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        // TODO: Implement this method
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            suma += list.get(i);
        }
        return suma;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        // TODO: Implement this method
        int mayor=0;
        if (list.isEmpty()){
            throw new IllegalArgumentException("Está vacia");
        }
        for (int  i = 0;  i < list.size();  i++) {
            int el = list.get(i);
            if (mayor <= el) {
                mayor = el;
            }
        }
        return mayor;
    }

    // 13. Filter Even Numbers from a List
     public List<Integer> filterEvenNumbers(List<Integer> list) {
            // TODO: Implement this method
         List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
                int n = list.get(i);
                if (n % 2 == 0) {
                    evenList.add(n);
                }
            }
        return evenList;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        // TODO: Implement this method
        list1.addAll(list2);
        return list1;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        // TODO: Implement this method
        if (list.indexOf(element) >= 0) {
            return true;
            }
        else{
                return false;
            }
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        List<String> upperList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i);
            String upperText = text.toUpperCase();
            upperList.add(upperText);
        }
        return upperList;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
        List<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        // TODO: Implement this
        return new HashSet<>(list);
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        // TODO: Implement this method
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        // TODO: Implement this method
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // TODO: Implement this method
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String keys = entry.getKey();
            String values = entry.getValue();
            list.add(keys + "=" + values);
        }
        return list;
    }
}
