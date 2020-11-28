package br.com.aula15

import java.awt.Menu
import java.lang.Exception
import java.util.*

fun main() {
    //    println("############################################");
//    println("########   Livraria Digital House   ########");
//    println("############################################");
//
//    var menuInicial = MenuInicial();
//    var estoque = EstoqueLivro();
//
//    menuInicial.listaMenu.add(MenuInicial(0, "Sair", menuInicial));
//    menuInicial.listaMenu.add(MenuInicial(1, "Cadastrar", menuInicial));
//    menuInicial.listaMenu.add(MenuInicial(2, "Consultar", menuInicial));
//    menuInicial.listaMenu.add(MenuInicial(3, "Consultar por Código", menuInicial));
//    menuInicial.listaMenu.add(MenuInicial(4, "Efetuar Venda", menuInicial));
//
//    iniciaSistema(menuInicial, estoque);

    val estoque = EstoqueLivro()
    val livro1 = Livro(1, "titulo1", "autor1", 1990, 2, 4, 18.90)
    val livro2 = Livro(1, "titulo1", "autor1", 1990, 2, 4, 18.90)
    val livro3 = Livro(3, "titulo1", "autor1", 1990, 2, 4, 18.90)

    estoque.addLivroALista(livro1)
    estoque.addLivroALista(livro2)
    estoque.addLivroALista(livro3)

    estoque.consultaTodosLivros()// retorna apenas livros 1 e 3, pois o 2 é igual ao 1
}

fun iniciaSistema(menuInicial:MenuInicial, estoqueLivro: EstoqueLivro){
    println(" ");
    menuInicial.exibeMenu();
    var menuDigitado = readLine();

    if(menuInicial.validaMenuDigitado(menuDigitado)){

        if(menuDigitado.equals("1")){
            cadastraLivro(menuInicial, estoqueLivro);
        }
        else if(menuDigitado.equals("2")){
            consultaLivro(menuInicial, estoqueLivro);
        }
        else if(menuDigitado.equals("3")){
            consultaLivroPorCodigo(menuInicial, estoqueLivro, -1);
        }
        else if(menuDigitado.equals("4")){
            efetuaVenda(menuInicial, estoqueLivro);
        }
        else if(menuDigitado.equals("0")){
            println("Encerrando a sessão atual...");
            println("Sessão finalizada!");
        }

    }
    else{
        iniciaSistema(menuInicial, estoqueLivro);
    }
}

fun escutaNumeroDigitado():Int{
    var textoDigitado: String = "";

    textoDigitado = readLine().toString();

    if(textoDigitado.toIntOrNull() != null){
        return textoDigitado.toInt();
    }

    println("Oops! Algo de errado aconteceu.");
    println("Informe um número válido:");

    return -1;
}
fun escutaTextoDigitado(tamanhoMinimo:Int?=0):String{
    var textoDigitado: String = "";

    textoDigitado = readLine().toString();

    if(tamanhoMinimo != null){
        if(tamanhoMinimo > 0){
            if(textoDigitado.toString().trim().length > tamanhoMinimo){
                return textoDigitado;
            }
            println("Oops! Algo de errado aconteceu.");
            println("O texto digitado deve ser maior que [$tamanhoMinimo] caracter");
            return "-1";
        }

    }

    return textoDigitado;
}
fun escutaDoubleDigitado():Double{
    var textoDigitado: String = "";

    textoDigitado = readLine().toString();

    if(textoDigitado.toIntOrNull() != null){
        return textoDigitado.toDouble();
    }

    if(textoDigitado.toDoubleOrNull() != null){
        return textoDigitado.toDouble();
    }

    println("Oops! Algo de errado aconteceu.");
    println("Informe um valor válido:");

    return -1.0;
}

