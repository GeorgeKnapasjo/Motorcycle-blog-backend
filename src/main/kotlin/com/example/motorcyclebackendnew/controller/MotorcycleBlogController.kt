package com.example.motorcyclebackendnew.controller

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import com.example.motorcyclebackendnew.service.MotorcycleBlogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MotorcycleBlogController (val service: MotorcycleBlogService){

    @GetMapping("/Blogs")
    fun getBlogs(): List<MotorcycleBlog> = service.getBlogs()

    @PostMapping("/Blogs")
    fun addBlog(@RequestBody motorcycleBlog: MotorcycleBlog) = service.add(motorcycleBlog)
}