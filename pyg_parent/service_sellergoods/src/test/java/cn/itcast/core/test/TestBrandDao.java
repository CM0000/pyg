package cn.itcast.core.test;

import cn.itcast.core.dao.good.BrandDao;
import cn.itcast.core.pojo.good.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class TestBrandDao {
    @Autowired
    private BrandDao brandDao;

    @Test
    public void testfindBrandById(){
        Brand brand = brandDao.selectByPrimaryKey(1L);
        System.out.println("====="+brand);


    }
}
