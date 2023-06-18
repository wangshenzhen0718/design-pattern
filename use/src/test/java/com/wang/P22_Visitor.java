package com.wang;

import com.wang.p22_visitor.DataView;
import com.wang.p22_visitor.visitor.impl.Parent;
import com.wang.p22_visitor.visitor.impl.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class P22_Visitor {
    private Logger logger = LoggerFactory.getLogger(P22_Visitor.class);

    @Test
    public void test(){
        DataView dataView = new DataView();

        logger.info("\r\n家长视角访问：");
        dataView.show(new Parent());     // 家长

        logger.info("\r\n校长视角访问：");
        dataView.show(new Principal());  // 校长
    }

}
