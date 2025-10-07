package daw2.dwes.morty1.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "episodes")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "episode_name", nullable = false, length = 255)
    private String name;

    @Column(name = "air_date", length = 255)
    private String airDate;

    @Column(name = "episode_code", length = 255)
    private String episodeCode;
}