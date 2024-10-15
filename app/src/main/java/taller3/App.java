/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   
      try {

         System.out.println(Escribir_asc(5, 8, 3));

         System.out.println(Obtener_cifras(545));

         System.out.println(Clasificar_char((char)'Z'));

         System.out.println(Hallar_division_exacta(10, 3));

         System.out.println(Consultar_hab((byte)3, "AA"));

         System.out.println(Obtener_obs(false, false, false));

         System.out.println(Conocer_invitacion("blanco"));
      } 
      
      catch (Exception e) {
         // TODO: handle exception
      }
   }

   /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */

   public static String Escribir_asc(int n1, int n2, int n3){

      try {

         String mensaje = "";
         String mensaje_iguales = "Error: La función no considera números iguales";
         String mensaje_error = "Ocurrió un error inesperado";

         if(n1 == n2 || n1 == n3 || n2 == n3 ){
            return mensaje_iguales;
         }

         else if(n1 > n2 && n2 > n3){
            mensaje = n1 + " - " + n2 + " - " + n3;
            return mensaje;
         }

         else if(n1 > n3 && n3 > n2){
            mensaje = n1 + " - " + n3 + " - " + n2;
            return mensaje;
         }

         else if(n2 > n1 && n1 > n3){
            mensaje = n2 + " - " + n1 + " - " + n3;
            return mensaje;
         }

         else if(n2 > n3 && n3 > n1){
            mensaje = n2 + " - " + n3 + " - " + n1;
            return mensaje;
         }

         else if(n3 > n2 && n2 > n1){
            mensaje = n3 + " - " + n2 + " - " + n1;
            return mensaje;
         }

         else if(n3 > n1 && n1 > n2){
            mensaje = n3 + " - " + n1 + " - " + n2;
            return mensaje;
         }

         else{
            return mensaje_error;
         }

      } 
      
      catch (Exception e) {
         // TODO: handle exception
         String mensaje_error = "Ocurrió un error inesperado";
         return mensaje_error;
      }
   }

   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */

   public static byte Obtener_cifras(int numero){

      try {

         byte cifras = 0;
         String conteo = "";

         final int lim_inf = 0;
         final int lim_sup = 50000;
         

         if (numero >= lim_inf && numero <= lim_sup) {
            
            conteo = Integer.toString(numero);

            cifras = (byte) conteo.length();

            return cifras;
         }

         else{
            return 0;
         }
      }
      
      catch (Exception e) {
         // TODO: handle exception
         return -1;
      }
   }

   /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

   public static String Clasificar_char(char caracter){

      try {

         int valorascii = (int) caracter;

         String mensaje = "";
         String mensaje_error = "Ocurrió un error inesperado";

         final int

         inf_n = 48, sup_n = 57, inf_l = 65, sup_l = 90, inf_l2 = 97, sup_l2 = 122, inf_a = 0, sup_a = 255;

         if(valorascii >= inf_a && valorascii <= sup_a){

            if ((valorascii >= inf_l && valorascii <= sup_l) || (valorascii >= inf_l2 && valorascii <= sup_l2)){

               mensaje = "ES LETRA";

               return mensaje;
            }

            else if(valorascii >= inf_n && valorascii <= sup_n){

               mensaje = "ES NUMERO";

               return mensaje;
            }

            else{
               mensaje = "ESPECIAL";

               return mensaje;
            }
         }

         else{
            return mensaje_error;
         }
      } 
      
      catch (Exception e) {
         // TODO: handle exception
         String mensaje_error = "Ocurrió un error inesperado";
         return mensaje_error;
      }
   }

   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */

   public static String Hallar_division_exacta(int n1, int n2){

      try {
         
         int modulo = 0;
      
         final int constante = 0;

         String mensaje = "";
         String error_cociente = "NO SE ADMITE CERO O NEGATIVOS";

         if(n1 > constante && n2 > constante){

            modulo = n1 % n2;

            if(modulo == constante){

               mensaje = "DIVISION EXACTA";

               return mensaje;
            }

            else{

               mensaje = "DIVISION NO EXACTA";

               return mensaje;
            }

         }

         else{
            return error_cociente;
         }
      } 
      
      catch (Exception e) {
         // TODO: handle exception
         String mensaje_error = "Ocurrió un error inesperado";
         return mensaje_error;
      }
   }

   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

   public static String Consultar_hab(byte numero_camas, String tipo){

      try {

         String habitaciones = "";
         String error = "DATOS NO VÁLIDOS";

         final int camas1 = 1;
         final int camas2 = 2;
         final int camas3 = 3;

         final String aa = "AA";
         final String ve = "VE";

         if(numero_camas >= 1 && numero_camas <= 3){

            if (tipo == aa || tipo == ve){
               
               if(numero_camas == camas2 && tipo == aa){
                  habitaciones = "101|301";
                  return habitaciones;
               }

               else if(numero_camas == camas1 && tipo == ve){
                  habitaciones = "102";
                  return habitaciones;
               }

               else if(numero_camas == camas3 && tipo == aa){
                  habitaciones = "201";
                  return habitaciones;
               }

               else if(numero_camas == camas2 && tipo == ve){
                  habitaciones = "202";
                  return habitaciones;
               }

               else {
                  return error;
               }

            }

            else{
               return error;
            }

         }

         else{
            return error;
         }
   }

      catch (Exception e) {
         // TODO: handle exception
         String inesperado = "Ocurrió un error inesperado";
         return inesperado;
      }
   }
   
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

   public static String Obtener_obs(boolean plato1, boolean plato2, boolean plato3){

      try {
         
         String obsequio = "";
         String falsos = "PLATOS NO VÁLIDOS";

         if(plato1 == false && plato2 == false && plato3 == false){
            return falsos;
         }

         else if(plato1 == true && plato2 == false & plato3 == false){
            obsequio = "POSTRE";
            return obsequio;
         }

         else if(plato1 == true && plato2 == true & plato3 == false){
            obsequio = "BEBIDA";
            return obsequio;
         }

         else if(plato1 == true && plato2 == true & plato3 == true){
            obsequio = "BEBIDA Y POSTRE";
            return obsequio;
         }

         else{
            return obsequio;
         }
      } 
      
      catch (Exception e) {
         // TODO: handle exception
         String inesperado = "Ocurrió un  error inesperado";
         return inesperado;
      }
   }

   /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

    public static String Conocer_invitacion(String color){

      try{

         String invitacion = "";

         switch (color) {

            case "verde": invitacion = "Invita a las cervezas";
               break;
            case "azul": invitacion = "Invita a la pizza";
               break;
            case "rojo": invitacion = "Invita al postre";
               break;
            case "amarillo": invitacion = "Paga el parqueadero de todos";
               break;
            case "blanco": invitacion = "Vaya y disfrute";  
               break;
            case "negro": invitacion = "Vaya y disfrute";  
               break;
            default: invitacion = "Error en el color";
               break;

         }

         return invitacion;
      } 
      
      catch (Exception e) {
         // TODO: handle exception
         String inesperado = "Ocurrió un error inesperado";
         return inesperado;
      }
    }

}
