// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val Nivel : Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario);
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução a programação.",30,Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Introdução a orientação a objetos.",30,Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Introdução a banco de dados.",30,Nivel.BASICO)
    var conteudos = mutableListOf<ConteudoEducacional>()
    conteudos.add(conteudo1)
    conteudos.add(conteudo2)
    conteudos.add(conteudo3)
    
    var FormacaoIntrodutoria = Formacao("Introdução ao desenvolvimento",conteudos)
    println(FormacaoIntrodutoria)
    println(FormacaoIntrodutoria.nome)
    println(FormacaoIntrodutoria.conteudos[0])
	// tudo Ok através do caminho feliz.
}
