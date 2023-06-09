package cat.formacio.lambda;

/**
 * FunctionalInterface -> Aquella funció que té només un i només un mètodes abstractes.
 *
 * Només té un mètode
 */
@FunctionalInterface
public interface Operacio {

    double calcular (double n1, double n2);

}
