package metanet.co.kr.project_management.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@AllArgsConstructor
public class ProjectDto extends BaseDto {
    ProjectDto() {
        super();
    }

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 2047)
    private String description;

    public Date startDate;
    public String owner;

    public ProjectDto(int id, String name) {
        super();
    }

    public String getName() {
        return name;
    }
}
