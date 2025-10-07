package daw2.dwes.morty1.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "characters")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "character_name", nullable = false, length = 255)
    private String name;

    @Column(name = "status", length = 255)
    private String status;

    @Column(name = "species", length = 255)
    private String species;

    @Column(name = "character_type", nullable = false, length = 255)
    private String type;

    @Column(name = "gender", length = 255)
    private String gender;

    @Column(name = "location_id", length = 255)
    private String dimension;

    @Column(name = "image_url", nullable = false, length = 255)
    private String image;

    @Column(name = "weight", length = 255)
    private String weight;

    @Column(name = "height", length = 255)
    private String height;
}
