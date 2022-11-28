import java.io.*;
import java.math.BigInteger;


public class sequencial {


    public static void BuscaSequencial(BigInteger cpf) {

        int cont=-1;


            String path = "/home/matheus/Documents/candidatos/consulta.csv";
            String line= "";

            try {


                BufferedReader br = new BufferedReader(new FileReader(path));

                boolean flag = false;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";");


                    if (!flag) {
                        flag = true;
                        continue;
                    }

                    cont++;

                    if(values[20].replaceAll("\"", "").equals(cpf.toString())){

                    System.out.println("Nome: " + values[17]);
                    cont++;
                    break;


                } else {

                    continue;

                }

                }



                System.out.println("numero de pesquisas:"+ cont);
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        }


