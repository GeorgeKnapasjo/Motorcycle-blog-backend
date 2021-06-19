package com.example.motorcyclebackendnew.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="BLOGS")
data class MotorcycleBlog (
    @Id
    val id: String,
    val title: String,
    val content: String,

)