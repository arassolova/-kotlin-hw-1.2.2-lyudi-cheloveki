fun main() {
    val likes = 1002
    val result = likes % 10
    if (result === 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}