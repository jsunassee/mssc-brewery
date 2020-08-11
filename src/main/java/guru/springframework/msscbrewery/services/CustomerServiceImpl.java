package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerUUID) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jon")
                .build();
    }
}
