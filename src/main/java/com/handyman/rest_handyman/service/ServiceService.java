package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.Service;
import com.handyman.rest_handyman.model.User;

import java.util.List;

public interface ServiceService {
    //all methods to be implemented for business layer

    public String createService(Service service);
    public String updateService(Service service);
    public String deleteService(String serviceId);
    public Service getService(String serviceId);
    public List<Service> getServicesByUserId(String userId);
    public List<Service> getServicesByCategory(String category);
    public List<Service> getAllServices();
}
