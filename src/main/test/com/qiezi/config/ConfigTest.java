package com.qiezi.config;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Daniel on 3/21/16.
 */
public class ConfigTest extends BaseTest {

    @Autowired
    private Config config;

    @Test
    public void testGetServers() throws Exception {
        System.out.println(config.getServers());
    }
}