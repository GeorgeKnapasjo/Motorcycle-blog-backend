package com.example.motorcyclebackendnew.controller

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import com.example.motorcyclebackendnew.service.MotorcycleBlogService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class MotorcycleBlogController (val service: MotorcycleBlogService){

    @GetMapping("Blogs")
    @CrossOrigin
    fun getBlogs(): List<MotorcycleBlog> = service.getBlogs()

    @PostMapping("Blogs")
    @CrossOrigin
    fun addBlog(@RequestBody motorcycleBlog: MotorcycleBlog) = service.add(motorcycleBlog)

    @GetMapping("/Blogpost")
    @CrossOrigin
    fun getBlog(@RequestParam title: String) = service.getBlog(title)
}