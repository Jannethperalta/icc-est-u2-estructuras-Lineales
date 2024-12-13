package Ejercicio_01_sign;

import Materia.Stacks.StackGeneric;

public class SignValidator {
    public static boolean isValid(String s) {
        StackGeneric<Character> pila = new StackGeneric<>();

        // Recorrer cada carácter del string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Si el carácter es uno de los signos de apertura, lo agregamos a la pila
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }
            // Si es un signo de cierre, verificamos si corresponde al signo de apertura
            // correcto
            else if (c == ')' && !pila.isEmpty() && pila.peek() == '(') {
                pila.pop();
            } else if (c == '}' && !pila.isEmpty() && pila.peek() == '{') {
                pila.pop();
            } else if (c == ']' && !pila.isEmpty() && pila.peek() == '[') {
                pila.pop();
            } else {
                // Si no hay coincidencia, la cadena no es válida
                return false;
            }
        }

        // Si la pila está vacía, la cadena es válida
        return pila.isEmpty();
    }
}
