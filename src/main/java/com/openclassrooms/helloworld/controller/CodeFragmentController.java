package com.openclassrooms.helloworld.controller;

import com.openclassrooms.helloworld.model.CodeFragment;
import com.openclassrooms.helloworld.service.CodeFragmentService;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CodeFragmentController {

    @Autowired
    private CodeFragmentService codeService;

    /**
     * Create - Add a new piece of code
     * @PostMapping: envoie de donnée
     */
    @PostMapping("/createCodeFragment")
    public CodeFragment createCodeFragment(@RequestBody CodeFragment codeFragment) {
        return codeService.saveCodeFragment(codeFragment);
    }

    /**
     * Read - Get one piece of code by id
     * @GetMapping: lecture de donnée
     */
    @GetMapping("/codeFragment/{id}")
    public CodeFragment getCodeFragment(@PathVariable("id") final Long id) {
        Optional<CodeFragment> codeFragment = codeService.getCodeFragment(id);
        if(codeFragment.isPresent()) {
            return codeFragment.get();
        }
        else {
            return null;
        }
    }

    /**
     * Read - Get all pieces of code
     */
    @GetMapping("/codeFragments")
    public Iterable<CodeFragment> getAllCodeFragments() {
        return codeService.getCodeFragments();
    }

    /**
     * Delete - Delete a piece of code
     * @DeleteMapping: suppression de l'élément envoyé
     */
    @DeleteMapping("/deleteCodeFragment/{id}")
    public void deleteCodeFragment(@PathVariable("id") final Long id) {
        codeService.deleteCodeFragment(id);
    }

    /**
     * Update - Update an existing piece of code
     * @PutMapping: remplacement complet de l'élément envoyé
     */
    @PutMapping("/codeFragment/{id}")
    public CodeFragment updateCodeFragment(@PathVariable("id") final Long id, @RequestBody CodeFragment codeFragment) {
        Optional<CodeFragment> e = codeService.getCodeFragment(id);
        if(e.isPresent()) {
            CodeFragment currentCodeFrag = e.get();

            String code = codeFragment.getCode();
            if(code != null) {
                currentCodeFrag.setCode(code);
            }

            String language = codeFragment.getCode();
            if(language != null) {
                currentCodeFrag.setLanguage(language);
            }

            Long nbrLignes = codeFragment.getNbrLigne();
            if(nbrLignes != null) {
                currentCodeFrag.setNbrLigne(nbrLignes);
            }

            Long lineNumber = codeFragment.getLine_number();
            if(lineNumber != null) {
                currentCodeFrag.setLine_number(lineNumber);
            }
            codeService.saveCodeFragment(currentCodeFrag);
            return currentCodeFrag;
        } else {
            return null;
        }
    }
}
