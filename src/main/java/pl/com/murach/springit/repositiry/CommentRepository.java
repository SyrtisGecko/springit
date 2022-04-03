package pl.com.murach.springit.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.murach.springit.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
