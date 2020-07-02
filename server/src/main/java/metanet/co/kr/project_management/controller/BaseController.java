package metanet.co.kr.project_management.controller;

import metanet.co.kr.project_management.dto.BaseDto;
import metanet.co.kr.project_management.service.BaseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<D extends BaseDto, SV extends BaseService> {
    private BaseService service;

    protected BaseController(BaseService service) {
        this.service = service;
    }

    @PostMapping
    public D add(@RequestBody D dto) {
        return (D) service.add(dto);
    }

    @PutMapping("/{id}")
    public D update(@PathVariable("id") Long id, @RequestBody D dto) {
//        dto.setId(id);
        return (D) service.update(dto);
    }

}
