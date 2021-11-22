package cn.wolfcode.mybatis_plus_hello.mapper;

import cn.wolfcode.mybatis_plus_hello.domain.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author WaveHi
 * @Date 22/11/2021 下午 9:01
 * @Version 1.0
 * @Contact HJBWaveHi@163.com
 */
@SpringBootTest
class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void list() {
        List<Department> departments = departmentMapper.selectList(null);
        for (Department department : departments) {
            System.out.println(department);
        }
    }

}