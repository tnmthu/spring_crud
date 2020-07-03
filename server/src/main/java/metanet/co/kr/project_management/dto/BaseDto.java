package metanet.co.kr.project_management.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public abstract class BaseDto implements Serializable {
    private Long id;
}
