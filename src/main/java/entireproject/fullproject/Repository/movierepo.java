package entireproject.fullproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entireproject.fullproject.model.movie;

public interface movierepo extends JpaRepository<movie,Long> {
    
}
