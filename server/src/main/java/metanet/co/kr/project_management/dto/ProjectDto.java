package metanet.co.kr.project_management.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = true)
@Data
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

    
}
