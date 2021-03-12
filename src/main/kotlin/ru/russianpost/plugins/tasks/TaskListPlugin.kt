package ru.russianpost.plugins.tasks

import org.gradle.api.Plugin
import org.gradle.api.Project

class TaskListPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.task("task-list") {
            it.doLast {
                println("Apply russianpost task list plugin")
                val taskSet = project.getAllTasks(true)
                println("#######")
                println("List of projects tasks:")
                for (set in taskSet) {
                    println("           ----------")
                    println("-" + set.key.name)
                    for (task in set.value) {
                        println("-----" + task.name)
                    }
                }
                println("#######")
            }
        }
    }
}