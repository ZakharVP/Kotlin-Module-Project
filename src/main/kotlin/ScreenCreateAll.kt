import dataClass.Archive
import dataClass.Note
import java.util.Scanner

class ScreenCreateAll<T> {

    var archiveAndNote: T? = null
    fun create(): Any?{
        when(archiveAndNote) {
            is Archive -> {
                var enterStringArchive = ""
                while(enterStringArchive.isEmpty()) {
                    println("Введите имя архива")
                    enterStringArchive = Scanner(System.`in`).nextLine()
                }
                val noteList = mutableListOf<Any>("0. Создать заметку", "1. Выход к списку архивов")
                val archive = Archive(enterStringArchive, noteList)
                return archive

            }
            is Note -> {
                var enterStringTitleNote = ""
                var enterStringBodyNote = ""
                while(enterStringTitleNote.isEmpty()) {
                    println("Введите заголовок заметки")
                    enterStringTitleNote = Scanner(System.`in`).nextLine()
                }
                while(enterStringBodyNote.isEmpty()) {
                    println("Введите текст заметки")
                    enterStringBodyNote = Scanner(System.`in`).nextLine()
                }
                val note = Note(enterStringTitleNote, enterStringBodyNote)
                return note
            }
            else -> return null
        }

    }

}