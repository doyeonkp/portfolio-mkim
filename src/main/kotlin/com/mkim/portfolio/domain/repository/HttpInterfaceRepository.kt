package com.mkim.portfolio.domain.repository

import com.mkim.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {
    fun countAllByCreatedTimeBetween(start: LocalDateTime, end: LocalDateTime): Long
}