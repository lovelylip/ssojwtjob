package sso.jwt.jobme.service.mapper;


import sso.jwt.jobme.domain.*;
import sso.jwt.jobme.service.dto.UploadDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Upload} and its DTO {@link UploadDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface UploadMapper extends EntityMapper<UploadDTO, Upload> {


}
