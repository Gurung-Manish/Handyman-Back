package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.Service;
import com.handyman.rest_handyman.service.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {
    ServiceService service;

    public ServiceController(ServiceService service) {
        this.service = service;
    }

    @GetMapping("{serviceId}")
    public Service getServiceDetails(@PathVariable("serviceId") String serviceId){
        return service.getService(serviceId);
    }

    @GetMapping
    public List<Service> getAllServices(){
        return service.getAllServices();
    }

    @GetMapping("/user/{userId}")
    public List<Service> getServiceByUserId(@PathVariable("userId") String userId){
        return service.getServicesByUserId(userId);
    }

    @GetMapping("category/{category}")
    public List<Service> getServiceByCategory(@PathVariable("category") String category){
        return service.getServicesByCategory(category);
    }

    @PostMapping
    public String createService(@RequestBody Service serviceObj){
        service.createService(serviceObj);
        return "Service Created Successfully";
    }

    @PutMapping
    public String updateService(@RequestBody Service serviceObj){
        service.updateService(serviceObj);
        return "Service Updated Successfully";
    }

    @DeleteMapping("{serviceId}")
    public String deleteService(@PathVariable String serviceId){
        service.deleteService(serviceId);
        return "Service Deleted Successfully";
    }
}
