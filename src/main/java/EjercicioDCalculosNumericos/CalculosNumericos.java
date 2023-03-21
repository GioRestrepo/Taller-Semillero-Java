package EjercicioDCalculosNumericos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculosNumericos {


    public static void calcularRaizCuadrada(double numero){
        try {
            if (numero >0){
                double resultado = Math.sqrt(numero);
                System.out.println(resultado);
            }

        }catch (ArithmeticException er){
            System.out.println("El número debe ser mayor a cero " + er);
        }

        /*Calcular la raíz cuadrada recibiendo un valor double como parámetro. Este método
        debe ser estático. Si el valor no es positivo se
        genera una excepción aritmética*/
    }

    public void calcularLaPendienteDeLaRecta(int x1, int x2, int y1, int y2){
       /*Calcular la pendiente de una recta*/

        int pendiente = (y2-y1)/(x2-x1);

    }


    public  double[] calcularPuntoMedioRecta(double x1, double x2, double y1, double y2){
        /*Calcular el punto medio de una recta*/
       double A =  (x1+x2)/2;
       double B =  (y1+y2)/2;
       double[] puntoMedio = {A,B};

       return puntoMedio;



    }

    public double[] calcularRaicesCuadradas(double a, double b, double c) {
        /*Calcular las raíces de una ecuación cuadrática*/
        double expresion = Math.pow(b, 2) - 4 * a * c;
        double[] raices = new double[2];
        if (expresion > 0) {
            double raiz1 = -b + Math.sqrt(expresion) / (2 * a);
            //-b + /b^2 - 4 *a*c
            double raiz2 = -b - Math.sqrt(expresion) / (2 * a);
            raices = new double[]{raiz1, raiz2};
            //return raices;
        }

        return raices;
    }
    public List<Integer> reverseList(List<Integer> list)
    {
        return IntStream.range(0, list.size())
                .map(i -> (list.size() - 1 - i))    // CorrienteInterna
                .mapToObj(list::get)                // Stream<T>
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public String convertirACadena (List<Integer> list){
        String str = "";

            str+= list+"";
            str = str.replaceAll("[^\\w+]", "");

        return str;
    }

    public int ConvertirNumeroBaseDiezANumeroBaseB (int numero, int base) {
        /*Convertir un número en base 10 a un número en base b*/

        int cociente = numero / base;  //286/9


        ArrayList<Integer> numeroBaseB = new ArrayList<>();
        numeroBaseB.add(numero % base);
        while (cociente > base) {

            int resto = numero % base;

            numero = cociente;
            cociente = numero / base;
            resto = numero % base;
            numeroBaseB.add(resto);


        }
        numeroBaseB.add(numero / base);

        List<Integer> reverse = reverseList(numeroBaseB);
        String cadena = convertirACadena(reverse);
        int numeroConvertido = Integer.parseInt(cadena);

        return numeroConvertido; //

    }
}
