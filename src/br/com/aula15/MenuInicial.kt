package br.com.aula15

class MenuInicial() {

    var codigo:Int = 0;
    var descricao:String = "";
    var listaMenu = mutableListOf<MenuInicial>();
    var listaCodigosMenus = mutableListOf<Int>();

    //construtor secundário
    constructor(codigo:Int, descricao:String, menuInicial: MenuInicial):this(){
        this.codigo = codigo;
        this.descricao = descricao;
        menuInicial.listaCodigosMenus.add(codigo);
    }

    init {

    }

    fun exibeMenu(){
        println("Escolha uma das opções abaixo:")
        for (menu in listaMenu){
            println("${menu.codigo} - ${menu.descricao}:");
        }
    }

    fun validaMenuDigitado(menuDigitado:String?):Boolean{
        try {
            if(menuDigitado != null){
                if(listaCodigosMenus.contains(menuDigitado.toInt())){
                    return true;
                }
            }

            println("Menu não encontrado! Informe um menu válido.");
            return false;
        }
        catch (excecao:Exception){
            println("Informe um menu válido!")
            return false;
        }
    }



}