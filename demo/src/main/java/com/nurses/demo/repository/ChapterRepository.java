package com.nurses.demo.repository;

import com.nurses.demo.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository <Chapter, Long> {
}
