package metanet.co.kr.project_management.entity;

import lombok.Setter;

import javax.persistence.*;

@Setter
@Entity
@Table(name = "projects")
public class Project extends BaseEntity {
    @Column
    private String name;

//    @OneToOne
//    @JoinColumn(name = "owner")
//    private User owner;

    @Column
    private String owner;
}
