package com.example.motorcyclebackendnew.service

import com.example.motorcyclebackendnew.domain.MotorcycleBlog
import com.example.motorcyclebackendnew.repository.MotorcycleBlogRepository
import org.springframework.stereotype.Service

@Service
class MotorcycleBlogService(val db: MotorcycleBlogRepository) {

    private val initialData = listOf(
        MotorcycleBlog("test1", "Test blog 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eget aliquet libero. Maecenas efficitur nec velit sit amet rhoncus. Mauris interdum tellus magna, eget sagittis risus ultrices nec. Aenean nulla neque, congue vitae aliquet non, imperdiet eu dolor. Orci varius."),
        MotorcycleBlog("test2", "Test blog 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eget aliquet libero. Maecenas efficitur nec velit sit amet rhoncus. Mauris interdum tellus magna, eget sagittis risus ultrices nec. Aenean nulla neque, congue vitae aliquet non, imperdiet eu dolor. Orci varius."),
        MotorcycleBlog("test3", "Test blog 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eget aliquet libero. Maecenas efficitur nec velit sit amet rhoncus. Mauris interdum tellus magna, eget sagittis risus ultrices nec. Aenean nulla neque, congue vitae aliquet non, imperdiet eu dolor. Orci varius."),
        MotorcycleBlog("test4", "Test blog 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin eget aliquet libero. Maecenas efficitur nec velit sit amet rhoncus. Mauris interdum tellus magna, eget sagittis risus ultrices nec. Aenean nulla neque, congue vitae aliquet non, imperdiet eu dolor. Orci varius."),
    )

    fun getBlogs(): List<MotorcycleBlog> = db.getBlogs()
    fun add(motorcycleBlog: MotorcycleBlog) {
//        try{
        initialData.forEach{db.save(it)}
        db.save(motorcycleBlog)
//        } catch (err:IllegalArgumentException) {
//            println(" ")
//            println(" ")
//            println(err)
//        }
    }

    fun getBlog(title: String): MotorcycleBlog = db.getBlog(title)

}
