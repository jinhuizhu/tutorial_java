package com.zjh.learning.jse.collections;

import com.zjh.learning.jse.collections.list.AllListUnitTests;
import com.zjh.learning.jse.collections.set.AllSetUnitTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by jinhui on 10/9/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllListUnitTests.class,
        AllSetUnitTests.class
})
public class AllCollectionsUnitTests {
}
