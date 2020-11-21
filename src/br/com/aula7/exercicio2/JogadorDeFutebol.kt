package br.com.aula7.exercicio2


class JogadorDeFutebol(var nome: String) {
    var energia: Int = 0;
    var alegria: Int = 0;
    var gols: Int = 0;
    var experiencia: Int = 0;

    fun fazerGol() {

        energia -= 5;
        if (energia < 0) {
            energia = 0;
        }

        alegria += 10;

        gols += 1;

        var golsDescricao = "gol";
        if(gols > 1){
            golsDescricao = "gols";
        }

        println("GOOOOL! Total de [$gols] $golsDescricao");
    }

    fun correr(){
        energia -= 10;
        if(energia < 0){
            energia = 0;
        }

        println("Cansei! Energia atual [$energia]");
    }


}