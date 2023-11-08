package peaksoft.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.Service.LessonService;
import peaksoft.model.Lesson;
import peaksoft.repository.LessonRepository;

import java.util.List;
@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;

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
        return lessonRepository.getAllLessons();
    }
}
