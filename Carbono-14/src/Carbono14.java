import java.util.Scanner;

public class Carbono14 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String descricaoArtefato;
        int tipoArtefato;
        double percentualCarbono14;
        String nomeDoTipoArtefato;
        String pesquisador = "";
        String periodo = "";

        System.out.println("Digite a descrição do artefato: ");
        descricaoArtefato = teclado.nextLine();

        System.out.println("Digite o tipo do artefato: ");
        tipoArtefato = teclado.nextInt();

        System.out.println("Digite o percentual de Carbono 14: ");
        percentualCarbono14 = teclado.nextDouble();

        if (percentualCarbono14 >= 1 && percentualCarbono14 < 10)
        {
            periodo = "Pré-história";
        } else if (percentualCarbono14 >= 10 && percentualCarbono14 < 25)
        {
            periodo = "Idade do Ferro";
        } else if (percentualCarbono14 >= 25 && percentualCarbono14 < 50)
        {
            periodo = "Idade do Bronze";
        } else if (percentualCarbono14 >= 50 && percentualCarbono14 < 100)
        {
            periodo = "Idade Média";
        } else if (percentualCarbono14 >= 100)
        {
            periodo = "Idade Moderna";
        }

        switch (tipoArtefato) {
            case 1:
                nomeDoTipoArtefato = "Arma ou tecnologia similar de metal";
                break;
            case 2:
                nomeDoTipoArtefato = "Ferramentas ou utensílios domésticos";
                break;
            case 3:
                nomeDoTipoArtefato = "Artefato desconhecido (Isu)";
                break;
            default:
                nomeDoTipoArtefato = "Tipo de artefato inválido";
                break;
        }
        
        if (periodo == "Idade Moderna") {
            switch (tipoArtefato) {
                case 1:
                    pesquisador = "Doutora Kassandra";
                    break;
                case 2:
                    pesquisador = "Doutor Edward";
                    break;
                case 3:
                    pesquisador = "Doutor Cesare Borgia";
                    break;
            } 
        } else if (periodo == "Idade Média") {
            switch (tipoArtefato) {
                case 1:
                    pesquisador = "Doutor Kenway";
                    break;
                case 2:
                    pesquisador = "Doutor Ézio";
                    break;
                case 3:
                    pesquisador = "Doutor Rodrigo";
                    break;
            } 
        } else if (periodo == "Idade do Bronze") {
            switch (tipoArtefato) {
                case 1:
                    pesquisador = "Doutor Alexios";
                    break;
                case 2:
                    pesquisador = "Doutor Altair";
                    break;
                case 3:
                    pesquisador = "Doutor Cormac";
                    break;
            } 
        } else if (periodo == "Idade do Ferro") {
            switch (tipoArtefato) {
                case 1:
                    pesquisador = "Doutor Alexios";
                    break;
                case 2:
                    pesquisador = "Doutora Eivor";
                    break;
                case 3:
                    pesquisador = "Doutor Berg";
                    break;
            } 
        } else if (periodo == "Pré-história") {
            switch (tipoArtefato) {
                case 1:
                    pesquisador = "Doutor Arno";
                    break;
                case 2:
                    pesquisador = "Doutora Elise";
                    break;
                case 3:
                    pesquisador = "Doutora Braddock";
                    break;
            }
        }
        
        System.out.println("Descrição do artefato: " + descricaoArtefato);
        System.out.println("Tipo do artefato: " + nomeDoTipoArtefato);
        System.out.println("Período histórico: " + periodo);
        System.out.println("Pesquisador responsável: " + pesquisador);

        teclado.close();
    }
}
