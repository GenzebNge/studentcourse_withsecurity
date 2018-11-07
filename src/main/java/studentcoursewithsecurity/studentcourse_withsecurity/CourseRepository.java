package studentcoursewithsecurity.studentcourse_withsecurity;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

    Course findByTitle(String title);
    Long countByTitle(String title);
}
