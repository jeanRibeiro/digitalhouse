package br.com.aula15

class EstoqueLivro {

    private var listaLivros = mutableListOf<Livro>();

    fun consultaTodosLivros():List<Livro>{
        return listaLivros.toList();//converti para lista, pois é apenas leitura, vc nao qr q acessem essa lista para altera-la
    }
    fun addLivroALista(livro: Livro){

//        var temLivroNaLista: Boolean = false;
//        var novaLista = mutableListOf<Livro>();

        if (!listaLivros.contains(livro)){//sendo uma data class ele ja valida se tem ou não, logicamente nesse caso apenas se todos os atributos forem iguais, aí depende da sua regra de negocio
            listaLivros.add(livro)
        }

//        if(listaLivros.size > 0){
//            for(item in listaLivros){
//                if(item.codigo == livro.codigo){
//                    novaLista.add(livro);
//                    temLivroNaLista = true;
//                }
//                else{
//                    novaLista.add(item);
//                }
//            }
//        }
//
//        if(!temLivroNaLista){
//            listaLivros.add(livro);
//        }
    }

}