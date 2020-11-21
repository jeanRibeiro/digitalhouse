package br.com.aula7.exercicio2

fun main() {

    val jogador1 = JogadorDeFutebol("Jean");
    jogador1.energia = 100;
    jogador1.alegria = 0;
    jogador1.gols = 0;
    jogador1.experiencia = 0;

    val jogador2 = JogadorDeFutebol("Douglas");
    jogador2.energia = 200;
    jogador2.alegria = 50;
    jogador2.gols = 6;
    jogador2.experiencia = 0;

    val treinamentoJogador1 = SessaoDeTreinamento();
    treinamentoJogador1.treinarA(jogador1);

    val treinamentoJogador2 = SessaoDeTreinamento();
    treinamentoJogador2.treinarA(jogador2);
}