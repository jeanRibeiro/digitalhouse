package br.com.aula10

fun main() {

    //tipo 1 = Ingresso Normal, tipo = 2 Ingresso VIP
    //var tipoIngresso :Int = 1;
    //var tipoIngresso :Int = 2;

    println("Informe o tipo de ingresso!");
    println("Sendo \"1\" para Normal ou \"2\" para Vip:");
    var tipoIngresso : String? = readLine();


    if(tipoIngresso.equals("1") || tipoIngresso.equals("2")){

        if(tipoIngresso.equals("1")){
            val ingressoNormal = Normal(20.0);
            ingressoNormal.imprimeDescricao();
            ingressoNormal.imprimeValor();
            return;
        }

        //tipo 1 = Camarote Superior, tipo = 2 = Camarote Inferior
        //var tipoCamarote :Int = 1;
        //var tipoCamarote :Int = 2;

        println("Agora informe o tipo de camarote!");
        println("Sendo \"1\" para Superior ou \"2\" para Inferior:");
        var tipoCamarote : String? = readLine();

        if(tipoCamarote.equals("1") || tipoCamarote.equals("2")){

            if(tipoCamarote.equals("1")){
                val camaroteSuperior = CamaroteSuperior(20.0, 10.0);
                camaroteSuperior.imprimeDescricao();
                camaroteSuperior.imprimeValor();
                return;
            }

            //camaroteInferior
            val camaroteInferior = CamaroteInferior(20.0,"Proximo á escada");
            camaroteInferior.imprimeDescricao();
            camaroteInferior.imprimeValor();
            camaroteInferior.imprimirLocalizacao();
            return;
        }

        println("Tipo VIP de Camarote informado é inválido!");
        println("Favor informar: \"1\" para Superior ou \"2\" para Inferior.");
        return;
    }

    println("Tipo informado é inválido!");
    println("Favor informar: \"1\" para Ingresso Normal ou \"2\" para Ingresso VIP.")

}