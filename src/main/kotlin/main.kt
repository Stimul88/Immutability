fun main() {
    commission()

    people()

    musicLover()

}


fun commission() {
    val amount = 1000
    val minCommission = 35
    val transfer  = Math.round(amount * 0.0075)

    val totalCommission = if (transfer < 35)  minCommission else transfer

    println(totalCommission)
}

fun people() {
    val likes = 38

    val people = if (likes === 1 || likes % 10 ===1) "человеку" else "людям"

    println("Понравилось $likes $people")
}

fun musicLover() {
    val regularCustomer = true
    val sum = 10111

    val firstDiscount = if (sum <= 0 && sum <= 1000) 0 else if (sum >= 1001 && sum <= 10_00) 100 else Math.round(sum * 0.05)
    val secondDiscount = if (regularCustomer) Math.round(sum * 0.01) else 0

    val totalSum = sum - firstDiscount - secondDiscount

    println("Итоговая стоимость:  $totalSum")
}
