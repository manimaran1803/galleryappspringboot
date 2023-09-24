package entireproject.fullproject.model;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class gallery {
    @Id

    private Long id;
    
  private String images;

  private String title;

  private String Genere;

  private String description;

public gallery(){

}




public gallery(String images, String title, String genere, String description) {
    this.images = images;
    this.title = title;
    Genere = genere;
    this.description = description;
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

public String getGenere() {
    return Genere;
}

public void setGenere(String genere) {
    Genere = genere;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}



  

}
