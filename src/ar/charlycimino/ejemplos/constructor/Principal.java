package ar.charlycimino.ejemplos.constructor;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {

        CuentaBancaria cb = new CuentaBancaria("miAlias", "Pesos", "Caja de ahorros");

        cb.mostrarDatos();

    }

}
