public class Main {
    public static void main(String[] args) {

        // Operadores Aritmeticos
        System.out.println("OPERADORES ARITMETICOS");
        int soma = 2+2;
        int sub = 2-2;
        int mult = 2*2;
        int div = 2/2;
        int rest = 2/2;
        System.out.println("soma: 2+2 = "+soma+"\nsubtração: 2-2 = "+sub+"\nmltiplicação: 2*2 = "+mult+"\nDivisão 2/2 = "+div+"\nResto 2%2 = "+rest);

        // Operadores Unario
        System.out.println("\nOPERADORES UNARIO");
        int unario = 2;
        System.out.println("Valor: "+unario);
        System.out.println(++unario+" Incremento\n"+--unario+" Decremento");

        // Operadores Ternario
        System.out.println("\nOPERADOR TERNARIO");
        int a = 1;
        int b = 2;
        String ternario = a < b ? "verdade" : "falso";
        System.out.println(ternario);

        // Operadores Logicos
        int x = 2;
        int y = 4;
        System.out.println("\nOPERADOR LOGICOS");
        if (x < y || y < x ) {

            System.out.printf("Verdade");
        }else {
            System.out.println("Falso");
        }


        if (x < y && y < x ) {

            System.out.printf("\nVerdade");
        }else {
            System.out.println("\nFalso");
        }


    }
}