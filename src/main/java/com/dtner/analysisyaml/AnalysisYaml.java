package com.dtner.analysisyaml;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

/**
 * @program: Java-Base
 * @description: 解析 yaml
 * @author: dt
 * @create: 2022-01-21
 **/
public class AnalysisYaml {

    public static void main(String[] args) {

        InputStream resourceAsStream = AnalysisYaml.class.getClassLoader()
                .getResourceAsStream("application.yml");

        Yaml yaml = new Yaml();
        Map map = yaml.loadAs(resourceAsStream, Map.class);

        map.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println("------");
        });

    }

}
