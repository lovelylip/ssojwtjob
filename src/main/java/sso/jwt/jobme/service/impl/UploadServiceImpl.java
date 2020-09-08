package sso.jwt.jobme.service.impl;

import sso.jwt.jobme.service.UploadService;
import sso.jwt.jobme.domain.Upload;
import sso.jwt.jobme.repository.UploadRepository;
import sso.jwt.jobme.service.dto.UploadDTO;
import sso.jwt.jobme.service.mapper.UploadMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Upload}.
 */
@Service
public class UploadServiceImpl implements UploadService {

    private final Logger log = LoggerFactory.getLogger(UploadServiceImpl.class);

    private final UploadRepository uploadRepository;

    private final UploadMapper uploadMapper;

    public UploadServiceImpl(UploadRepository uploadRepository, UploadMapper uploadMapper) {
        this.uploadRepository = uploadRepository;
        this.uploadMapper = uploadMapper;
    }

    @Override
    public UploadDTO save(UploadDTO uploadDTO) {
        log.debug("Request to save Upload : {}", uploadDTO);
        Upload upload = uploadMapper.toEntity(uploadDTO);
        upload = uploadRepository.save(upload);
        return uploadMapper.toDto(upload);
    }

    @Override
    public List<UploadDTO> findAll() {
        log.debug("Request to get all Uploads");
        return uploadRepository.findAll().stream()
            .map(uploadMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    @Override
    public Optional<UploadDTO> findOne(UUID id) {
        log.debug("Request to get Upload : {}", id);
        return uploadRepository.findById(id)
            .map(uploadMapper::toDto);
    }

    @Override
    public void delete(UUID id) {
        log.debug("Request to delete Upload : {}", id);
        uploadRepository.deleteById(id);
    }
}
