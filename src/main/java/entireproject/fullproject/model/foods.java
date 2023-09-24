package entireproject.fullproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class foods {
    

       @Id

    private Long id;
    
  public foods(String images, String title) {
        this.images = images;
        this.title = title;
    }
private String images;
  private String title;


public foods(){
    
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

  
}
