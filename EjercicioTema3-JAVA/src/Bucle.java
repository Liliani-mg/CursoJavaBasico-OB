public class Bucle {
        public static void main(String[] args){
            String[] palabras = {"Hola ", "que ", "tal ", "estas?"};
            String palabrasConcat = "";

            for(int i=0;i<palabras.length;i++){
                palabrasConcat += palabras[i];
            }

            System.out.println(palabrasConcat);
        }

}
