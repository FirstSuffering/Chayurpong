package nc.it.chayutpong.newton_ice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@JsonIgnoreProperties({"hibernatelazyInitializer", "handler"})
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ipAdress, name, location;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "camera")
    private List<Event> events;

    public Camera(String ipAdress, String name, String location) {
        this.ipAdress = ipAdress;
        this.name = name;
        this.location = location;
    }

}
