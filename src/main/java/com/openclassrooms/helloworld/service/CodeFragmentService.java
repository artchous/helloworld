package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.CodeFragment;
import com.openclassrooms.helloworld.repository.CodeFragmentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class CodeFragmentService {

    //https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html

    @Autowired
    private CodeFragmentRepository fragmentRepository;

    public Optional<CodeFragment> getCodeFragment( Long id) {
        return fragmentRepository.findById(id);
    }

    public Iterable<CodeFragment> getCodeFragments() {
        return fragmentRepository.findAll();
    }

    public void deleteCodeFragment(final Long id) {
        fragmentRepository.deleteById(id);
    }

    public CodeFragment saveCodeFragment(CodeFragment codeFragment) {
        CodeFragment savedCode = fragmentRepository.save(codeFragment);
        return savedCode ;
    }
}
