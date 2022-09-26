package cn.lhx.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        byte[] a= "".getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(a));
    }

}
