package entireproject.fullproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class movie {
    
       @Id

    private Long id;
    
  private String images;


  public movie(){
    
  }

  public movie(String images, String title) {
    this.images = images;
    this.title = title;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getImages() {
    return images;
}
public void setImages(String images) {
    this.images = images;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
private String title;
}
