package com.example.motorcyclebackendnew.controller

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import com.example.motorcyclebackendnew.service.MotorcycleBlogService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Blogs")
class MotorcycleBlogController (val service: MotorcycleBlogService){

    @GetMapping
    @CrossOrigin
    fun getBlogs(): List<MotorcycleBlog> = service.getBlogs()

    @PostMapping
    fun addBlog(@RequestBody motorcycleBlog: MotorcycleBlog) = service.add(motorcycleBlog)
}