package pl.com.murach.springit.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.murach.springit.model.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
}
