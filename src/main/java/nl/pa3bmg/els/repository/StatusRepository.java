package nl.pa3bmg.els.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import nl.pa3bmg.els.model.Status;

public interface StatusRepository extends ElasticsearchRepository<Status, String> {
	Page<Status> findByDeviceName(String DeviceName, Pageable pageable);

    List<Status> findByDeviceIp(String DeviceIp);
}

