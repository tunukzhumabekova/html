package peaksoft.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import peaksoft.model.Lesson;
import peaksoft.repository.LessonRepository;

import java.util.List;

@Repository
public class LessonRepoImpl implements LessonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveLesson(Lesson lesson) {

    }

    @Override
    public void updateLesson(long id, Lesson lesson) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Lesson getById(long id) {
        return null;
    }

    @Override
    public List<Lesson> getAllLessons() {
        return entityManager.createQuery("select l from Lesson l",Lesson.class).getResultList();
    }
}
