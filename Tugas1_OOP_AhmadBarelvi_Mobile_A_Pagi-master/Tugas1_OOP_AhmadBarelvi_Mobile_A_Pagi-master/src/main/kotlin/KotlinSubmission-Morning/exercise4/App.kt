package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    try {
        // Contoh: Bagian kode yang mungkin menghasilkan exception
        val result = divideNumbers(10, 5)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        // Tangani exception
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } catch (e: Exception) {
        // Tangani exception umum
        println("Terjadi kesalahan: ${e.message}")
    } }

// Fungsi untuk pembagian
    fun divideNumbers(a: Int, b: Int): Int {
        return a / b

}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


