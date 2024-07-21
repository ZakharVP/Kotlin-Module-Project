fun main(args: Array<String>) {

    println()
    println("Приложение \"Заметки\"")
    println()

    val screenSelectionArchive = ScreenSelectionArchive()
    screenSelectionArchive.start()

    println()
    println("Вы вышли из приложения \"Заметки\". До свидания!")

}
/*
    var index: Int = 0

    while (index < 5 ) {
        println("Введите строку:")
        var enterString  = Scanner(System.`in`).nextLine()
        if (enterString.equals("exit")) {
            println("Do exit from cycle")
            return
        }
        println(enterString)

        index += 1
    }
    return





    val archiveList = mutableListOf<dataClass.Archive>()
    val currentDateTime = LocalDateTime.now()
    for (y in 1 ..3) {
        val noteList:MutableList<dataClass.Note> = mutableListOf<dataClass.Note>()
        for (i in 1..5) {
            val vTime = currentDateTime.plus(i.toLong(), ChronoUnit.HOURS).hour
            val note = dataClass.Note("Начало в ${i+10}", "Выполнил небольших задач " + (1..10).random() + " шт.")
            noteList.add(note)
        }
        val archive = dataClass.Archive("День $y", noteList)
        archiveList.add(archive)
    }

    println(archiveList)






//    println("Начало программы")
//    println("Выбор архива")
//    println("")

}

data class dataClass.Archive(val name: String, val notes: MutableList<dataClass.Note>)
data class dataClass.Note(val title: String, val body: String)
*/
