package com.learningUnitTesting.services.impl;

import com.learningUnitTesting.services.DataService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdDataServiceImpl implements DataService {
    @Override
    public String getData() {
        return "Prod";
    }
}
