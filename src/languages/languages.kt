package languages

data class Language(var description: String, val language: String)

fun createLanguage(description: String, language: String) = Language(description, language);

fun getLanguages(): List<Language> {
    val en = createLanguage("the english language", "en");
    val fr = createLanguage("the french language", "fr");
    val de = createLanguage("the german language", "de");
    return listOf(en, fr, de);
}

fun updateLanguage(languages: List<Language>, targetLanguage: String, update: String): List<Language> {
    for (item in languages) {
        if (item.language == targetLanguage) {
            item.description = update;
        }
    }
    return languages;
}

fun removeLanguage(languages: List<Language>, target: String): List<Language> = languages.filterNot { language -> language.language == target }


fun main() {
    var languages = updateLanguage(getLanguages(), "fr", "is it the french language");
    languages = removeLanguage(languages, "de");
    for (item in languages) {
        println(item.description);
        println(item.language);
    }
}
