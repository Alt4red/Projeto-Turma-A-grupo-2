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



        String []alternativas = new String[4];

        alternativas[0] = "A- Se a inflação não é baixa, então os juros bancários não são altos.";
        alternativas[1] = "B- Se os juros bancários não são altos, então a inflação não é baixa.";
        alternativas[2] = "C- Se a inflação é alta, então os juros bancários são altos.\"";
        alternativas[3] = "D- Os juros bancários são baixos e a inflação é baixa.\"";

        for (int i = 0; i < alternativas.length ; i++) {
            System.out.println(alternativas[i]);

        }


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

        System.out.println("CEO: Agora que terminou a entrevista peço que aguarde vamos mandar um email te comunicando se você passou ou não, se tiver passado, vamos te passar as informações necessárias.\n");
        System.out.println("Quantidade de acertos " + contadorR);


        double reputaçãoP = (contadorR*100) / 7;

        if (reputaçãoP >= 60.0){
            faseDois(a);
        } else {
            System.out.println("infelizmente voce foi reprovado da entrevista.");
        }



        return reputaçãoP;



    }

    public static void faseDois(String a) throws InterruptedException{

        int contadorR = 0;
        count();
        System.out.println("1 dia depois... \n");

        System.out.println("Codeminer42- Email  “ Prezado “N”(personagem escolhido).\n" +
                "Um dos momentos mais emocionantes e que todo RH gostaria de comunicar, é escolha e aprovação de um profissional (desenvolvedor júnior) para somar a nossa equipe. Então, queremos lhe dizer que você foi aprovado! Parabéns!!!\n" +
                "Entraremos em contato em breve para lhe fazer a carta oferta e para informar demais informações sobre como será o processo de contratação.\n" +
                "Qualquer dúvida, por favor, nos contate por e-mail.\n" +
                "Cordialmente,\n" +
                "Kaylaine”. \n");


        System.out.println("Kaylayne: Hoje é o seu primeiro dia como funcionário das empresas A Codeminer42, vamos te auxiliar nessa nova jornada e adaptação a nosso jeito de trabalho.\n ");
        System.out.println("Você irá usar um cartão de acesso para poder entrar na empresa e começar a trabalhar, precisa fazer o cadastro com o seu nome e uma senha de acesso no saguão, se estiver com algum problema é só informar a recepcionista que ela o ajudara. Alguma duvida?");


        System.out.println(a+ ":Por enquanto nenhuma .");

        System.out.println("Kaylayne: Você vai trabalhar do 12ºandar sala 23 junto com mais três funcionários, irei apresentá-los a você mais tarde. Logo ao entrar em seu andar tem uma sala de descanso, ao lado direito onde poderá tomar café e almoçar. Já te informarão sobre os horários?.”");

        System.out.println(a+ ":Me enviaram por Email, todas as informações.");

        System.out.println("Sua sala será esta, ao seu dispor tem o computador mesa com gavetas, canetas, papel etc. todos nossos funcionários que terão o que precisar para realizar um trabalho bem-feito.\n");
        System.out.println("Essa a sua direita é a patrícia, e a sua esquerda a jake, você irá trabalhar com elas nesse setor, e vão te ajudar caso precise. Amanhã vamos começar um novo projeto, hoje será só adaptação. \n");

        System.out.println("Bom já mostrei tudo, elas irão te auxiliar no restante, vejo você amanhã.");

        System.out.println("Jake – “Prazer n eu sou jake, também sou meio nova então não tenho como te ajudar em muita coisa”.");

        System.out.println("Patrícia - “Não se preocupe!! eu mesma te mostro tudo por aqui, e como funciona o dia a dia. O novo projeto vai começar amanhã, vou te mostrar um pouco sobre os projetos antigos para você ter uma noção de como fazer. E depois vamos dar uma conhecida no prédio para você conhecer os lugares.”\n");

        System.out.println("Patrícia – “Uma pergunta você já fez o cadastro no saguão, certo?”\n");

        System.out.println(a+ ":sim, nome e senha");

        System.out.println("Patrícia – “Pois então, esse acesso também serve para logar. no computador, se quiser pode testar agora, e já configurar ele do seu jeito.”");

        System.out.println(a+ "“Beleza, já irei fazer isso”.");

        System.out.println("Computador – “Carregando...”\n" +
                "Computador – “ *-* LOGIN *-* e *-* SENHA*-*”.\n");

        System.out.println(a+ ":“Boa agora só baixar os programas, essa empresa parece exigente, então tenho que dar o melhor de mim, para poder subir de cargo.”");

        System.out.println("Patrícia – “Agora que conseguiu configurar, bora conhecer esse lugar, aqui tem pessoas que vão te ajudar e outras que irão te atrapalhar, mas é só ficar esperto e cuidar do que é seu. No primeiro 1º e no 25º andar tem áreas de lazer onde você pode descansar e levar o escritório até lá hehe.”");

        System.out.println(a+ "“E nesse espaço de lazer tem café? ");
        System.out.println("Patrícia -“Tem sim, uma máquina da Nespresso”\n");

        System.out.println(a+ "\n" +
                "N – “Que maravilha, eu não funciono sem café “\n");


        System.out.println("Patrícia  -“Não tem muito o que mostra aqui, todos os andares são a mesma coisa, mas tem a garagem se tiver carro ou moto pode estacionar, tem o particular e o livre”\n");

        System.out.println(a+ "“Então é isso, acabou nosso tour?”\n");

        System.out.println("Patrícia – “Sim!!”");

        System.out.println("Patrícia – “Agora vou te ensinar a como fazer os projetos.”");

        System.out.println("Patrícia – bem, a gente tem dois projetos em andamento, são dois um para desenvolver uma calculadora.");

        System.out.println(a+ " – Interessante, como está o processo?\n");

        System.out.println("Entendo, e sobre o que é?");

        System.out.println("Patrícia – o primeiro e sobre cálculos e o segundo a pagina de login de um site .\n");

        System.out.println(a+ "Beleza, e a nossa equipe? Como vai ser o processo de desenvolvimento?\n");

        System.out.println("Patrícia - Bem, como somos poucos, dividimos as pesquisas e dps vamos juntar e desenvolver os ADs.\n");

        System.out.println(a + "e qual o nosso prazo?\n");

        System.out.println("Patrícia- ainda temos 15 dias para a entrega.\n");

        System.out.println(a+ "Temos pouco tempo então, vamos começar?\n");

        System.out.println("Patrícia- vamos sim, a Kaka vai te mostrar oq fazer, vou chamar ela.\n");

        System.out.println(a+ "claro, a patrícia já me apresentou os projetos, quero saber por onde começar?\n");

        System.out.println("KAKA – então, vou te colocar direto do desenvolvimento dos cauculos, vc vai receber a pesquisa feita pela patrícia e ajudar ela a desenvolver os resto do projeto, proporcionando um pouco do seu conhecimento.\n");

        System.out.println("KAKA – chegamos, patrícia jake e N vão ficar responsáveis pela Ads do site, se organizem e entreguem no prazo.\n");

        System.out.println("Patrícia - ta bom kaka.\n");

        System.out.println("Patrícia -então N, fiz minha pesquisa baseada no algoritmo da calculadora, com algumas ferramentas dela, poderíamos fazer aparecer o AD para pessoas q já estão precisando de ajuda e tbm contratar alguns influenciadores para divulgar nosso trabalho, oq vc acha?\n");

        System.out.println(a+ "Achei uma boa ideia, faz sentido. ");

        System.out.println(" Public static void main (string [] args){\n" +
                "Double a, b;\n" +
                "String operação;\n" +
                "Char operação;\n" +
                "Scanner entrada = new Scanner(system.in);\n" +
                "System.out.println(“<A> adição”);\n" +
                "System.out.println(“<S>  subtração”);\n" +
                "System.out.println(“<M>  multiplicação”);\n" +
                "System.out.println(“<D> Divisão”);\n" +
                "System.out.println(“escolha a opção desejada”);\n" +
                "operaçãoStr = entrada.next();\n" +
                "operação = operaçãoStr.charAt(0);\n" +
                "System.out.println(“1 operação”);\n" +
                "A = entrada.nextDouble();\n" +
                "System.out.println(“2 operação”);\n" +
                "B = entrada.nextDouble();\n" +
                "If(operação == ‘a’ || operação == ‘A’) {\n" +
                "System.out.println(“soma: ” + (a+b));\n" +
                "Else if (operação == ‘’s’ || operação == ‘S’) {\n" +
                "System.out.println(“diferença: ” + (a-b ));\n" +
                "Else if (operação == ‘m’ || operação == ‘M’) {\n" +
                "System.out.println(“Produto: “ + (a*b));\n" +
                "Else if (operação == ‘d’ || operação == ‘D’) {\n" +
                "System.out.println(“quoeficiente: “ + (a/b))\n" +
                "\n" +
                "Else {\n" +
                "System.out.println(“operação:” + operação + não é valida\n");

        System.out.println("A -Usando double a b; string operaçao; char operação; informe as alternativas e peça para escolher uma das opçoes e informe os valores que serão calculados, em seguida if e if/else para mostrar o resultado da operação escolhida e else se for invalida.");

        System.out.println("B -Usando double e char,  em seguida system.out.println para informar as opções, if/else seria para pegar os valores informados e mostrar o resultado");

       String respostaF2 = entradaString();

        if (respostaF2.equals("a") || respostaF2.equals("A")){
            contadorR++;

        }

        System.out.println("Patrícia – achei interessante vamos ver se no final dará certo.\n" +
                "\n" +
                "\n" +
                "Desenvolvimento – usando duas variaveis, menu, swith case.\n" +
                "Selecionar local – site \n" +
                "Entregar projeto para kaka.\n");


        System.out.println("KAKA – humm, parabéns gente, gostei muito dessa calculadora bem pratica, vamos enviar para o cliente para a aprovação dele, mas está muito bom, certeza q ele vai aprovar.");

        System.out.println("Patricia – okey, vamos desenvolvendo o outro projeto então, assim que terminarmos te entregamos ");

        System.out.println("KAKA – Combinado!");

        System.out.println(a+ ":então bora começar.");

        System.out.println("Patricia – calma precisamos tirar um tempinho vamos fazer uma pausa, depois de amanha começamos o próximo.");

        System.out.println(a+ "aah tabom, mas o quanto antes terminarmos melhor.");

        System.out.println("2 dias depois ....");

        System.out.println("Oi pati bom dia!!, vamos tomar um cafe e discutir sobre o trabalho lá,");

        System.out.println("Patrícia -  bom dia, vamos então.");

        System.out.println("Chegando no café...");
        System.out.println(a+ "Quanto seria o capuccino?");

        System.out.println("Atendente – R$10,00 medio \n");

        System.out.println(a+ "me ve um porfavor!");

        System.out.println(a+ "Pati já tem alguma ideia de onde vamos começar para desenvolver a pagina inical no site que no caso seria o login e senha.");

        System.out.println("Patricia – sim, mas quero saber qual é sua ideai de começo, vamos juntar para ver se bate.");

        System.out.println(a+ "ta, para poder fazer essa pagina de entrada vamos usar..");

        System.out.println("ALTERNATIVAS: ");
        System.out.println("A – Strings, scanner, boolean, do if, while, equalsignorecase \n" +
                "Public static void main(string [] args) {\n" +
                "String user = “patricia”;\n" +
                "String password = “1233”;\n" +
                "String login, senha;\n" +
                "Scanner ler= new Scanner(system.in);\n" +
                "Boolean tacerto = false;\n" +
                "Do {\n" +
                "System.out.println(“Login: ”);\n" +
                "Login = ler.next();\n" +
                "System.out.println(“Senha: );\n" +
                "Senha = ler.next();\n" +
                "If (login.equalsIgnorecase(user0&& senha.equals(password))\n" +
                "Tacerto= true;\n" +
                "}while (tacerto);\n" +
                "System.outprintln(“login e senha corretos!”)\n");


        System.out.println("B- " +
                "String, do/while, equalsignorecase.\n" +
                "Public static void main(string [] args) {\n" +
                "String user = “patricia”;\n" +
                "String password = “1233”;\n" +
                "String login, senha;\n" +
                "Scanner ler= new Scanner(system.in);\n" +
                "Do {\n" +
                "System.out.println(“Login: ”);\n" +
                "Login = ler.next();\n" +
                "System.out.println(“Senha: );\n" +
                "Senha = ler.next();\n" +
                "}while (!(login.equalsIgnorecase(user0&& senha.equals(password)))\n" +
                "\n" +
                "System.outprintln(“login e senha corretos!”)\n" +
                "}}\n");

        System.out.println("C- C -Do-while, scanner, strings\n");


        respostaF2 = entradaString();

        if (respostaF2.equals("a") || respostaF2.equals("A")){
            contadorR++;

        }

        System.out.println("Patrícia – “ usar (resposta escolhida) uma ótima ideia”\n");


        System.out.println("Patrícia – “ a minha ideia foi a mesma, também não é tao complicado de fazer”\n");

        System.out.println("Patrícia – “ bom base nisso, vou passar para nossa supervisora, para sabermos se esses dois projetos foram aprovados ");

        System.out.println("\n" +
                "KAKA –  vamos falar em particular ? por favor.\n");

        System.out.println(a+ "ok, mas sobre oq seria?\n");

       if (contadorR > 1){
           faseTres(a);
       }else {
           System.out.println("VOCE NAO FOI PROMOVIDO");
       }




    }

    public static double faseTres(String a) throws InterruptedException {

        double reputação = 0;
        int contadorR = 0;

        System.out.println("bom dia, preparado para esse novo desafio?");
        falaJogador(a);
        System.out.println("*Aperta a sua mão.*");

        System.out.println("muito bom ver você animado, vai indo pra sua mesa e Jajá vou lá te apresentar uns projetos. " );


        System.out.println("Indo....");


        System.out.println("chegando lá, N encontra todos seus colegas juntos..");

        System.out.println("Patrícia - bom dia " + a + ", bem e vc? Fiquei sabendo da sua promoção, parabéns");

        falaJogador(a);

        System.out.println("Richard - hum, o cara nem conheceu a equipe direito e já foi promovido, vc é oq sobrinho do dono?");
        falaJogador(a);

        System.out.println("Richard - eles tem seus favoritos mesmo, vamos ver como vc trabalha.");

        System.out.println("Patricia - para de ser chato Richard, e não o culpe por estar estagnado, isso é problema seu.");
        falaJogador(a);

        System.out.println("Patricia - que nada, ele só é um pouco chato mesmo, não dá bola.");
        falaJogador(a);

        System.out.println("KAKA - bom dia pessoal, vcs estão bem hj?");

        System.out.println("KAKA - então, como vcs já sabem o " + a + ", foi promovido a pleno, a partir de hj ele vai ficar encarregado de supervisionar o juniors.");

        System.out.println("KAKA - então toda a equipe de júniors agora responde a ele, ok?");

        System.out.println("Equipe - ok.");

        System.out.println("KAKA - qualquer problema que vocês tiverem é só pedir a ajuda dele e ele irá ajudar.");

        System.out.println(""+a+"vamos começar então, o que vcs tem aí?");

        count();

        System.out.println("Pergunta 1:");
        System.out.println(" Patrícia - estou criando um sistema de supermercado mas estou com um probleminha parte aqui olha.");
        System.out.println("public static void main(string[] artes) {\n" +
                "Scanner entrada = New Scanner(system.in);\n" +
                "Float fandangos, Cheetos, Doritos;\n" +
                "system.out.println(&quot;digite valor do fandangos: );\n" +
                "fandangos = entrada.nextFloat()\n" +
                "system.out.println(&quot; digite valor do Cheetos: );\n" +
                "Cheetos = entrada.nextFloat()\n" +
                "System.out.println(&quot;digite valor do Doritos: );");
        System.out.println("alternativas: ");
        System.out.println("A- erro de lógica, esse código não faz sentido. ");
        System.out.println("B- erro de sintaxe, falta alguns pontos e vingulas e umas letras maiúsculas. ");
        System.out.println("C- erro na escolha das ferramentas. ");

        String respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }

        System.out.println("Pergunta 2");
        System.out.println("Richard - preciso somar alguns vetores e encontrar o menor e o maior.");
        System.out.println("int soma = 0;\n" +
                "int menor = v [0];\n" +
                "int maior = v [0];\n" +
                "for (int i = 0; i &lt; n; i++) {\n" +
                "soma + v [i];\n" +
                "If (v[i] &lt; menor)\n" +
                "Menor = v[i];\n" +
                "If(v[i] &gt; maior)\n" +
                "maior = v[i];\n" +
                "}");
        System.out.println("Alternativas: ");
        System.out.println("A- erro de logica. ");
        System.out.println("B- erro na escolha das ferramentas.");
        System.out.println("C- erro de sintaxe.");

        respostaF1 = entradaString();

        if (respostaF1.equals("A") || respostaF1.equals("a")){
            contadorR++;

        }

        System.out.println("Pergunta 3");
        System.out.println("Patrica - estou tentando criar uma estrutura de repetição mas as repetições estão dando erro.");
        System.out.println("int i = 0, soma = 0, x;\n" +
                "Scanner sc = new Scanner(System.in);\n" +
                "While(i &lt;10){\n" +
                "System.out.println(&quot;digite um item: &quot; + i);\n" +
                "X = sc.nextInt();\n" +
                "If(x &lt; 0){\n" +
                "}\n" +
                "Soma = soma + x;\n" +
                "i = i + 1;\n" +
                "}");
        System.out.println("Alternativas: ");
        System.out.println("A- erro de funções, if não faz sentido nesse código ");
        System.out.println("B- erro de logica, falta um default.");
        System.out.println("C- erro de sintaxe, falta pontos e chaves.");

        respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }


        System.out.println("Pergunta 4");
        System.out.println("Jake- N, tbm preciso de ajuda, to desenvolvendo uma prova online, porem não sei ao certo qual a melhor logica a se usar.");
        System.out.println("Alternativas");
        System.out.println("A- use o for com if else. ");
        System.out.println("B- use o if else com do-while.");
        System.out.println("c- use o Do xom switch case e while.");

        respostaF1 = entradaString();

        if (respostaF1.equals("C") || respostaF1.equals("c")){
            contadorR++;

        }

        System.out.println("Pergunta 5");
        System.out.println("Richard- mais uma coisa, preciso criar um login q bloquei o usuario dps de 3 tentativas, como faço?");
        System.out.println("Alternativas");

        System.out.println("A- vetores e switch case.");
        System.out.println("B- for e if else.");
        System.out.println("C- while e if else.");



        respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }


        System.out.println("Pergunta 6");
        System.out.println("jake-" + a +", preciso criar o menu de um jogo, quais as melhores ferramentas para usar?");
        System.out.println("Alternativas");
        System.out.println("A- for com if else e while.");
        System.out.println("B- só switch case.");
        System.out.println("C-  do com switch case e while. Correta.");


        respostaF1 = entradaString();

        if (respostaF1.equals("C") || respostaF1.equals("c")){
            contadorR++;

        }

        System.out.println("Pergunta 7(JAVA):");
        System.out.println("Patrícia- " + a + ", como faço para contar quantas letras tem uma palavra no código?");
        System.out.println("Alternativas");
        System.out.println("A- ultilize o for.");
        System.out.println("B-ultilize o length.");
        System.out.println("C-ultilize vetores.");


        respostaF1 = entradaString();

        if (respostaF1.equals("B") || respostaF1.equals("b")){
            contadorR++;

        }

        System.out.println("Quantidade de acertos " + contadorR);


        double reputaçãoP = (contadorR*100) / 7;

        if (reputaçãoP >= 60.0){
            faseQuatro(a);
        } else {
            System.out.println("KAKA - " + a+ " Infelizmente você não atingiu as nossas expectativas e vamos desligar você da empresa hoje, "
                    + "boa sorte na sua jornada e obrigada pelos serviços ");
        }



        return reputaçãoP;



    }

    public static void faseQuatro(String a) throws InterruptedException {

        //Mensagem para o jogador//
        //Diálogo da secretária (kailayne) ao jogador//
        System.out.println("Kailayne: Olá, jogador!");
        System.out.println("Nesta fase, seu desafio será gerenciar um novo projeto, em que a Codeminer42 está inserida.");
        System.out.println("Você deverá utilizar a metodologia scrum.");

        System.out.println("*********************************************************************************************************************************************************************************************************************************");

        System.out.println("Kailayne: Irei te explicar brevemente como funciona a metologia Scrum, que irá "
                + "utilizar durante o projeto.");

        System.out.println("****************************************************************************************************************************************************************************************************************************************");

        System.out.println("Kailayne: A metodologia Scrum, consiste em designar pessoas para atividades que correspondam a uma parte "
                + "do projeto e a sua posição dentro do ambiente corporativo.");
        System.out.println("Estipulando prazos para que estas atividades "
                + "sejam desenvolvidas e entregues. ");
        System.out.println("Essa metodologia permite que os colaboradores possam utilizar de sua");
        System.out.println("criatividade, potencializar o trabalho em equipe e acompanhar a evolução do produto com foco na qualidade, "
                + "e na produção nos prazos pré-definidos");
        //Fim da mensagem de Kailayne//

        System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
        //Mensagem da secretária (Kailayne)//
        System.out.println("Kailayne: A partir de agora darei alternativas "
                + "para que você possa escolher qual atitude tomar mediante ao contexto que será apresentado ");
        System.out.println("Você deverá escolher corretamente o que deve ser feito ");
        System.out.println("para poder dar andamento ao projeto. Caso escolha diversas alternativas incorretas, "
                + "o projeto falhará e perderemos o projeto.");

        System.out.println("********************************************************************************************************************************************************************************************************");

        System.out.println("Kailayne: Neste momento você deverá designar corretamente o que cada um "
                + "da equipe deverá fazer e estipular o tempo correto para cada um.");
        System.out.println("*****************************************************************************************************************************************************************************************");

        System.out.println("Kailayne: Ítalo, 19 anos, desenvolvedor júnior, "
                + "acabou de sair da faculdade e está buscando uma oportunidade "
                + "para se desenvolver. ");
        System.out.println("Matheus, 26 anos, desenvolvedor pleno. Tem 3 anos de experiência, "
                + "e poderá te ajudar com alguns desafios medianos dentro do projeto. ");
        System.out.println("Jenifer, 34 anos, desenvolvedora sênior, "
                + "poderá te ajudar com desafios maiores e com a administração do projeto. ");
        //Fim do dialogo com a Secretária(Kailayne)

        System.out.println("******************************************************************************************************************************************************************************************************");

        //Atividade 1 - DESIGNANDO ATIVIDADES PARA CADA UM DA EQUIPE//

        System.out.println("Escolha a atividade e o tempo que o DEV júnior, ítalo, irá realizar.");

        System.out.println("Alternativa 1: Dev júnior fará uma calculadora. Em 1 mês.");
        System.out.println("Alternativa 2: Dev júnior fará uma interface gráfica. Em 3 meses.");
        System.out.println("Alternativa 3: Dev júnior fará uma API de integração em 5 meses.");
        System.out.println("************************************************************************************************************************************************************");
        //Declaração das variáveis
        int resposta = entrada();
        int respostacorreta = 1;
        //Condicionais//
        if(resposta == 1){

            System.out.println("Resposta correta!");
        }else{
            System.out.println("Resposta incorreta!");
            System.exit(resposta);
        }
        System.out.println("************************************************************************************************************************************************************************");

        System.out.println("Kailayne: Boa! você acertou, vamos para a próxima atividade!");

        System.out.println("*************************************************************************************************************************************************************************");

        //Atividade 2 - DESIGNANDO ATIVIDADES PARA CADA UM DA EQUIPE//
        System.out.println("Escolha a atividade de o DEV pleno, matheus, irá desempenhar e tempo.");

        System.out.println("Alternativa 1: Dev pleno fará a interface do login e senha "
                + "do projeto. Em 2 semanas.");

        System.out.println("Alternativa 2: Dev pleno irá revisar os códigos "
                + "do dev júnior e desenvolverá uma interface gráfica. Em 3 meses ");
        System.out.println("para o projeto.");

        System.out.println("Alternativa 3: Dev pleno fará a será lider e responsavel pela organização "
                + "e apresentação dos sprints do projeto. Em todo o período do projeto. ");

        //Condicionais//

        int resposta2 = entrada();//Variável
        int respostacorreta2 = 2; //Variável

        if(resposta2 == 2){

            System.out.println("Alternativa correta!");

        }else{

            System.out.println("Você errou! não vai dar pra continuar.");
            System.exit(resposta2);
        }//Fim da Condicional//

        System.out.println("Kailayne: Você está indo muito bem até aqui, "
                + "vamos para próxima tomada de decisão!");
        System.out.println("********************************************************************************************************************************************************************************************************");

        //Atividade 3 - DESIGNANDO ATIVIDADES PARA CADA UM DA EQUIPE//

        System.out.println("Escolha a atividade que a Dev sênior, jenifer, terá e o tempo para desempenhar.");

        System.out.println("*************************************************************************************************************************************************************");

        System.out.println("Alternativa 1: Comunicação com o cliente e monitoramento do projeto. ");
        System.out.println("Visando pontos importantes do código e melhores saídas. Durante o começo do projeto.");
        System.out.println("Alternativa 2: Comunicação com o cliente, monitoramento do projeto, ");
        System.out.println("organização e liderança dos Sprints semanais. Durante todo o projeto.");
        System.out.println("Alternativa 3: Revisar os códigos de dev júnior e corrigir erros. Durante o meio do projeto.");

        //Variáveis//

        int resposta3 = entrada();;
        int respostacorreta3 = 2;

        //Condicionais//

        if(resposta3 == 2){

            System.out.println("Parabéns, você acertou!");
        }else{

            System.out.println("Errado! não vai dar para continuar");
            System.exit(resposta3);
        }

        faseCinco(a);

    }

    public static void faseCinco(String a) throws InterruptedException{
// Declarei minhas váriaveis que vão guardar e operar os pontos do jogador.
        double reputação = 0;
        int contadorR = 0;

        System.out.printf("Fase 5 - Função CEO\n");
        System.out.printf("CEO Fabio Akita: Parabéns %s! Eu soube assim que fez a entrevista que você era capaz de chegar até aqui,\nde todos os que passaram na entrevista anteriormente vc foi o(a) único(a) que chegou tão longe.\n", a);
        System.out.printf("\nJá faz um tempo que estou procurando alguém competente e jovem para me substituir, infelizmente há um tempo\neu descobri que estou doente e por precisar fazer alguns tratamentos eu não posso mais exercer a função de CEO,\npor ser novo e não ter filhos e nenhum parente apto o suficiente para o cargo não tive opção se não colocar\no futuro da minha empresa na mão de um estranho, por isso comecei a fazer eu mesmo as entrevistas e coloquei alguns\nobjetivos a serem cumpridos ao longo do caminho, então a pessoa que conseguisse passar por todas as\netapas se tornaria CEO.");
        System.out.printf("\nTe desejo parabéns %s e uma ótima jornada! Agora vc é o(a) novo(a) CEO da CDEMINER.\n", a);
        count();

        // Loop de respostas para o caso do jogador responder com uma opção inválida.
        // Declarando uma váriavel para parar o loop quando necessário.
        int x = 1;

        do{

            System.out.printf("\n*Escolha uma das respostas*");
            System.out.printf("\n1.	Obrigada! Eu sabia desde o inicio que me esforçar iria valer a pena.");
            System.out.printf("\n2.	Obrigada!");
            System.out.printf("\n3.	*Ficar sem palavras*");
            System.out.printf("\n4.	É obvio que eu consegui afinal eu sou ótimo(a) no que faço. ");
            int r1 = entrada();

            switch(r1){
                case 1:
                    System.out.printf("CEO Fabio Akita: Fico muito feliz de saber disso não esperava nada diferente de você,\né como o meu avô sempre me dizia 'Faça o que precisa ser feito, não que te pediram para fazer'.\n");
                    x++;
                    break;
                case 2:
                    System.out.printf("CEO Fabio Akita: Confesso que esperava uma resposta um pouquinho diferente, quem sabe um pouco mais de entusiasmo e até mesmo algumas dúvidas rs.\n");
                    x++;
                    break;
                case 3:
                    System.out.printf("CEO Fabio Akita: Não se preocupe é normal ficar meio apreensivo no inicio afinal de contas é uma grande responsabilidade,\nmas acredite quando eu digo que não confiaria a minha empresa a Qualquer um.\n");
                    x++;
                    break;
                case 4:
                    System.out.printf("CEO Fabio Akita: É sempre ótimo ser uma pessoa confiante principalmente quando se exerce uma grande função e\ntem grandes responsabilidades, mas ser CEO significa ser um líder e ser arrogante não faz parte das características de\num líder, no fim das contas parece que eu fiz a escolha certa ao decidir te acompanhar nessas primeiras semanas.\n");
                    x++;
                    break;
                default:
                    x=0;
                    System.out.printf("*Opção inválida.*\n");
            }


        }while(x <= 0);

        System.out.printf("\nCEO Fabio Akita: %s antes de deixar a empresa completamente nas suas mãos vou te acompanhar durante essas primeiras\nsemanas para te colocar a par dos projetos em andamento e te passar as principais função de um CEO.\nPara começarmos vou te adiantar algumas coisas sobre o seu cargo e as suas funções aqui dentro,\ndepois irei te levar para conhecer a sua nova sala.\n", a);
        System.out.printf("As  sua obrigações vão mudar aqui dentro, apesar de ainda continuar fazendo o que fazia antes\nsua carga horária ira aumentar assim como o seu salário e as suas funções, você participara de\nreuniões com acionistas e investidores onde a sua maior obrigação será discutir projetos e dar o seu aval para os que\njulgar aptos, assim como também decidira o que será necessário mudar e ou negar para os que não achar bom o\nsuficiente para prosseguir. Você também ira delegar tarefas e precisará ser um bom líder para todos.\n");
        System.out.printf("\nAgora vamos para o nosso tour pela sua nova sala. Gostaria de perguntar algo antes?");
        count();

        // 2° Loop de resposta para o caso do jogador responder com uma opção inválida.

        do{

            System.out.printf("\n*Escolha uma das respostas*");
            System.out.printf("\n1.	Não, estou ansioso para conhecer o meu novo local de trabalho!");
            System.out.printf("\n2.	Sim, gostaria de saber sobre a mudança salarial e sobre a carga de horária.");
            System.out.printf("\n3.	Sim, ainda estou meio confuso(a) sobre como tudo aconteceu, rsrs.");
            System.out.printf("\n4.	Sim, estou curioso sobre a sua doença.\n");
            int r2 = entrada();

            switch(r2){
                case 1:
                    System.out.printf("CEO Fabio Akita: Ta ok, então não vamos perder mais tempo.\n");
                    count();
                    x++;
                    break;
                case 2:
                    System.out.printf("CEO Fabio Akita: Confesso que esperava uma resposta um pouquinho diferente, quem sabe um pouco mais de entusiasmo e até mesmo algumas dúvidas rs.\n");
                    count();
                    x++;
                    break;
                case 3:
                    System.out.printf("CEO Fabio Akita: Não se preocupe é normal ficar meio apreensivo no inicio afinal de contas é uma grande responsabilidade,\nmas acredite quando eu digo que não confiaria a minha empresa a Qualquer um.\n");
                    count();
                    x++;
                    break;
                case 4:
                    System.out.printf("CEO Fabio Akita: É sempre ótimo ser uma pessoa confiante principalmente quando se exerce uma grande função e\ntem grandes responsabilidades, mas ser CEO significa ser um líder e ser arrogante não faz parte das características de\num líder, no fim das contas parece que eu fiz a escolha certa ao decidir te acompanhar nessas primeiras semanas.\n");
                    count();
                    x++;
                    break;
                default:
                    x=0;
                    System.out.printf("Opção inválida.*\n");
            }

        }while(x <= 0);

        System.out.printf("\n*Vocês caminham até o elevador privativo que é designado apenas para o CEO da empresa e o atual CEO insere uma\nchavinha no local aonde deveria ter um botão, instantaneamente as portas do elevar se abrem e ele entra e vc\no acompanha vcs se viram ficando de frente para a porta e vê ele apertar o botão do vigésimo quinto andar.\nAs portas do elevador se abrem e vcs saem direto para um hall de entrada com um sofá e dois puffs na cor creme\na uma mesa de centro na frente do sofá e uma porta dupla enorme no meio da parede de frente pro elevador, no canto oposto ao sofá há\numa mesa e nela há uma mulher que vc reconhece como sendo a Kaká a supervisora que te ajudou durante toda a sua jornada,\nassim que a mulher avista vcs ela se levanta e abre um grande sorriso.*\n");
        count();
        System.out.printf("\nCEO Fabio Akita: Bom dia Kaka!\n");
        System.out.printf("Kaka: Bom dia Fabio!\n");
        System.out.printf("Bom dia %s! Vejo que já descobriu as novas mudanças, meus parabéns!\n", a);
        System.out.printf("*Resposta interativa*\n");
        falaJogador(a);

        System.out.printf("\nCEO Fabio Akita: Bom, como não precisam de apresentação vamos continuar.\n");
        System.out.printf("A Kaka é a minha secretária e uma das pessoas em quem eu mais confio aqui na empresa, ela ira continuar\nte orientando e ajudando sempre que necessário, porém agora ela também será a sua secretaria particular\ne te acompanhará em tudo o que for necessário. Vamos entrar.\n");
        count();
        System.out.printf("\n*Vocês entram na sala e de cara vc é recepcionado(a) pela vista maravilhosa da cidade já que a parede lateral da sala é feita inteiramente\nde vidro do chão ao teto, a sala é composta por diferentes tons de cinza e branco, a sua frente há uma enorme mesa de vidro e ao seu lado\ndireito um sofá branco com uma mesa de centro, há também uma porta na parede direita da sala e uma mesa retangular atrás do sofá,\nprovavelmente uma mesa para reuniões, vcs caminhão mais para dentro da sala e vc avista um frigobar no canto direito da sala perto do\nsofá onde há também um balcão com uma maquina de café e alguns utensílios, a sala é enorme e ocupa praticamente todo o andar.*\n");
        
                System.out.printf("\nCEO Fabio Akita: Agora é com você %s, vou deixar você ir se acostumando com a sala e com sua nova função.\n", a);
    count();

    System.out.printf("\n*Alguns minutos depois.*\n");
    System.out.printf("\nKaka: %s aqui esta você. Sua agenda para essa tarde está cheia, você tem duas reuniões importantes e uma tarefa pra completar, falta menos de 10m para a sua primeira reunião, vc está pronta?\n", a);

    // 3 loop de resposta para o caso do jogador responder com uma opção inválida.
    do{
        
        System.out.printf("\n*Escolha uma das respostas*");
        System.out.printf("\n1.	Sim.\n");
        System.out.printf("\n2.	Não.\n");
        int r3 = entrada();
        
        switch(r3){
            case 1:
                System.out.printf("Kaka: Bom, a sala de reunião já está pronta vamos indo.\n");
                count();
                x++;
            break;
            case 2:
                System.out.printf("Kaka: Então se prepare porque a sala já está pronta e alguns acionistas já começaram a chegar.\n");
                count();
                x++;
            break;
            default:
                x=0;
                System.out.printf("Opção inválida.*\n");
        }

    }while(x <= 0);

    System.out.printf("*Vocês foram para a sala de reuniões e a caminho de lá você foi informado que na ultima reunião havia sido pedido um novo projeto principal\nque fosse desenvolvido utilizando a Administração Clássica como base,  chegando na sala foi encaminhado para o acento da cabeceira da mesa cumprimentou os\nque se encontravam na sala e esperou pelos próximos, assim que eles chegaram você se apresentou para eles e em seguida um deles\ncomeçou a apresentar o novo projeto para ser decidido qual seria a nova campanha principal da empresa, todos assistiram atentamente\nas apresentações e no final de tudo todos se voltaram para você esperando a sua decisão.*\n");
    

    do{
        contadorR++;
        System.out.printf("\n*Escolha entre o 1 e o 2 projeto, o que usa como base de criação a Administração clássica.*\n");
        System.out.printf("\n*Projeto A- A primeira proposta apresentada foi um novo sistema de acesso que armazena e abre arquivos com subniveis de acesso de acordo com\na sua posição, então quanto mais alto o cargo mais amplo o seu acesso aos arquivos do programa e o nível\nmais baixo teria acesso somente aos seus próprios arquivos importados. Esse projeto seria um projeto eficiente e produzido com\no foco na qualidade do produto com metas a serem cumpridas que quando alcançadas por seus respectivos funcionários esses ganhariam recompensas e incentivos*\n");

        System.out.printf("\n*Projeto B - A segunda proposta apresentada foi um novo sistema para armazenar dados de cadastros de clientes uma vez que o cliente fosse a loja e fizesse o\ncadastro seus dados ficariam guardados e seriam puxados somente com o RG ou algum dado pessoal fornecido pelo cliente o grande diferencial\ndesse sistema seria que o cliente teria acesso a um app da loja para poder estar atualizando os seus dados cadastrais sempre que necessário.\nEsse projeto seria um projeto eficaz produzido com o foco na quantidade do produto e de sua entrega com prazo para ser\ncumprido em cada etapa de desenvolvimento, foi um projeto desenvolvido com o tempo de serviço calculado e estimado para cada trabalhador.*\n");
        count();

        System.out.printf("\n1 - Projeto A\n2 - Projeto B.\n");
        int r4 = entrada();

        switch(r4){
            case 1:
                reputação++;
                x++;
            break;
            case 2:
                reputação = 0;
                x++;
            break;
            default:
                x=0;
                System.out.printf("Opção inválida.*\n");
        }

    }while(x <= 0);

    System.out.printf("\n*Ao termino da reunião você se manteve no seu lugar porque você ainda participaria de mais uma reunião em menos de 15m.*\n");
    System.out.printf("\n*O cliente chegou na sala de reunião e você se levantou e o cumprimento em seguidas vocês se sentaram, trocaram\nalgumas trivialidades e começaram  falar de negócios, ele te passou o que precisava para a sua empresa*\n");
    System.out.printf("\nCliente: Preciso de um sistema de segurança para todos os meus projetos. Vou precisar de um sistema de login com senha encriptada para todos os sistemas que usamos na\nminha empresa e por serem sistemas próprios quero que o sistema de login seja criado com base no nosso sistema e por isso pode acabar sendo um pouco\nmais complicado, mas estou disposto a pagar o necessário, porém preciso do projeto o quanto antes, coloque os melhores que você\ntiver para trabalhar nesse projeto e me entregue assim que possível, sei que vocês não iram me decepcionar.\n");
    count();
    
    do{
        contadorR++;
        System.out.printf("\n*Escolha a melhor maneira de prosseguir com o projeto do seu cliente de acordo com o que ele pediu.*\n");
        System.out.printf("\n*Opção A - Colocar a equipe para trabalhar com prazos definidos para o processo de criação e desenvolvimento,\nbuscando assim um trabalho mais eficiente e com resultados mais rápidos o possível.* \n");

        System.out.printf("\n*Opção B - Colocar a equipe para trabalhar sem determinar os prazos e duração de trabalho em cada etapa,\nbuscando um trabalho mais eficaz com recompensas pelo trabalho feito e pelo esforço da equipe.*\n");
        count();
        System.out.printf("\n1 - Opção A.\n2 - Opção B.\n");
        int r5 = entrada();

        if(r5 == 1){
            x++;
            reputação++;
        } else if (r5 == 2){
            x++;
            reputação = reputação;
        } else{
            System.out.printf("\nOpção Inválida.\n");
            x = 0;
        }

    } while(x <= 0);

    System.out.printf("\n*Assim que você saiu da sala de reunião você se encaminhou para a sua sala já exausto(a) e\no dia mau havia começado, antes de almoçar você ainda tinha um assunto para resolver e\nassim que chegou na sua sala você encontrou o CEO Fabio Akita a sua espera.*\n");
    System.out.printf("\nCEO Fabio Akita: Soube que suas duas primeira reuniões foram um sucesso, agora falta muito pouco para\nvocê assumir o meu lugar por completo e para que isso aconteça eu só preciso que você me responda mais\numa pergunta, e essa pergunta irá determinar se você é a pessoa certa para ocupar o cargo de CEO dessa empresa.\n");
    System.out.printf("\nCEO Fabio Akita: Analisando a estrutura da empresa e por já ter passado por vários cargos diferentes e\nter lidado com distintos tipos de situações aqui dentro acredito que você saberá me responder.\n");
    count();

    System.out.printf("\n*Escolha a alternativa correta para a pergunta feita pelo CEO Fabio Akita, você tem apenas uma tentativa.*\n");
    System.out.printf("\n*As teorias da administração desenvolvidas por estudiosos americanos tiveram um papel decisivo na economia\nmundial, estabelecendo métodos mais sofisticados para a produção e extinguindo práticas rudimentares baseadas\nem meras tradições, além é claro de automatizar as empresas e os seus processos tornando-as cada vez mais\nqualificadas e preparadas para proporcionar um ótimo ambiente de trabalho para os seus funcionários visando assim\na longo prazo um bom desempenho profissional.*\n");

    do{
        contadorR++;

        System.out.printf("\nCEO Fabio Akita: Qual método de Administração usamos atualmente na empresa e porque?\n");
        count();

        System.out.printf("\nI. Administração clássica - que se caracteriza pela ênfase na estrutura da organização, na busca pela eficiência\nhá análise das tarefas de cada indivíduo cedeu lugar a uma visão global e universal da organização, a\nqual partia da estruturação, organização como um todo e chegava, finalmente, ao indivíduo.");
        System.out.printf("\nII. A teoria da burocracia - Incentivava a impessoalidade nas relações e a padronização dos procedimentos.");
        System.out.printf("\nIII. Administração cientifica - A teoria da administração científica previa um modelo administrativo com aspectos\nmais orgânicos, valorizando e incentivando a autonomia decisória de cada colaborador com o\nobjetivo de aumentar a produção dentro das organizações e aprimorar a eficiência dos trabalhadores.");
        System.out.printf("\nIV. A teoria comportamental - Baseava seus métodos no estudo de tempos e movimentos de cada atividade.\n");

        System.out.printf("\n*Está correto o que se afirma em:*\n");

        System.out.printf("1 - I, Apenas.\n");
        System.out.printf("2 - Todas.\n");
        System.out.printf("3 - IV, Apenas.\n");
        System.out.printf("4 - I e III, Apenas.\n");
        int r6 = entrada();

        //Vou guardar as respostas em um array
        int [] vetor = new int [4];
        vetor [0]= 1;
        vetor [1]= 2;
        vetor [2]= 3;
        vetor [3]= 4;

        if ((r6 != 1) & (r6 != 2) & (r6 != 3) & (r6 != 4)){
            System.out.printf("Opção Inválida!");
            x=0;
        }

        for (int i =0; i<vetor.length; i++){
            if(vetor[i] == r6){
                if(r6 == 1){
                    reputação = reputação;
                }
                if(r6 == 2){
                    reputação = reputação;
                }
                if(r6 == 3){
                    reputação = reputação;
                }
                if(r6 == 4){
                    reputação++;
                }
            }   
        }

    }while(x <= 0);

    double resultado = (reputação*100)/(double) contadorR;
    if (resultado == 100){
        System.out.printf("\nCEO Fabio Akita: Parabéns %s! Você acertou a pergunta e por isso agora você se tronou oficialmente o novo CEO da CODMINE!\nFim de jogo!", a);
    }
    else {
        System.out.printf("Sinto muito, você errou e terá que começar novamente!\n Game Over!");
    }
        
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
        System.out.println("Jean Carlos Sodré da Silva");


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
