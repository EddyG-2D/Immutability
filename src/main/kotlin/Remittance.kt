  fun main() {
        val amount = 10000
        val minCommission = 35
        val commission = if ((amount * 0.0075) > minCommission) amount * 0.0075 else minCommission
        println("Комиссия: $commission руб.")
    }
