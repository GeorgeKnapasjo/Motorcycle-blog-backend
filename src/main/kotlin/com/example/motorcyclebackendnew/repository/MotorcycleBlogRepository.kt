package com.example.motorcyclebackendnew.repository

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MotorcycleBlogRepository : CrudRepository<MotorcycleBlog, String> {

    @Query(value = "select * from vouchers", nativeQuery = true)
    fun getBlogs(): List<MotorcycleBlog>

//    @Query(value = "select * from vouchers where id", nativeQuery = true)
//    fun getBlogs(): List<MotorcycleBlog>
}
