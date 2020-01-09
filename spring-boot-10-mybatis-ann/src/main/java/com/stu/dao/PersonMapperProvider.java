package com.stu.dao;

import com.stu.entity.Person;
import org.apache.ibatis.jdbc.SQL;

/**
 * @desc 使用 mapper 动态sql 语句来执行sql
 */
public class PersonMapperProvider {

    public String getUpdateOneSql(Person p) {
        return new SQL() {
            {
                UPDATE("t_person");
                SET("name=#{name}");
                if (p.getAge() != null && p.getAge() > 0) {
                    SET("age = #{age}");
                }
                WHERE("id = #{id}");
            }
        }.toString();
    }
}
