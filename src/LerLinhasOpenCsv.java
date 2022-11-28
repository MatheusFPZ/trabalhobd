
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import tree.BTree;
import java.util.Scanner;

public class LerLinhasOpenCsv {



    public static void arvore(BigInteger cpf) {
        int cont=-1;

        Scanner ler = new Scanner(System.in);


        String csvArquivo = "/home/matheus/Documents/candidatos/consulta.csv";

        BufferedReader conteudoCSV = null;

        String linha = "";

        String csvSeparadorCampo = ";";
        try {
            conteudoCSV = new BufferedReader(new FileReader(csvArquivo));

            BTree<BigInteger, String> st = new BTree<>();
            boolean flag = false;
            while ((linha = conteudoCSV.readLine()) != null) {
                String[] teste = linha.split(csvSeparadorCampo);

                if (!flag) {
                    flag = true;
                    continue;
                }


                //PUT

                st.put(new BigInteger(teste[20].replaceAll("\"", "")), teste[17]);


            }


            //System.out.println(st);

            cont++;
            System.out.println(st.get((cpf)));
            System.out.println("numero de pesquisas:"+ cont);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LerLinhasOpenCsv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LerLinhasOpenCsv.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }








}
