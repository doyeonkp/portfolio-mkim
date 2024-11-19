package com.mkim.portfolio.presentation.dto

import com.mkim.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content: String,
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}