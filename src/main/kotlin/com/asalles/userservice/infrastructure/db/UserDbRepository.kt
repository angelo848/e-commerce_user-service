package com.asalles.userservice.infrastructure.db

import com.asalles.userservice.domain.model.User
import com.asalles.userservice.domain.repository.UserRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDbRepository : JpaRepository<User, Long>, UserRepository {
}