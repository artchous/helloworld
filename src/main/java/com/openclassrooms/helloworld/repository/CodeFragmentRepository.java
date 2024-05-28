package com.openclassrooms.helloworld.repository;

import com.openclassrooms.helloworld.model.CodeFragment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//But: communiquer avec la source de donnée
@Repository
public interface CodeFragmentRepository extends CrudRepository<CodeFragment, Long> {
}
