package TripSync.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TripSync.mapper.AutoNumMapper;

@Service
public class AutoNumService {
	@Autowired
	AutoNumMapper autoNumMapper;
	public String execute(String sep, Integer len, String col, String table) {
		String autoNum = autoNumMapper.AutoNumSelect(sep, len, col, table);
		return autoNum;
	}

}
