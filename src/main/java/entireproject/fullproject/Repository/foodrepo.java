package entireproject.fullproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entireproject.fullproject.model.foods;

public interface foodrepo extends JpaRepository<foods,Long> {
    
}
