package com.github.akrox58.intellijtoolcrawler.services

import com.intellij.openapi.project.Project
import com.github.akrox58.intellijtoolcrawler.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
