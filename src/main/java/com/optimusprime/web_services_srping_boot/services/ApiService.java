package com.optimusprime.web_services_srping_boot.services;

import com.optimusprime.web_services_srping_boot.api.domain.User;

import java.util.List;

public interface ApiService {
  List<User> getUsers(Integer limit);
}
