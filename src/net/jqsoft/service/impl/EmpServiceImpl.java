package net.jqsoft.service.impl;

import net.jqsoft.domain.Emp;
import net.jqsoft.mapper.EmpMapper;
import net.jqsoft.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        System.out.println("================"+empMapper+"================");
        return empMapper.findAll();
    }
}
