package com.github.jahyundev.wktvisualizerintellijplugin.services

import com.github.jahyundev.wktvisualizerintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