fun cadastraLivro(menuInicial: MenuInicial, estoqueLivro:EstoqueLivro){
    println("Ok, vamos lá!");
    println("Informe o código do livro:");
    var codigo: Int = -1;
    while (codigo == -1){
        try {
            codigo = escutaNumeroDigitado();
        }
        catch (excecao:Exception){
            codigo = -1;
        }
    }

    println("Agora informe o título dele:");
    var titulo: String = "-1";
    while (titulo.equals("-1")){
        try {
            titulo = escutaTextoDigitado(1);
        }
        catch (excecao:Exception){
            titulo = "-1";
        }
    }

    println("Agora o autor:");
    var autor: String = "-1";
    while (autor.equals("-1")){
        try {
            autor = escutaTextoDigitado(1);
        }
        catch (excecao:Exception){
            autor = "-1";
        }
    }

    println("Informe também o ano de lançamento:");
    var anoLancamento: Int = -1;
    while (anoLancamento == -1){
        try {
            anoLancamento = escutaNumeroDigitado();
        }
        catch (excecao:Exception){
            anoLancamento = -1;
        }
    }

    println("Agora o código ISBN:");
    var codigoIsbn: Int = -1;
    while (codigoIsbn == -1){
        try {
            codigoIsbn = escutaNumeroDigitado();
        }
        catch (excecao:Exception){
            codigoIsbn = -1;
        }
    }

    println("Estamos quase lá...");
    println("Quantas unidades desse exemplar quer incluir?");
    var qtdEstoque: Int = -1;
    while (qtdEstoque == -1){
        try {
            qtdEstoque = escutaNumeroDigitado();
        }
        catch (excecao:Exception){
            qtdEstoque = -1;
        }
    }

    println("Pronto! Agora é só informar o preço desse exemplar:");
    var preco: Double = -1.0;
    while (preco == -1.0){
        try {
            preco = escutaDoubleDigitado();
        }
        catch (excecao:Exception){
            preco = -1.0;
        }
    }

    val livro = Livro(
            codigo,
            titulo,
            autor,
            anoLancamento,
            codigoIsbn,
            qtdEstoque,
            preco
    )

    livro.cadastrarLivro(livro, estoqueLivro);

    iniciaSistema(menuInicial, estoqueLivro);
}
fun consultaLivro(menuInicial: MenuInicial, estoqueLivro:EstoqueLivro){

    if(estoqueLivro.consultaTodosLivros().size > 0){
        println("Listando...")
        for (livro in estoqueLivro.consultaTodosLivros()){
            println(livro);
        }
    }
    else{
        println("Ainda não tem livros incluídos!");
    }

    iniciaSistema(menuInicial, estoqueLivro);
}
fun consultaLivroPorCodigo(menuInicial: MenuInicial, estoqueLivro: EstoqueLivro, codigoLivro:Int?): Livro? {

    var codigo: Int = -1;

    if(codigoLivro != null && codigoLivro != -1){
        codigo = codigoLivro;
    }
    else{
        println("Informe o código do livro:");
        while (codigo == -1){
            try {
                codigo = escutaNumeroDigitado();
            }
            catch (excecao:Exception){
                codigo = -1;
            }
        }
    }

    var listaLivros = estoqueLivro.consultaTodosLivros();
    var objeto: Livro? = null;

    if(listaLivros.size > 0){
        println("Listando...")
        for (livro in listaLivros){
            if(livro.codigo == codigo){
                objeto = livro;
                break;
            }
        }
    }
    else{
        println("Ainda não tem livros incluídos!");
    }

    if(objeto != null){
        println(objeto);
    }
    else{
        println("Não há livro com o código [$codigo] informado.")
    }

    if(codigoLivro != null && codigoLivro == -1){
        return objeto;
    }

    iniciaSistema(menuInicial, estoqueLivro);
    return null;
}
fun efetuaVenda(menuInicial: MenuInicial, estoqueLivro:EstoqueLivro){
    println("Efetuando a venda!");

    var livro:Livro? = consultaLivroPorCodigo(menuInicial, estoqueLivro, -1);

    if(livro != null){

        println("Informe a quantidade a ser vendida:");
        var qtd:Int = -1;
        while (qtd == -1){
            try {
                qtd = escutaNumeroDigitado();
            }
            catch (excecao:Exception){
                qtd = -1;
            }
        }

        val venda = Venda();

        if(venda.efetuarVenda(livro, qtd, estoqueLivro)){
            println("Venda concluída com sucesso!");
        }
        else{
            println("Refaça a operação!");
        }

    }
    else{
        println("Não foi possível efetuar a venda!");
        println("Livro não encontrado. Refaça a operação.");
    }

    iniciaSistema(menuInicial, estoqueLivro);
}