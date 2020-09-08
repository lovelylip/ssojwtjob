package sso.jwt.jobme.repository;

import sso.jwt.jobme.domain.Upload;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Spring Data Cassandra repository for the Upload entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UploadRepository extends CassandraRepository<Upload, UUID> {
}
