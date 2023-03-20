package EjercicioDCalculosNumericos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculosNumericos calculosNumericos = new CalculosNumericos();
        double[] res1 = calculosNumericos.calcularPuntoMedioRecta(-6,6,8,-7);
        System.out.println(res1[0] + ", "+  res1[1]);
        int res2 = calculosNumericos.ConvertirNumeroBaseDiezANumeroBaseB(2576, 9);
        System.out.println(res2);
    }
}
