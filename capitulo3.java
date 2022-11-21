/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointegrador;

import java.util.Scanner;
public class capitulo3 {
    public static void main(String[] args) {
        String nome, alternativas;
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int contador = 0;
        System.out.println("digite seu nome: ");
        String nome = entrada.next;

        //dialogos sem intereção do usuario
        System.out.println("inicio do 3° capitulo");
        System.out.println("desenvolvedor pleno");
        System.out.println("KAKA - bom dia preparado para esse novo desafio? ");
        System.out.println(" bom dia Kaka," + nome + " com certeza, mal posso esperar para começar.");
        System.out.println("KAKA - muito bom ver você animado, vai indo pra sua mesa e Jajá vou lá te apresentar uns projetos.");
        System.out.println("ok, fico no aguardo.");
        System.out.println("chegando lá," +nome +"encontra todos seus colegas juntos..");
        System.out.println("bom dia rapaziada, como vcs estão?");
        System.out.println("Patrícia - bom dia" +nome+ "bem e vc? Fiquei sabendo da sua promoção, parabéns");
        System.out.println("estou ótimo, obrigado fiquei muito feliz com ela, só progresso agora.");
        System.out.println("Richard - hum, o cara nem conheceu a equipe direito e já foi promovido, vc é oque sobrinho do dono?");
        System.out.println(" ue, qual foi cara? Tô só fazendo meu trampo.");
        System.out.println("Richard - eles tem seus favoritos mesmo, vamos ver como vc trabalha.");
        System.out.println("Patrícia - para de encher o saco dele, e não o culpe por estar estagnado, isso é problema seu");
        System.out.println(" valeu Patrícia, já vi q vai ser difícil trabalhar com esse cara.");
        System.out.println("Patrícia - q nada, ele só é um pouco chato mesmo, não dá bola.");
        System.out.println(" ok");
        System.out.println("KAKA - bom dia pessoal, vcs estão bem hj?");
        System.out.println("KAKA - então, como vcs já sabem o "+nome+ " foi promovido a pleno, a partir de hj ele vai ficar encarregado de supervisionar o juniors.");
        System.out.println("KAKA - então toda a equipe de júniors agora responde a ele, ok?");
        System.out.println("Equipe - ok.");
        System.out.println("KAKA - qualquer problema que vocês tiverem é só pedir a ajuda dele e ele irá ajudar.");
        System.out.println("Richard - hum, se vc diz.");
        System.out.println("N - vamos começar então, o que vcs tem aí?");
        
        //inicio das interações
        //primeira pergunta
        System.out.println("1) Patrícia - estou criando um sistema de supermercado mas estou com um probleminha\n" +
"nessa parte aqui olha.");
        System.out.println("n- vamos ver\n" +
"public static void main(string[] artes) {\n" +
"Scanner entrada = New Scanner(system.in);\n" +
"Float fandangos, Cheetos, Doritos;\n" +
"system.out.println(&quot;digite valor do fandangos: );\n" +
"fandangos = entrada.nextFloat()\n" +
"system.out.println(&quot; digite valor do Cheetos: );\n" +
"Cheetos = entrada.nextFloat()\n" +
"System.out.println(&quot;digite valor do Doritos: );");
        do{
        System.out.println("alternativas");
            System.out.println("a) erro de lógica, esse código não faz sentido.");
            System.out.println("b) erro de sintaxe, falta alguns pontos e vingulas e umas letras maiúsculas."); // resposta correta
            System.out.println("c) erro funções.");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
            
        switch (alternativas) {
             case "B":
             case "b":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "A":
                   case "a":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
                    System.out.println("N- mais atenção daqui pra frente em.");
                    System.out.println("Patrícia- claro, erro bobo da minha parte");
                    System.out.println("Richard- aqui, tbm preciso de ajuda para solucionar um erro.");
            
            //segunda pergunta
                    System.out.println("2) Richard - preciso somar alguns vetores e encontrar o menor e o maior.");
                    System.out.println("N - ok, deixa eu ver o q vc já vez");
                    System.out.println("int soma = 0;\n" +
"int menor = v [0];\n" +
"int maior = v [0];\n" +
"for (int i = 0; i &lt; n; i++) {\n" +
"soma + v [i];\n" +
"If (v[i] &lt; menor)\n" +
"Menor = v[i];\n" +
"If(v[i] &gt; maior)\n" +
"maior = v[i];");
                    System.out.println("alternativas");
            System.out.println("a) erro de sintaxe.");
            System.out.println("b) erro de logica."); // resposta correta
            System.out.println("c) Erro de funções.");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "B":
             case "b":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "A":
                   case "a":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
                    System.out.println("Richard - entendi percebi que devia ter colocado um soma + soma ali.");
                    System.out.println("N- isso.");
                    System.out.println("Patricia- N, por favor, preciso de vc de novo.");
            //terceira pergunta
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
"}\n" +
"System.out.println(&quot;total: &quot; + soma);");
                    
                    System.out.println("alternativas");
            System.out.println("a) erro de funções, if não faz sentido nesse código");
            System.out.println("b) erro de logica, falta um break para quando o usuário digitar um número acima de 10"); //correta
            System.out.println("c) erro de sintaxe, falta pontos e chaves..");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "B":
             case "b":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "A":
                   case "a":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
                    System.out.println("N - vc precisa colocar um break no codigo para ele rodar direitinho");
                    System.out.println("Patrícia - entendi, obrigada pela atenção.");
                    //quarta pergunta
                    System.out.println(" Jake- N, tbm preciso de ajuda, to desenvolvendo uma prova online, porem n sei ao certo qual a melhor logica a se usar.");
                    
                    System.out.println("alternativas");
            System.out.println("a) use o Do com switch case e while."); // correta
            System.out.println("b) use o if else com do-while."); 
            System.out.println("c) use o for com if else..");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "A":
             case "a":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "B":
                   case "b":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
                    System.out.println("Jake- ok obrigado.");
                    //quinta pergunta
                    System.out.println("Richard- mais uma coisa, preciso criar um login q bloquei o usuario dps de 3 tentativas, como faço?");
                    
                    System.out.println("alternativas");
            System.out.println("a) vetores e switch case.");
            System.out.println("b) for e if else."); //correta
            System.out.println("c) while e if else.");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "B":
             case "b":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "A":
                   case "a":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
            
            //sexta pergunta
                    System.out.println("jake- N, preciso criar o menu de um jogo, quais as melhores ferramentas para usar?");
                     System.out.println("alternativas");
            System.out.println("a) for com if else e while."); 
            System.out.println("b) só switch case."); 
            System.out.println("c) do com switch case e while.");// correta
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "c":
             case "C":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "B":
                   case "b":
                   case "a":
                   case "A":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
            
            //setima pergunta
                    System.out.println("Patrícia, N, como faço para contar quantas letras tem uma palavra no código?");
                    System.out.println("alternativas");
            System.out.println("a) ultilize o for."); 
            System.out.println("b) ultilize o length."); // correta
            System.out.println("c) ultilize vetores.");
            System.out.println("Escolha uma alternativa; ");
            alternativas = entrada.next();
                    
                     switch (alternativas) {
             case "b":
             case "B":
                System.out.println("Resposta correta!");
                   acertou = true;
                   contador = contador + 14;
                break;
                   case "A":
                   case "a":
                   case "c":
                   case "C":
                   
            System.out.println("Resposta incorreta!");
                contador = contador + 0;
                break;
                default:
            System.out.println("Escolha inválida!");
}


 if{ contador >60;
     System.out.println("Kaka - eai como estao indo aa coisas por aqui?");
     
     System.out.println("N- tudo tranquilo, to dando uma atenção para a galera como vc disse.");
     System.out.println("KAKA- otimo, ele se saiu bem turma?");
     System.out.println("Richard - é, ate q foi de grande ajuda");
     System.out.println("Patrícia - sim, tava quebrando a cabeça por coisas bobas, e se não fosse por ele ainda estaria.");
     System.out.println("KAKA - que otimo, fico feliz em ouvir isso.");
     System.out.println("KAKA- vamos conversar N.");
     System.out.println("N - claro.");
     System.out.println("KAKA- seu desempenho tem sido excelente, e como estamos sem um senior na area decidi te promover, eai oq acha? Vc aceita?");
     System.out.println("N- ual, acho incrível, claro q aceito.");
     System.out.println("KAKA - otimo, sua jornada nessa empresa vai ser incrível.");
 }
 
 
}
}
}
} 
} while (!acertou && contador < 60);
        
        
    

