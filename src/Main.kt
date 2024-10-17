import kotlin.math.sqrt

data class Point(val x: Double, val y: Double) {

    fun distanceTo(other: Point): Double {
        return sqrt((other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y))
    }
}

fun readPointCoordinate(prompt: String): Double {
    while (true) {
        try {
            print(prompt)
            return readLine()?.toDouble() ?: throw NumberFormatException()
        } catch (e: NumberFormatException) {
            println("Ошибка: введите корректное число.")
        }
    }
}

fun main() {
    println("Введите координаты первой точки:")
    val x1 = readPointCoordinate("x1: ")
    val y1 = readPointCoordinate("y1: ")

    println("Введите координаты второй точки:")
    val x2 = readPointCoordinate("x2: ")
    val y2 = readPointCoordinate("y2: ")

    val point1 = Point(x1, y1)
    val point2 = Point(x2, y2)

    val distance = point1.distanceTo(point2)

    println("Расстояние между точками: $distance")
}