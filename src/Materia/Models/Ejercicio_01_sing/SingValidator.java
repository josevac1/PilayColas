package Materia.Models.Ejercicio_01_sing;


import Materia.Pilas.PIlaGenerica;

public class SingValidator {

    public boolean isValid(String s){
        
        PIlaGenerica<Character> pila1=new PIlaGenerica<>();
        for(char a : s.toCharArray()){

            if (a == '(' || a == '{' || a == '[') {
                pila1.push(a);

            }  else if (a == ')' || a == '}' || a == ']') {
                if (pila1.isEmpty()) {
                    return false;
                }
                char top = pila1.pop();
                if ((a == ')' && top != '(') || 
                    (a == '}' && top != '{') || 
                    (a == ']' && top != '[')) {
                    return false;

                }
            }
        }   
        return pila1.isEmpty();
    }

     
}
