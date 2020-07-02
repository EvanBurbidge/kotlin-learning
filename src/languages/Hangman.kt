package languages

import java.util.Scanner;

fun playHangman(lives: Int): Boolean {
    val word = "dog";
    var totalLives = lives;
    val reader = Scanner(System.`in`);

    var hasWon = false;

    var match = 0;
    while (totalLives > 0) {
        val userInput = reader.next()
        for (i in word.indices) {
            if (word[i] == userInput.toCharArray()[0]) {
                match += 1;
            }
        }
        if (match == word.length) {
            hasWon = true;
            break;
        }
        totalLives -= 1;
    }
    return hasWon;
}