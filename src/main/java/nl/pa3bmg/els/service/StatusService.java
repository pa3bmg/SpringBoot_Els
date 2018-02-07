package nl.pa3bmg.els.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import nl.pa3bmg.els.model.Status;

public interface StatusService {
	 Status save(Status book);

	 void delete(Status book);

	 Status findOne(String id);

	 Iterable<Status> findAll();

	 Page<Status> findByDeviceName(String devicename, PageRequest pageRequest);

	 List<Status> findByIP(String deviceip);
}
