package metanet.co.kr.project_management.service.impl;

import metanet.co.kr.project_management.dto.ProjectDto;
import metanet.co.kr.project_management.entity.Project;

import metanet.co.kr.project_management.entity.User;
import metanet.co.kr.project_management.repository.ProjectRepo;
import metanet.co.kr.project_management.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectDto, Project, ProjectRepo>  implements ProjectService {

    private final ProjectRepo projectRepo;
//    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepo projectRepo, ModelMapper modelMapper) {
            super(projectRepo);
            this.projectRepo = projectRepo;
            this.modelMapper = modelMapper;
    }

    @Override
    public ProjectDto add(ProjectDto dto) {
        Project project = toEntity(dto);
        project = this.projectRepo.save(project);
        return toDTO(project);
    }

    @Override
    public ProjectDto update(ProjectDto dto) {
        Project entity = findEntityById(dto.getId());
//        User owner = getUser;
        entity = toEntity(dto);
//        entity.setOwner(owner);
        entity = this.projectRepo.save(entity);
        return toDTO(entity);


//        Optional<Project> foundProject = this.projectRepo.findById(dto.getId());
    }

//    private User getUserById(Long id) {
//        return
//    }

    @Override
    protected ProjectDto toDTO(Project project) {
        return modelMapper.map(project, ProjectDto.class);
    }

    @Override
    protected Project toEntity(ProjectDto dto) {
        return this.modelMapper.map(dto, Project.class);
    }

    @Override
    public List<ProjectDto> findAll() {
        return null;
    }

    @Override
    public ProjectDto find(Long id) {
        return null;
    }

    @Override
    public boolean isExist(Long id) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

}
