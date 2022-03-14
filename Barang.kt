class Barang(private val nama : String = "Kemeja" , private val harga : Int = 100_000, private val jumlah :Int = 2,
             private val diskon: Double = 0.25) {
    fun tampil() {
        println("Nama Barang    : $nama")
        println("Harga Barang   : $harga")
        println("Jumlah Barang  : $jumlah")
        println("Diskon Barang  : $diskon")
    }

    fun hitungTotal() {
        val total = harga * jumlah * diskon
        val hargaTotal = (harga * jumlah) - total.toInt()

        println("Total harga barang setelah di beri diskon adalah $hargaTotal")
    }
}