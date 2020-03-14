package com.mycom.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author HeM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptNo;
    private String dName;
    private String dbSource; // 来自哪个数据库

    public Dept(String dName) {
        this.dName = dName;
    }

}
