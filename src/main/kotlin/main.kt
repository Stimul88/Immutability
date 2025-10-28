fun main() {

    println("Иванов Евгений")
    commission()

    people()

    musicLover()

}


fun commission() {
    val amount = 5000
    val minCommission = 35
    val transfer  = amount * 0.0075

    val totalCommission = if (transfer < 35)  minCommission else transfer

    println(totalCommission)
}

fun people() {
    val likes = 31

    val people = if (likes % 100 in 11..14) "людям" else if (likes % 10 == 1) "человеку" else "людям"


    println("Понравилось $likes $people")
}

fun musicLover() {
    val regularCustomer = true
    val sum = 15000

    val firstSum = if (sum <= 0 && sum <= 1000) 0 else if (sum <= 1001 && sum <= 10_000) 100 else Math.round(sum * 0.95)
    val secondDiscount = if (regularCustomer) firstSum * (0.99) else 0

    if (regularCustomer) {
        println("Итоговая стоимость:  $secondDiscount")
    } else {
        println("Итоговая стоимость:  $firstSum")
    }


}
