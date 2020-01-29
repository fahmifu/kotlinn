open class Burung(val jenis: String, val warnabulu: String){
 
    open fun terbang(){
        println("pak pak pak....")
    }
 
    open fun tampil(){
        println("jenis dan habitat")
    }
}
class Pinguin(jenis : String , warnabulu : String ):Burung(jenis,warnabulu){
    override fun terbang(){
        println("Pinguin tidak bisa terbang!")
    }
    fun renang(){
        println("byuur")
    }
}
fun main(){
    val burung = Burung("mamal","merah")
    burung.terbang()
    burung.tampil()
    val pinguin = Pinguin("mamal","putih")
    pinguin.terbang()
    pinguin.renang()
}