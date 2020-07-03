package metanet.co.kr.project_management.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class ProjectDto extends BaseDto {
    ProjectDto() {
        super();
    }

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private Date started_date;
}
