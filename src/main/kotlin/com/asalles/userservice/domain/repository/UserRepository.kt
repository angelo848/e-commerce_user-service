package com.asalles.userservice.domain.repository

import com.asalles.userservice.domain.model.User

interface UserRepository {

    fun save(user: User)

    fun findById(id: Long): User?

    fun findByEmail(email: String): User?

    fun existsByEmail(email: String): Boolean

    fun delete(user: User)

    fun update(user: User)
}