package com.mkim.portfolio.domain.repository

import com.mkim.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long> {

    //select * from project _skill where project_id = :projectId and skill_id = :skillId
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>
}