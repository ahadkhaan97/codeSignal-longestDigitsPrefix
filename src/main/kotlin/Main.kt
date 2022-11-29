fun main() {
    print(solution("  3) always check for whitespaces"))
}

fun solution(inputString: String): String {
    var tempString = ""
    for (i in inputString.indices) {
        if (inputString[i].isDigit()) {
            tempString += inputString[i]
            continue
        }
        return tempString
    }
    return tempString
}
