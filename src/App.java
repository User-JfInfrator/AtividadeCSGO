import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int opcao = 0;
        String skins = "skins";
        String adesivos = "stickers";
        String collections = "collections";
        String caixas = "crates";
        String chaves = "keys";
        String collectibles = "collectibles";
        String agentes = "agents";
        String patches = "patches";
        String grafites = "graffiti";
        String kitDeMusica = "music_kits";
        ConsumirAPICSGO consumoapicsgo = new ConsumirAPICSGO();

        System.out.println("Bem vindo, este programa te mostra algumas coisas do CSGO, como skins, stickers, agentes, entre outros.");

        do {
            System.out.println("Escolha o que você deseja ver: ");
            System.out.println("1- Skins");
            System.out.println("2- Adesivos");
            System.out.println("3- Collections");
            System.out.println("4- Caixas");
            System.out.println("5- Chaves");
            System.out.println("6- Collectibles");
            System.out.println("7- Agentes");
            System.out.println("8- Patches");
            System.out.println("9- Grafites");
            System.out.println("10- Kit de músicas");
            opcao = sc.nextInt();

            if(opcao == 1){
                String skinsLista = consumoapicsgo.ConsumirAPICSGO(skins);
                System.out.println(skinsLista);

            }

            else if(opcao == 2){
                String adesivosLista = consumoapicsgo.ConsumirAPICSGO(adesivos);
                System.out.println(adesivosLista);

            }

            else if(opcao == 3){
                String collectionsLista = consumoapicsgo.ConsumirAPICSGO(collections);
                System.out.println(collectionsLista);

            }

            else if(opcao == 4){
                String caixasLista = consumoapicsgo.ConsumirAPICSGO(caixas);
                System.out.println(caixasLista);

            }

            else if(opcao == 5){
                String chavesLista = consumoapicsgo.ConsumirAPICSGO(chaves);
                System.out.println(chavesLista);

            }

            else if(opcao == 6){
                String collectiblesLista = consumoapicsgo.ConsumirAPICSGO(collectibles);
                System.out.println(collectiblesLista);

            }

            else if(opcao == 7){
                String agentesLista = consumoapicsgo.ConsumirAPICSGO(agentes);
                System.out.println(agentesLista);

            }

            else if(opcao == 8){
                String patchesLista = consumoapicsgo.ConsumirAPICSGO(patches);
                System.out.println(patchesLista);

            }

            else if(opcao == 9){
                String grafitesLista = consumoapicsgo.ConsumirAPICSGO(grafites);
                System.out.println(grafitesLista);

            }

            else if(opcao == 10){
                String kitMusicaLista = consumoapicsgo.ConsumirAPICSGO(kitDeMusica);
                System.out.println(kitMusicaLista);

            }

            else{
                System.out.println("Alternativa invalida");
            }
            
            
        } while (opcao != 0);

        System.out.println("Programa finalizado! ");

    }
}
