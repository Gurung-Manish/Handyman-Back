package com.handyman.rest_handyman.impl;

import com.handyman.rest_handyman.model.Service;
import com.handyman.rest_handyman.repository.ServiceRepository;
import com.handyman.rest_handyman.service.ServiceService;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    ServiceRepository serviceRepository;

    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public String createService(Service service) {
        serviceRepository.save(service);
        return "Success to save service";
    }

    @Override
    public String updateService(Service service) {
        serviceRepository.save(service);
        return "Success to update service";
    }

    @Override
    public String deleteService(String serviceId) {
        serviceRepository.deleteById(serviceId);
        return "Success to delete service by Id: "+serviceId;
    }

    @Override
    public Service getService(String serviceId) {
        return serviceRepository.findById(serviceId).get();
    }

    @Override
    public List<Service> getServicesByUserId(String userId) {
        return serviceRepository.findByServiceProviderUserId(userId);
    }

    @Override
    public List<Service> getServicesByCategory(String category) {
        return serviceRepository.findByCategory(category);
    }

    @Override
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}
