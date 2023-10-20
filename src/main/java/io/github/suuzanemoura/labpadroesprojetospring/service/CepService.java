package io.github.suuzanemoura.labpadroesprojetospring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.suuzanemoura.labpadroesprojetospring.model.Address;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface CepService {

    @GetMapping("/{cep}/json/")
    Address findCep(@PathVariable("cep") String cep);
}
