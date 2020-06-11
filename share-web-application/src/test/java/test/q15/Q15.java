package test.q15;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * @author dingxiaotao
 * @date 2020/5/31
 */
public class Q15 {

    private static String initString;
    static {
        String currentString = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("a.txt"));
        }catch (IOException e) {
            throw new NoSuchElementException("file not found");
        }
    }

    public static void main(String[] args) {
       Q15 q15 = new Q15();

    }

}
