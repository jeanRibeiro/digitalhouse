package br.com.aula15

class EstoqueLivro {

    private var listaLivros = mutableListOf<Livro>();

    fun consultaTodosLivros():MutableList<Livro>{
        return listaLivros;
    }
    fun addLivroALista(livro: Livro){

        var temLivroNaLista: Boolean = false;
        var novaLista = mutableListOf<Livro>();

        if(listaLivros.size > 0){
            for(item in listaLivros){
                if(item.codigo == livro.codigo){
                    novaLista.add(livro);
                    temLivroNaLista = true;
                }
                else{
                    novaLista.add(item);
                }
            }
        }

        if(!temLivroNaLista){
            listaLivros.add(livro);
        }
    }

}