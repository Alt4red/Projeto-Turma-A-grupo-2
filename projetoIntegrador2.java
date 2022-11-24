/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointegrador;

/**
 *
 * @author jdsod
 */

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class projetoIntegrador2 {

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
            faseQuatro();
        } else {
            System.out.println("KAKA - " + a+ " Infelizmente você não atingiu as nossas expectativas e vamos desligar você da empresa hoje, "
                    + "boa sorte na sua jornada e obrigada pelos serviços ");
        }


        return reputaçãoP;



    }


    public static void faseQuatro(){
        System.out.println("FASE 4");
    }


   


    


    }

