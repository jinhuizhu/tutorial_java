package com.zjh.learning.java8.lamda;
/**
 * Copyright (c) Jinhui Zhu (jinhuizhu@gmail.com)
 * All rights reserved.
 */

import java.io.File;
import java.io.FileFilter;

/**
 * @author Jinhui Zhu (jinhuizhu@gmail.com)
 * created at:  6/22/2018 10:41 PM
 */
public class FirstLamda {
    public static void main(String[] args) {
        FileFilter filter = (File pathName) -> pathName.getName().endsWith(".java");

        File dir = new File("E:/GitRepo");
        File[] files = dir.listFiles(filter);

        for (File f: files) {
            System.out.println(f);
        }
    }
}
