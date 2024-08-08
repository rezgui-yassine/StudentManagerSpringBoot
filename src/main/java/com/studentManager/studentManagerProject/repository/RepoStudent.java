package com.studentManager.studentManagerProject.reposotery;

import com.studentManager.studentManagerProject.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoStudent extends JpaRepository<Student, Integer> {
}