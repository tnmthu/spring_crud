package metanet.co.kr.project_management.service.impl;

import metanet.co.kr.project_management.dto.ProjectDto;
import metanet.co.kr.project_management.entity.Project;

import metanet.co.kr.project_management.repository.ProjectRepo;
import metanet.co.kr.project_management.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectDto, Project, ProjectRepo>  implements ProjectService {

    private final ProjectRepo projectRepo;
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
        System.out.println(project);
        return toDTO(project);
    }

    @Override
    public ProjectDto update(ProjectDto dto) {
//        Optional<Project> foundProject = this.projectRepo.findById(dto.getId());
        return null;
    }

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
//
//    @Override
//    public int updateProjectById(int id, ProjectDto newProject) {
//        return selectProjectById(id)
//                .map(project -> {
//                    int indexOfProjectUpdate = DB.indexOf(project);
//                    boolean isProjectExisted = checkIsExisted(project, DB);
//                    if (isProjectExisted) {
//                        DB.set(indexOfProjectUpdate, new ProjectDto(id, newProject.getName()));
//                        return 1;
//                    }
//                    return 0;
//                })
//                .orElse(0);
    //    public Optional<ProjectDto> selectProjectById(int id) {
//        return DB.stream()
//                .filter(project -> project.getId() == id)
//                .findFirst();
//    }
//
//    public int deleteProjectById(int id) {
//        Optional<ProjectDto> projectTemp = selectProjectById(id);
//        if (projectTemp == null) {
//            return 0;
//        }
//        DB.remove(projectTemp.get());
//        return 1;
//    }
//
//    public boolean checkIsExisted(ProjectDto project, List<ProjectDto> projectList) {
//        int index = projectList.indexOf(project);
//        if (index >= 0) {
//            return true;
//        }
}
