fun main() {
    val likes1 = 1
    val likes2 = 11
    val likes3 = 111
    val likes4 = 1011
    val likes5 = 1001
    val likes6 = 458
    printLikes(likes1)
    printLikes(likes2)
    printLikes(likes3)
    printLikes(likes4)
    printLikes(likes5)
    printLikes(likes6)
}

private fun printLikes(likes: Int) {
    val result10 = likes % 10
    val result100 = likes % 100
    if (result10 == 1 && result100 != 11) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}