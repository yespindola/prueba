/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

/**
 *
 * @author Yasser
 */
public class Fibonacci {

    public static void main(String[] args) {
        long f = 1;
        long r;
        long aux = 0;

        for (int i = 0; i <= 20; i++){
            r = aux + f;
            System.out.println(i + ": " + r);
            aux = f;
            f = r;
        }

    }

}
