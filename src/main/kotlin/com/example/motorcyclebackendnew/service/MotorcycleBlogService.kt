package com.example.motorcyclebackendnew.service

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import com.example.motorcyclebackendnew.repository.MotorcycleBlogRepository
import org.springframework.stereotype.Service

@Service
class MotorcycleBlogService(val db: MotorcycleBlogRepository) {

    fun getBlogs(): List<MotorcycleBlog> = db.getBlogs()

}