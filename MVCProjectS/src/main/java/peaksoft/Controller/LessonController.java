package peaksoft.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.Service.LessonService;

@Controller
@RequestMapping("/lessons")
@RequiredArgsConstructor
public class LessonController {
    private final LessonService lessonService;
    @GetMapping
    public String getAllLessons(Model model){
       model.addAttribute("getAllLessons", lessonService.getAllLessons());
        return "lessons";
    }
}
