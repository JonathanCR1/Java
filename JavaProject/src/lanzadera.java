import java.util.Scanner;

public class lanzadera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int input;
        int input2;
        String operacion = "";
        String clean="";


        System.out.println("Introduzca su primer numero: ");
        input = entrada.nextInt();

        System.out.println("Que operacion desea realizar ?");
        clean = entrada.nextLine();
        operacion = entrada.nextLine();
        String noSpaceStr = operacion.replaceAll("\\s", "");

        System.out.println("Introduzca su segundo numero: ");
        input2 = entrada.nextInt();

        switch (noSpaceStr.toLowerCase()) {
            case "multiplicacion", "multiplicación","*" -> System.out.println("El resultado de la multiplicacion con los parametros "+input+" y "+input2+" es: "+multiplicacion(input, input2));
            case "resta", "-" -> System.out.println("El resultado de la resta con los parametros "+input+" y "+input2+" es: "+resta(input, input2));
            case "suma", "+" -> System.out.println("El resultado de la suma con los parametros "+input+" y "+input2+" es: "+suma(input, input2));
            case "division" ,"división","/" -> System.out.println("El resultado de la division con los parametros "+input+" y "+input2+" es: "+division(input,input2));
        }
    }

    public static Integer resta(int a , int b ){
        return a-b;
    }
    public static Integer suma(int a , int b ){
        return a+b;
    }
    public static Integer multiplicacion(int a , int b ){
        return a*b;
    }
    public static Integer division(int a , int b ){
        return a/b;
    }



}
