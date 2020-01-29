open class Burung(val jenis: String, val warnabulu: String, val habitat: String){
 
    open fun terbang(){
        println("pak pak pak....")
    }
 
    open fun tampil(){
        println("burung merupakan jenis $jenis dan hidup di $habitat\nwarnabulunya $warnabulu")
    }
}
class Pinguin(jenis : String , warnabulu : String, habitat: String):Burung(jenis,warnabulu,habitat){
    override fun terbang(){
        println("Pinguin tidak bisa terbang!")
    }
    override fun tampil(){
        println("pinguin merupakan jenis $jenis dan hidup di $habitat\nwarnabulunya $warnabulu")
    }
    fun renang(){
        println("byuur")
    }
}

open class databurung(){
    fun ngeprin1(){
        val burung = Burung("mamal","merah","AU")
        burung.terbang()
        burung.tampil()
    }
    fun ngeprin2(){
        val pinguin = Pinguin("mamal","putih","AL")
        pinguin.terbang()
        pinguin.tampil()
        pinguin.renang()
    }
    fun ngeprin3(){
        println("""
            ---------------No Data.-------------
            [mohon pilih sesuai pilihan yang ada]

            """.trimIndent())
    }  
    
}

fun main(){
    println("""
            ****************************
                    ini pilihan
            ****************************
            (a) untuk burung secara umum
            (b) untuk burung unik
            ----------------------------
            cuma boleh pilih satu loh...
            ____________________________
            pilihanmu:

        """.trimIndent())
    val apaya = readLine()
    val Databurung = databurung()
    when(apaya) {
        "a" -> Databurung.ngeprin1()
        "b" -> Databurung.ngeprin2()
        else -> Databurung.ngeprin3()
    }
}