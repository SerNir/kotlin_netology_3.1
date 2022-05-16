fun main() {
    println(agoToText(660))
    println(agoToText(21))
    println(agoToText(720))
    println(agoToText(125))
    println(agoToText(1320))
    println(agoToText(7300))
    println(agoToText(14562))
    println(agoToText(28546))
    println(agoToText(43568))
    println(agoToText(87300))
    println(agoToText(187300))
    println(agoToText(1187300))
}

fun agoToText(second: Int) = when {
    second < 60 -> "был(а) только что"
    second > 60 && second < 60 * 60 -> "был(а) ${second / 60} ${minutesAgo(second / 60)} назад "
    second > 60 * 60 + 1 && second < 24 * 60 * 60 -> "был(а) ${second / 60 / 60} ${hoursAgo(second)} назад"
    second > 24 * 60 * 60 + 1 && second < 24 * 60 * 60 * 2 -> "был(а) сегодня"
    second > 24 * 60 * 60 * 2 + 1 && second < 24 * 60 * 60 * 3 -> "был(а) вчера"
    else -> "был(а) давно"
}

fun minutesAgo(second: Int) = when {
    second == 11 || second == 12 || second == 13 || second == 14 -> "минут"
    second % 10 == 2 || second % 10 == 3 || second % 10 == 4 -> "минуты"
    second % 10 == 1 -> "минуту"
    else -> "минут"
}

fun hoursAgo(second: Int) = when (second / 60 / 60) {
    1, 21 -> "час"
    2, 3, 4, 22, 23, 24 -> "часа"
    else -> "часов"
}