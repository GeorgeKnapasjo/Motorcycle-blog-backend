package com.example.motorcyclebackendnew.repository

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface MotorcycleBlogRepository : CrudRepository<MotorcycleBlog, String> {

    @Query(value = "select * from blogs", nativeQuery = true)
    fun getBlogs(): List<MotorcycleBlog>

    @Query(value = "select * from blogs where id = :id", nativeQuery = true)
    fun getBlog(
        @Param("id") id: String
    ): MotorcycleBlog
}
