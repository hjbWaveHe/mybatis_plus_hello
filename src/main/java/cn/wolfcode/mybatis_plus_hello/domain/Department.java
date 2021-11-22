package cn.wolfcode.mybatis_plus_hello.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description
 * @Author WaveHi
 * @Date 22/11/2021 下午 8:52
 * @Version 1.0
 * @Contact HJBWaveHi@163.com
 */
@Getter
@Setter
@ToString
public class Department {

    private Long id;
    private String name;
    private String sn;
}
