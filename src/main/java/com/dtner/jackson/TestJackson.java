package com.dtner.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author dt
 * @description: 测试 jackson
 * @create 2022-07-01 15:57
 */
public class TestJackson {

    public static void main(String[] args) throws JsonProcessingException {

        String jsonString = "{\"name\":\"dt\",\"age\":18,\"list\":[{\"name\":\"dt1\",\"age\":19},{\"name\":\"dt2\",\"age\":20}]}";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);
        System.out.println(jsonNode.get("age").asText());
        System.out.println(jsonNode.size());
        System.out.println(jsonNode.get("list").size());

        // 对象转换
        Student student = objectMapper.readValue(jsonString, Student.class);
        System.out.println(student.getName());

        // 转换为对象集合
        String str = objectMapper.writeValueAsString(student.getList());
        System.out.println(str);
        List<Student> students = objectMapper.readValue(str, new TypeReference<List<Student>>() {});
        System.out.println(students.size());
        System.out.println(students.get(0).getName());


    }

}
