/*
 * Copyright(C) 2019 FUYUN DATA SERVICES CO.,LTD. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * 该源代码版权归属福韵数据服务有限公司所有
 * 未经授权，任何人不得复制、泄露、转载、使用，否则将视为侵权
 */

package com.fybdp.jpademo;

import org.flywaydb.core.Flyway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * FlywayTest flyway测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class FlywayTest {

    private static final String URL = "jdbc:postgresql://172.19.79.8:26257/test4db?useUnicode=true&sslmode=require&characterEncoding=UTF-8";

    private static final String USERNAME = "fuyun";

    private static final String PASSWORD = "fuyun2019";

    @Test
    public void migrate() {
        Flyway flyway = Flyway.configure().dataSource(URL, USERNAME, PASSWORD).load();
        flyway.migrate();
    }

    /**
     * 该方法会清空数据库所有数据
     */
    @Test
    public void clean() {
        Flyway flyway = Flyway.configure().dataSource(URL, USERNAME, PASSWORD).load();
        flyway.clean();
    }

}
