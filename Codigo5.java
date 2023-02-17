import java.util.Scanner; // le puse la importación faltante de Scanner

public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // luego el System.in lo pase al constructor de Scanner
        System.out.print("Introduzca un número: "); // tumbe el error de sintaxis con la comilla doble que falta al final
        String niStr = s.nextLine();
        int ni = Integer.parseInt(niStr); // converti el String a int usando Integer.parseInt

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10; // elimine la conversión innecesaria a int
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + niStr + " es un número afortunado."); // use el niStr en lugar de c para imprimir el número de entrada original
        } else {
            System.out.println("El " + niStr + " no es un número afortunado."); // al igual q arriba use el niStr en lugar de c para imprimir el número de entrada original
        }
    }
  // hasta el momento fueron los que encontre y no creo que tenga mas, pero si tiene estoy listo para ver en la retro.
}


