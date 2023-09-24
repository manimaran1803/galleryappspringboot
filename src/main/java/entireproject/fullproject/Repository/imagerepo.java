package entireproject.fullproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entireproject.fullproject.model.gallery;

public interface imagerepo extends JpaRepository<gallery,Long> {
    
}
