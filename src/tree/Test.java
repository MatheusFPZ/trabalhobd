/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.math.BigInteger;

/**
 *
 * @author Administrador
 */
public class Test {
    /**
     * Unit tests the {@code BTree} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        BTree<BigInteger, String> st = new BTree<>();

        st.put(new BigInteger("01030471015"), "João");
        st.put(new BigInteger("91030471015"), "Maria");
        st.put(new BigInteger("81030471015"), "José");
        st.put(new BigInteger("71030471015"), "Sofia");
        

        System.out.println("");
        System.out.println("01030471015: " + st.get(new BigInteger("01030471015")));
        System.out.println("71030471015: " + st.get(new BigInteger("71030471015")));
        System.out.println();

        System.out.println("size:    " + st.size());
        System.out.println("height:  " + st.height());
        System.out.println(st);
        System.out.println();
    }
}
