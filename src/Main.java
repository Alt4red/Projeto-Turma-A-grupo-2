import com.sun.source.tree.SwitchTree;
import java.util.concurrent.TimeUnit ;

import java.util.Scanner;

public class Main {



        public static void count() throws InterruptedException {

            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
        }

        public static void main(String[] args) throws InterruptedException {


            System.out.println("Bem-vindo ao *****! ");
            count();

            String nome, menu;

            Scanner sc = new Scanner(System.in);

            System.out.printf("Você está para começar uma nova aventura conosco, este é o nosso jogo" +
                    " de RPG que vai te apresentar um novo mundo de aventuras e desafios e no final de tudo você ainda sai com um grande aprendizado! " +
                    "Espero que você goste e um boa jornada!\n\n");

            System.out.printf("//MENU DO JOGO\n 1-Jogar\n 2-Regras do jogo\n 3-Equipe\n 4-Sair\n\n");
            System.out.printf("Selecione qual opção do menu gostaria de acessar:\n");
            menu = sc.next();


            switch (menu) {
                case "1":
                    System.out.println("Começando o jogo...");
                    count();

                    System.out.printf("Olá! Tudo bem? Eu sou a sua supervisora e vou te acompanhar ao longo da sua jornada aqui na empresa, meu nome é Kaylaine," +
                            " mas prefiro que me chamem de Kaka e você como prefere ser chamado?\n\n");
                    nome = sc.next();

                    System.out.printf("Ok!!, a partir de agora irei te chamar de " + nome +"\n\n" );

                    System.out.printf(nome + "você quer saber mais sobre a empresa ou já quer começar a trabalhar?" +
                            " Posso te explicar um pouco mais sobre a empresa e o nosso objetivo caso seja do seu interesse.\n");

                    System.out.println("A- Me conte sobre a empresa.\n B- Quero começar a trabalhar.\n");
                    String y = sc.next();

                    switch (y){
                        case "A":
                            System.out.printf(nome + "agora que você já sabe como as coisas funcionam e qual o seu objetivo aqui dentro, está pronto para começar?\n" +
                                    "1. Sim.\n" +
                                    "2. Fazer o que né, dinheiro não dá em arvore.\n");


                            break;
                        case "B":
                            System.out.println("COMEÇANDO O JOGO");
                        default:
                            System.out.println("invalido");
                    }





                    break;
                case "2":
                    System.out.println("REGRAS DO JOGO");
                    break;
                case "3":
                    System.out.println("EQUIPE");
                    break;
                case "4":
                    System.out.println("Obrigado por jogar nosso rpg");
                    System.exit(0);
                    break;
                default:
                    System.out.println("A OPÇÃO SELECIONADA NÃO EXISTE");

            }


        }
    }


