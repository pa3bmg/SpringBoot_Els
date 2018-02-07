package nl.pa3bmg.els.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import nl.pa3bmg.els.model.Book;
import nl.pa3bmg.els.model.Status;
import nl.pa3bmg.els.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {
	
	private StatusRepository statusRepository;
	
	public StatusServiceImpl(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}
	
	@Override
	public Status save(Status status) {
		return statusRepository.save(status);
	}

	@Override
	public void delete(Status status) {
		statusRepository.delete(status);
	}

	@Override
	public Status findOne(String id) {
		return statusRepository.findById(id).get();
	}

	@Override
	public Iterable<Status> findAll() {
		System.out.println("Status findAll");
		List<Status> statuss = new ArrayList<>();
		Iterable<Status> result = statusRepository.findAll();
		result.forEach(statuss::add);
		for (Status status : statuss) {
			System.out.println(status.getId() + " " + status.getDeviceIp() + " "+status.getDeviceName());
		}
		return result;
	}

	@Override
	public Page<Status> findByDeviceName(String devicename, PageRequest pageRequest) {
		return statusRepository.findByDeviceName(devicename, pageRequest);
	}

	@Override
	public List<Status> findByIP(String deviceip) {
		return statusRepository.findByDeviceIp(deviceip);
	}

}
