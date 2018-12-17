package com.optimusprime.web_services_srping_boot.services;

import com.optimusprime.web_services_srping_boot.api.domain.User;
import com.optimusprime.web_services_srping_boot.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class AplServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public AplServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
        return userData.getData();
    }
}
