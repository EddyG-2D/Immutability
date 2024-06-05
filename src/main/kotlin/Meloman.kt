fun main() {
    val meloman = true
    val totalPrice = 15_000
    val minDiscount = 100
    val discountStart = 1_000
    val percentDiscount = 0.95
    val percentDiscountStart = 10_000
    val melomanDiscount = 0.99

    val result = if (!meloman) {
        if (totalPrice > percentDiscountStart) totalPrice * percentDiscount
        else if (totalPrice > discountStart) totalPrice - minDiscount
        else totalPrice
    } else {
        if (totalPrice > percentDiscountStart) totalPrice * percentDiscount * melomanDiscount
        else if (totalPrice > discountStart) (totalPrice - minDiscount) * melomanDiscount
        else totalPrice * melomanDiscount
    }
    println("Итоговая стоимость: $result руб.")
}