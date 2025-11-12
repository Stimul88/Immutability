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

    val totalCommission = if (transfer < minCommission)  minCommission else transfer

    println(totalCommission)
}

fun people() {
    val likes = 31

    val people = if (likes % 100 in 11..14) "людям" else if (likes % 10 == 1) "человеку" else "людям"

    println("Понравилось $likes $people")
}

fun musicLover() {
    val regularCustomer = true
    val sum = 100.0

    val firstSum = if (sum <= 0 && sum <= 1000) sum - 100 else if (sum > 10_000) sum * 0.95 else sum
    println(firstSum)

    if (regularCustomer) {
        println("Итоговая стоимость:  ${firstSum * 0.99}")
    } else {
        println("Итоговая стоимость:  $firstSum")
    }
}