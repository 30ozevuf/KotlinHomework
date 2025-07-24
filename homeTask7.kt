data class Task(val title: String, val description: String, var isDone: Boolean = false)

class TaskManager<T : Task> {
    private val tasks = mutableListOf<T>()

    fun addTask(task: T) {
        tasks.add(task)
        println("Завдання '${task.title}' додано.")
    }

    fun getPendingTasks(): List<T> {
        return tasks.filter { !it.isDone }
    }

    fun markTaskDone(title: String) {
        val task = tasks.find { it.title.equals(title, ignoreCase = true) }
        if (task != null) {
            task.isDone = true
            println("Завдання '${task.title}' позначено як виконане.")
        } else {
            println("Завдання з назвою '$title' не знайдено.")
        }
    }

    fun printAllTasks() {
        println("\nУсі завдання:")
        for ((title, description, isDone) in tasks) {
            val status = if (isDone) "Виконано" else "Не виконано"
            println("• $title: $description [$status]")
        }
    }
}

fun main() {
    val manager = TaskManager<Task>()

    manager.addTask(Task("Вивчити Kotlin", "Пройти розділ про колекції"))
    manager.addTask(Task("Здати лабораторну", "По Wireshark"))
    manager.addTask(Task("Купити каву", "Взяти лате в магазині"))

    manager.markTaskDone("Купити каву")

    println("\nНевиконані завдання:")
    manager.getPendingTasks().forEach {
        println("• ${it.title} — ${it.description}")
    }

    manager.printAllTasks()
}