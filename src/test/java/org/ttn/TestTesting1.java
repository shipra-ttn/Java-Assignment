package org.ttn;

//package org.ttn;

import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class TestTesting1 {


    public class TestTesting {
        //public static void main(String[] args) {


        @Test
        public void testsum(){
            int result= org.ttn.Test1.sum(2,6);
            Assert.assertEquals(8, result);
        }

    }
}
