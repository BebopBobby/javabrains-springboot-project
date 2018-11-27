package course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    private List<Course> courses = Arrays.asList(
            new Course("spring", "Spring Framework", "Spring Framework Description"),
            new Course("java", "Core Java", "Core Java Description"),
            new Course("javascript", "JavaScript", "JavaScript Description")
    );

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
        }

    public Course getCourse(String id){
    return courseRepository.findById(id).orElseGet(Course::new);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
