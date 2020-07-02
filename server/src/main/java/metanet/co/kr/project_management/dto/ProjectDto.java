package metanet.co.kr.project_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Setter
@Getter
@AllArgsConstructor
public class ProjectDto extends BaseDto {
    public ProjectDto(int id, String name) {
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

    public String getName() {
        return name;
    }
}
