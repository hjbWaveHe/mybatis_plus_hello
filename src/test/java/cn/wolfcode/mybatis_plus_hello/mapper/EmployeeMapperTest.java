package cn.wolfcode.mybatis_plus_hello.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author WaveHi
 * @Date 22/11/2021 下午 9:54
 * @Version 1.0
 * @Contact HJBWaveHi@163.com
 */
@SpringBootTest
class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    void list() {
        System.out.println(employeeMapper.selectList(null));
    }

}