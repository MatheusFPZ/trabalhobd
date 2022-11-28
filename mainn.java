public class mainn {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("selecione o tipo de busca 1 para sequencia e 2 para btree");
        int opcao = ler.nextInt();

        if(opcao==2){

            long tempoInicial = System.currentTimeMillis();
            arvore();
            long tempoFinal = System.currentTimeMillis();
            System.out.println("tempo para execucao: "+ (tempoFinal-tempoInicial));

        } else if (opcao==1) {

        }else{
            System.out.println("nao vai dar nao");
        }


    }
}
