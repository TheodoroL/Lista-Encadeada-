class ListaNo<T>( var dado:T,  var prox:ListaNo<T>? = null)
class ListaEncadeada<T>(){
    private var lista:ListaNo<T>? = null
    fun add(dado:T){
        if(lista == null){
            lista = ListaNo(dado)
        }else{
            var atual = lista;
            while(atual?.prox != null){
                atual = atual.prox;

            }
            atual?.prox = ListaNo(dado);
        }
    }
    fun mostar(){
        var atual =  lista;
        while (atual!= null){
            print("${atual.dado} ")
            atual = atual.prox;
        }
        println()


    }
    fun leght(): Int{
        var atual = lista;
        var count:Int = 0;
        while (atual != null){
            atual =  atual.prox;
            count+=1;
        }
        return count;
    }

}




fun main() {
    var lista:ListaEncadeada<Int> = ListaEncadeada<Int>()
    for(c in 0..10){
        lista.add(c);
    }
    lista.mostar();
    println(lista.leght());
}

