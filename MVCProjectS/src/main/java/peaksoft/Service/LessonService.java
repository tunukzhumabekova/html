package peaksoft.Service;

import peaksoft.model.Lesson;

import java.util.List;

public interface LessonService {
    void saveLesson(Lesson lesson);
    void updateLesson(long id,Lesson lesson);
    void delete(long id);
    Lesson getById(long id);
    List<Lesson> getAllLessons();
}
