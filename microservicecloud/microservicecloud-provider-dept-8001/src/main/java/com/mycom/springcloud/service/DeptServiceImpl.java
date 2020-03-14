package com.mycom.springcloud.service;

import com.mycom.springcloud.dao.DeptMapper;
import com.mycom.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HeM
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept)
    {
        System.out.println("provider mapper " + dept);
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return deptMapper.findAll();
    }

}
