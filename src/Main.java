import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {

    public static void count() throws InterruptedException {
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1L);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1L);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1L);
    }

    static int entrada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma opção:");
        int a = sc.nextInt();

        return a;
    }

    static String entradaString() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        String a = sc.next();

        return a;
    }

    public static void falaJogador(String a){

        System.out.printf(a);
        System.out.printf(":");
        entradaString();

    }
    public static double faseUm(String a) throws InterruptedException {
        double reputação = 0;
        int contadorR = 0;

        System.out.println("Olá, meu nome é Fabio Akita e eu sou CEO da Codeminer42, Hoje eu irei fazer sua entrevista");

        System.out.println("*Aperta a sua mão.*");

        System.out.println("\n" +
                "CEO: Pode sentar e ficar a vontade, tudo bem com voce " + a );
        falaJogador(a);

        System.out.println("CEO:" + a + " comece me contando um pouco sobre vc, qual é a sua experiência com programação?");
        falaJogador(a);

        System.out.println("CEO: Entendi...");

        System.out.println("CEO: E vc já trabalhou? Se sim, por favor me conte um pouco da sua experiência.\n");

        falaJogador(a);

        System.out.println("CEO: Interessante...\n");

        System.out.println("CEO: Agora me fale um pouco sobre vc e os seus objetivos profissionais, onde vc se vê daqui há alguns anos?\n");

        falaJogador(a);

        System.out.println("CEO:" + a + " ate agora tudo está correndo muito bem, te achei uma pessoa comunicativa e prestativo o que vai te ajudar muito na sua carreira ao que tudo indica vc tem um futuro promissor,  mas para ter certeza de que não estou errado tenho uma tarefa para vc vamos ver como vai se sair, vou te fazer algumas perguntas e se vc se sair bem está contratado.");

        System.out.println("CEO:  Eu te desejaria sorte, mas sorte é pra quem não treina! De o seu melhor!\n");

        count();

        System.out.println("Pergunta 1(Lógica):\n");
        System.out.println("Um economista deu a seguinte declaração em uma entrevista: “Se os juros bancários são altos, então a inflação é baixa”. Assinale a alternativa que contém uma proposição logicamente equivalente à do economista:");
        System.out.println("Escolha uma opção: ");
        System.out.println("A- Se a inflação não é baixa, então os juros bancários não são altos. ");
        System.out.println("B- Se os juros bancários não são altos, então a inflação não é baixa.");
        System.out.println("C- Se a inflação é alta, então os juros bancários são altos.");
        System.out.println("D- Os juros bancários são baixos e a inflação é baixa.");

        String respostaF1 = entradaString();

        if (respostaF1.equals("A") || respostaF1.equals("a")){
            contadorR++;

        }

        System.out.println("Pergunta 2(Lógica):\n");
        System.out.println("Sabe-se que as afirmativas \"Se a bola é azul, então o carro é branco\" e \"Ary  é inteligente ou Marcos é preguiçoso\" são falsas. Logo,");
        System.out.println("Escolha uma opção: ");
        System.out.println("A- a bola é azul, o carro não é branco, Ary é inteligente e Marcos não é preguiçoso. ");
        System.out.println("B- a bola é azul, o carro não é branco, Ary não é inteligente e Marcos não é preguiçoso.");
        System.out.println("C- a bola não é azul, o carro não é branco, Ary não é inteligente e Marcos não é preguiçoso.");
        System.out.println("D- a bola é azul, o carro é branco, Ary é inteligente e Marcos é preguiçoso.");

         respostaF1 = entradaString();

        if (respostaF1.equals("b") || respostaF1.equals("B")){
            contadorR++;

        }

        System.out.println("Pergunta 3(Lógica):\n");
        System.out.println("Considerando falsa a afirmação “Se Carlos é gerente, então Ana é diretora\", a afirmação necessariamente verdadeira é:");
        System.out.println("Escolha uma opção: ");
        System.out.println("A- Carlos é gerente. ");
        System.out.println("B- Carlos não é gerente ou Ana é diretora.");
        System.out.println("C- Ana é diretora.");
        System.out.println("D- Carlos não é gerente e Ana não é diretora,");

        respostaF1 = entradaString();

        if (respostaF1.equals("A") || respostaF1.equals("a")){
            contadorR++;

        }


        System.out.println("Pergunta 4(SQL):\n");
        System.out.println("Quanto aos conceitos relativos à arquitetura de dados, julgue o item a seguir.");
        System.out.println("A principal diferença entre bancos de dados relacionais e bancos de dados NoSQL está na questão da segurança dos dados e das transações; os bancos de dados NoSql são imunes a ataques de injeção SQL.");
        System.out.println("A- CERTO  ");
        System.out.println("B- ERRADO");

        respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }

        System.out.println("Pergunta 5(JAVA):\n");
        System.out.println("Analise as afirmações abaixo sobre valores de ponto flutuante em Java e assinale a alternativa correta.");
        System.out.println("I. Números de ponto flutuante não são adequados para cálculos financeiros em que erros de arredondamento não podem ser tolerados.");
        System.out.println("II. Uma expressão 0.0 / 0.0 gera uma exceção em tempo de execução.");
        System.out.println("III. Valores de ponto flutuante, como 0.5 e 4.6, são sempre considerados como do tipo double.");

        System.out.println("A- Todas estão corretas.");
        System.out.println("B- Todas estão incorretas.");
        System.out.println("C- Apenas I e II estão corretas.");
        System.out.println("D- Apenas I e III estão corretas.");
        System.out.println("E- Apenas II e III estão corretas.");


        respostaF1 = entradaString();

        if (respostaF1.equals("A") || respostaF1.equals("a")){
            contadorR++;

        }


        System.out.println("Pergunta 6(JAVA):\n");
        System.out.println("Analise as afirmações abaixo sobre valores de ponto flutuante em Java e assinale a alternativa correta.");

        System.out.println("A- +, ==, <> e %.");
        System.out.println("B- -, :=, != e /.");
        System.out.println("C-  , <=, ** e >.");
        System.out.println("D- /, !=, >= e. *");
        System.out.println("E- %, >=, ~= e +.");


        respostaF1 = entradaString();

        if (respostaF1.equals("d") || respostaF1.equals("D")){
            contadorR++;

        }

        System.out.println("Pergunta 7(JAVA):");
        System.out.println("Analise o código Java a seguir.");
        System.out.println("public class Codigo {        public static void main(String[] args) {                   String a = “Educar”;                   String b = “Ação”;                   b = geraStr(a, b);                   System.out.println(b);        }        public static String geraStr(String a, String b) {                   String s = “”;                  //s = a.concat(b.substring(1, 3));                  for (int i = 0; i <= a.length()-1; i++) {\n" +
                "                         char c = a.charAt(i);                          s += Character.toString(c);                    }                  return s.concat(b.substring(1, 4));          } }\n");

        System.out.println("A saída produzida pela execução desse código é:");
        System.out.println("A- Educação");
        System.out.println("B- Educarção");
        System.out.println("C- AçãoEducar");
        System.out.println("D- EducarAção");
        System.out.println("E- EducarçãEducarção");


        respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }

        System.out.println("Quantidade de acertos " + contadorR);


        double reputaçãoP = (contadorR*100) / 7;

        if (reputaçãoP >= 60.0){
            faseDois();
        } else {
            System.out.println("infelizmente voce foi reprovado da entrevista.");
        }


        return reputaçãoP;



    }


    public static void faseDois(){
        System.out.println("FASE 2");
    }


    public static void menu() {


        System.out.println("\n" +
                "                  ________            _______\n" +
                "         /\\ \\ \\ \\/_______/     ______/\\      \\  /\\ \\/ /\\ \\/ /\\  \\_____________\n" +
                "        /\\ \\ \\ \\/______ /     /\\    /:\\\\      \\ ::\\  /::\\  /::\\ /____  ____ __\n" +
                "       /\\ \\ \\ \\/_______/     /:\\\\  /:\\:\\\\______\\::/  \\::/  \\::///   / /   //\n" +
                "      /\\ \\ \\ \\/_______/    _/____\\/:\\:\\:/_____ / / /\\ \\/ /\\ \\///___/ /___//___\n" +
                "_____/___ \\ \\/_______/    /\\::::::\\\\:\\:/_____ / \\ /::\\  /::\\ /____  ____  ____\n" +
                "         \\ \\/_______/    /:\\\\::::::\\\\:/_____ /   \\\\::/  \\::///   / /   / /   /\n" +
                "          \\/_______/    /:\\:\\\\______\\/______/_____\\\\/ /\\ \\///___/ /___/ /_____\n" +
                "\\          \\______/    /:\\:\\:/_____:/\\      \\ ___ /  /::\\ /____  ____  _/\\::::\n" +
                "\\\\__________\\____/    /:\\:\\:/_____:/:\\\\      \\__ /_______/____/_/___/_ /  \\:::\n" +
                "//__________/___/   _/____:/_____:/:\\:\\\\______\\ /                     /\\  /\\::\n" +
                "///\\          \\/   /\\ .----.\\___:/:\\:\\:/_____ // \\                   /  \\/  \\:\n" +
                "///\\\\          \\  /::\\\\ \\_\\ \\\\_:/:\\:\\:/_____ //:\\ \\                 /\\  /\\  /\\\n" +
                "//:/\\\\          \\//\\::\\\\ \\ \\ \\\\/:\\:\\:/_____ //:::\\ \\               /  \\/  \\/+/\n" +
                "/:/:/\\\\_________/:\\/:::\\`----' \\\\:\\:/_____ //o:/\\:\\ \\_____________/\\  /\\  / /\n" +
                ":/:/://________//\\::/\\::\\_______\\\\:/_____ ///\\_\\ \\:\\/____________/  \\/  \\/+/\\\n" +
                "/:/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/_____ ///\\//\\\\/:/ _____  ____/\\  /\\  / /  \\\n" +
                ":/:///_/_/_/_//\\::/\\:\\///_/ /_//:/______/_/ :~\\/::/ /____/ /___/  \\/  \\/+/\\  /\n" +
                "/:///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\  / \\\\:\\/:/ _____  ____/\\  /\\  / /  \\/\n" +
                ":///_/_/_/_//\\::/\\:\\///_/ /_//:/____/\\:\\____\\\\::/ /____/ /___/  \\/  \\/+/\\  /\\\n" +
                "///_/_/_/_/:\\/::\\ \\:/__  __ /:/____/\\:\\/____/\\\\/____________/\\  /\\  / /  \\/  \\\n" +
                "//_/_/_/_//\\::/\\:\\///_/ /_//::::::/\\:\\/____/  /----/----/--/  \\/  \\/+/\\  /\\  /\n" +
                "/_/_/_/_/:\\/::\\ \\:/__  __ /\\:::::/\\:\\/____/ \\/____/____/__/\\  /\\  / /  \\/  \\/_\n" +
                "_/_/_/_//\\::/\\:\\///_/ /_//\\:\\::::\\:\\/____/ \\_____________/  \\/  \\/+/\\  /\\  /\n" +
                "/_/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\::::\\/____/   \\ _ _ _ _ _ /\\  /\\  / /  \\/  \\/___\n" +
                "_/_/_//\\::/\\:\\///_/ /_//\\:\\:\\:\\              \\_________/  \\/  \\/+/\\  /\\  /   /\n" +
                "/_/_/:\\/::\\ \\:/__  __ /\\:\\:\\:\\:\\______________\\       /\\  /\\  / /  \\/  \\/___/_\n" +
                "_/_//\\::/\\:\\///_/ /_//::\\:\\:\\:\\/______________/      /  \\/  \\/+/\\  /\\  /   /\n" +
                "/_/:\\/::\\ \\:/__  __ /::::\\:\\:\\/______________/\\     /\\  /\\  / /  \\/  \\/___/___\n" +
                "_//\\::/\\:\\///_/ /_//:\\::::\\:\\/______________/  \\   /  \\/  \\/+/\\  /\\  /   /   /\n" +
                "/:\\/::\\ \\:/__  __ /:\\:\\::::\\/______________/    \\ /\\  /\\  / /  \\/  \\/___/___/\n" +
                "/\\::/\\:\\///_/ /_//:\\:\\:\\                         \\  \\/\\\\\\/+/\\  /\\  /   /   /+/\n" +
                "\\/::\\ \\:/__  __ /:\\:\\:\\:\\_________________________\\ ///\\\\\\/  \\/  \\/___/___/ /_\n" +
                "::/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________////::\\\\\\  /\\  /   /   /+/\n" +
                "::\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:\\/____\\\\\\/  \\/___/___/ /___\n" +
                "/\\:\\///_/ /_//:\\:\\:\\:\\/_________________________/:::\\    /\\/\\  /   /   /+/   /\n" +
                "\\ \\:/__  __ /:\\:\\:\\:\\/_________________________/:::::\\  ///  \\/___/___/ /___/_\n" +
                ":\\///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::::\\///\\  /   /  __________\n" +
                "\\:/__  __ /:\\:\\:\\:\\/_________________________/:::\\:::::\\/  \\/___/__/\\\n" +
                "///_/ /_//:\\:\\:\\:\\/_________________________/:\\:::\\:::::\\  /   /  /::\\\n" +
                "/__  __ /\\::\\:\\:\\/_________________________/_____::\\:::::\\/___/__/:/\\:\\\n" +
                "/_/ /_//::\\::\\:\\/_____________________/\\/_/_/_/_/\\  \\           /::\\ \\:\\\n" +
                "_  __ /:\\::\\:8\\/_____________________/\\/\\   /\\_\\\\/\\  \\ 8       /:/\\:\\ \\:\\\n" +
                "/ /_//\\     \\|______________________//\\\\/\\::\\/__\\\\/\\  \\|______/::\\ \\:\\ \\:\\\n" +
                " __ /  \\  \\                        /:\\/:\\/\\_______\\/\\        /:/\\:\\ \\:\\/::\\\n" +
                "/_//    8      -8  --  --  --  -- //\\::/\\\\/_/_/_/_/_/ --  --/::\\ \\:\\ \\::/\\:\\\n" +
                "_ /     |\\  \\   |________________/:\\/::\\///__/ /__//_______/:/\\:\\ \\:\\/::\\ \\:\\\n" +
                "__________\\     \\               //\\::/\\:/___  ___ /       /::\\ \\:\\ \\::/\\:\\ \\:\\\n" +
                "::::::::::\\\\  \\  \\             /:\\/::\\///__/ /__//       /:/\\:\\ \\:\\/::\\ \\:\\ \\:");
        System.out.printf("//MENU DO JOGO\n 1-Jogar\n 2-Regras do jogo\n 3-Equipe\n 4-Sair\n\n");

    }


    public static void equipe() {

        System.out.printf("José Guilherme Cardoso de abreu");
        System.out.println("Kaylaine Lima Silva");
        System.out.println("Beatriz Alves da Silva");
        System.out.println("Fabricio de lima");


    }


    public static void main(String[] args) throws InterruptedException {

        menu();

        int escolhaMenu = 0;

        do {
            switch (escolhaMenu) {
                case 1:
                    System.out.printf("Olá! Tudo bem? Eu sou a secretaria e vou te apresentar a empresa, meu nome é Kaylaine, como prefere ser chamado?\n\n");
                    String nome = entradaString();

                    System.out.printf("Certo!!, a partir de agora irei te chamar de " + nome + "\n\n");

                    System.out.println("Agora vou te explicar sobre nossa empresa:");

                    System.out.println("A Codeminer42 é uma butique de desenvolvimento de software líder de mercado. Nós ajudamos empresas no Brasil e nos EUA, pequenas e grandes, a entregar o produto que seus usuários precisam, aproximando a prática do desenvolvimento de forma sem rodeios e orientada a qualidade.\n" +
                            "\n" +
                            "Recrutamos talentos por todo o país e os juntamos a nossos desenvolvedores sênior em um de nossos escritórios.\n" +
                            "\n" +
                            "Nós implementamos uma organização de baixo overhead onde cada desenvolvedor de software tende a administrar seu próprio trabalho, ajudando seus pares.\n" +
                            "\n" +
                            "Nossa especialidade é desenvolvimento web, particularmente Ru  by on Rails e tecnologias ao redor de Javascript. A maioria de nossos desenvolvedores se comunica em inglês, e nós estamos acostumados a integrar times existentes para nos ajudar a acelerar a entrega de produtos web já existentes.\n");

                    System.out.println("Agora que voce sabe mais sobre nossa empresa, vou   te encaminhar para a sua entrevista de emprego");
                    count();

                    faseUm(nome);



                    return;
                case 2:
                    System.out.println("Regras do jogo");
                    break;
                case 3:
                    equipe();
                    break;

            }




        escolhaMenu = entrada();
    } while(escolhaMenu !=4);


    }
    }
