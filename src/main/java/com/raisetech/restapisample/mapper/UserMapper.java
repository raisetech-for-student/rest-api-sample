package com.raisetech.restapisample.mapper;

import com.raisetech.restapisample.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE name = #{name}")
    List<User> findByName(String name);

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(int id);

    @Insert("INSERT INTO users (name, birthdate, address) VALUES (#{name}, #{birthdate}, #{address})")
    void save(String name, LocalDate birthdate, String address);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(int id);


}
