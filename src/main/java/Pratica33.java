import utfpr.ct.dainf.if62c.pratica.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica33 {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        Matriz other = new Matriz(2, 3);
        double[][] m = orig.getMatriz();
        double[][] o = other.getMatriz();
        m[0][0] = 1;
        m[0][1] = 1;
        m[1][0] = 2;
        m[1][1] = 2;
        m[2][0] = 3;
        m[2][1] = 3; 
        o[0][0] = 1;
        o[0][1] = 2;
        o[0][2] = 3;
        o[1][0] = 1;
        o[1][1] = 2;
        o[1][2] = 3;
        Matriz soma = orig.soma(orig);
        Matriz prod = orig.prod(other);
        System.out.println(orig);
        System.out.println(other);
        System.out.println(soma);
        System.out.println(prod);
    }
    }