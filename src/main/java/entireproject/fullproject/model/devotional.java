package entireproject.fullproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class devotional {
    

       @Id

    private Long id;
    
  private String images;
  private String title;

public devotional(){
    
}


public Long getId() {
    return id;
}
public devotional(String images, String title) {
    this.images = images;
    this.title = title;
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

  
}
