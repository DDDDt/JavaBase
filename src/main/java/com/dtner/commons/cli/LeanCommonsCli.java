package com.dtner.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * @program: Java-Base
 * @description: Commons Cli 初始
 * @author: dt
 * @create: 2021-11-16
 **/
public class LeanCommonsCli {

    /**
     * 实例：-name dt
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {

        // 定义阶段
        Options options = new Options();
        // 第一个参数表示，参数名，第二个表示是否需要参数，如果需要填 true，第三个表示描述
        options.addOption("name", true, "名称");

        // 解析阶段
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        // 审讯阶段
        if (cmd.hasOption("name")) {
            System.out.println(cmd.getOptionValue("name"));
        }


    }

}
