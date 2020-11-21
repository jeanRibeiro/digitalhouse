package br.com.aula7.exercicio2


class SessaoDeTreinamento() {

    fun treinarA(jogador: JogadorDeFutebol){

        var experienciaInicial = jogador.experiencia;

        println("Iniciando treinamento com jogador: ${jogador.nome}")

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.experiencia += 1;

        println("Experiência: inicial[$experienciaInicial], final[${jogador.experiencia}]")

        println("Treinamento finalizado para o jogador: ${jogador.nome}")
        println("------------------------------------------------------")
    }

}