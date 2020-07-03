package metanet.co.kr.project_management.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "projects")
@NoArgsConstructor
public class Project extends BaseEntity {
    @Column
    private String name;

    @Column
    private String description;

    private Date started_date;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}
