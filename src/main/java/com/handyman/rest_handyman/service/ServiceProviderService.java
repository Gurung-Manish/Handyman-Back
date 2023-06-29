package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.ServiceProvider;

import java.util.List;

public interface ServiceProviderService {

    public String createServiceProvider(ServiceProvider serviceProvider);
    public String updateServiceProvider(ServiceProvider serviceProvider);
    public String deleteServiceProvider(String serviceProviderId);
    public ServiceProvider getServiceProvider(String serviceProviderId);
    public List<ServiceProvider> getAllServiceProvider();
}
