package com.mycom.springcloud.controller;

import com.mycom.springcloud.entity.Dept;
import com.mycom.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HeM
 */
@RestController()
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/list")
    public List<Dept> getDeptList() {
        return deptService.list();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        System.out.println("provider controller " + dept);
        return deptService.add(dept);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

}
