package com.raulsorrentino.contentcalendar.repository;

import com.raulsorrentino.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
