/*
    Jeito diferente que economiza espaço de código

    obs: as if statments do java são similares a C/C++
*/

public class operadorCondicional {

   public static void main(String[] args) {
       int value1 = 1;
       int value2 = 2;
       int result;
       boolean someCondition = false;

        //Operador ?: usado como se-então. 
        //(Condição : se verdadeiro : se falso)
       result = someCondition ? value1 : value2;
       System.out.println(result);
   }
    
}