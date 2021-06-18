package com.codegym.service.impl;

import com.codegym.model.Book;
import com.codegym.model.Code;
import com.codegym.model.Status;
import com.codegym.repository.BookRepository;
import com.codegym.repository.CodeRepository;
import com.codegym.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl  implements CodeService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CodeRepository codeRepository;

    @Override
    public List<Code> findAll() {
        return this.codeRepository.findAll();
    }

    @Override
    public Code findById(Integer id) {
        return codeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Code code) {
        codeRepository.save(code);
    }

    @Override
    public List<Code> findAllCodeByBookId(Integer id) {
        return codeRepository.findCodeByBook_Id(id);
    }

    @Override
    public List<Code> findAvailableCodeByBookId(Integer id) {
        return codeRepository.findCodeByBook_IdAndStatus_Id(id, 1);
    }

    @Override
    public List<Code> findUsedCodeByBookId(Integer id) {
        return codeRepository.findCodeByBook_IdAndStatus_Id(id, 2);
    }

    @Override
    public void returnBookByCode(Book book, Integer returnCodeId) {
        Code code=codeRepository.findById(returnCodeId).orElse(null);
        book =code.getBook();
        book.returnBook();
        bookRepository.save(book);
        code.setStatus(new Status(1, "available"));
    }


}
