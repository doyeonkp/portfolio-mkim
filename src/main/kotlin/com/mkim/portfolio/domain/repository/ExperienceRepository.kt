package com.mkim.portfolio.domain.repository

import com.mkim.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface ExperienceRepository : JpaRepository<Experience, Long> {
    fun findAllByIsActive(isActive: Boolean): List<Experience>
}