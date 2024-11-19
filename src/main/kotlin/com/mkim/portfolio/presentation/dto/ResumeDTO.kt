package com.mkim.portfolio.presentation.dto

import com.mkim.portfolio.domain.entity.Achievement
import com.mkim.portfolio.domain.entity.Experience
import com.mkim.portfolio.domain.entity.Skill
import java.time.format.DateTimeFormatter

class ResumeDTO(
    experiences: List<Experience>,
    achievement: List<Achievement>,
    skills: List<Skill>
) {
    var experiences: List<ExperienceDTO> = experiences.map {
        ExperienceDTO(
            title = it.title,
            description = it.description,
            startYearMonth = "${it.startYear}.${it.startMonth}",
            endYearMonth = it.getEndYearMonth(),
            details = it.details.filter { it.isActive }.map { it.content }
        )
    }
    var achievement: List<AchievementDTO> = achievement.map {
        AchievementDTO(
            title = it.title,
            description = it.description,
            host = it.host,
            achieveDate = it.achievedDate
                ?.format(DateTimeFormatter.ISO_LOCAL_DATE)
                ?.replace("-", ".")
        )
    }
    var skills: List<SkillDTO> = skills.map {
        SkillDTO(it)
    }
}