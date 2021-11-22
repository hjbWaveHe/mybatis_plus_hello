package cn.wolfcode.mybatis_plus_hello.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description
 * @Author WaveHi
 * @Date 22/11/2021 下午 9:53
 * @Version 1.0
 * @Contact HJBWaveHi@163.com
 */
@Getter
@Setter
@ToString
public class Employee {
    private Long id;
    private String name;
    private String password;
    private String email;
    private Boolean admin;
    private Integer age;
    private Long deptId;
}
