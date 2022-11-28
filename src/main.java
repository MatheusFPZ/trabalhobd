import java.math.BigInteger;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);


        System.out.println("selecione o tipo de busca 1 para sequencia e 2 para btree");
        int opcao = ler.nextInt();



        System.out.println("digite o cpf a buscar");
        BigInteger cpf = ler2.nextBigInteger();

        if(opcao==2){

            long tempoInicial = System.currentTimeMillis();
            LerLinhasOpenCsv.arvore((cpf));
            long tempoFinal = System.currentTimeMillis() ;
            System.out.println("Tempo de busca: "+ (tempoFinal-tempoInicial)+ "ms");

        } else if (opcao==1) {
            long tempoInicial = System.currentTimeMillis();
            sequencial.BuscaSequencial(cpf);
            long tempoFinal = System.currentTimeMillis();
            System.out.println("Tempo de busca: "+ (tempoFinal-tempoInicial)+ "ms");

        }else{
            System.out.println("nao vai dar nao");
        }


    }
}
