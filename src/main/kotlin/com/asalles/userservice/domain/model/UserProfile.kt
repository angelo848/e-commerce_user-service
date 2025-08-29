package com.asalles.userservice.domain.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.PrimaryKeyJoinColumn
import jakarta.persistence.Table
import java.time.Instant
import java.time.LocalDate

@Entity
@Table(name = "user_profile")
class UserProfile(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    val user: User? = null,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "birth_date")
    val birthDate: LocalDate,

    @Column(name = "phone_number")
    val phoneNumber: String,

    @Column(name = "document")
    val document: String,

    @Column(name = "created_at", updatable = false)
    val createdAt: Instant,

    @Column(name = "updated_at")
    val updatedAt: Instant = Instant.now(),
)
