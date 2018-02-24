package com.example.denis.mockrf;


import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.appflate.restmock.RESTMockServer;

import static io.appflate.restmock.utils.RequestMatchers.pathContains;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest extends InstrumentationTestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class, true, false);

    @Test
    public void mainActivityTest() {
    }

    @Before
    public void setUp() throws Exception {
        RESTMockServer.reset();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void testRest() throws Exception {
        //RESTMockServer.whenGET(pathContains("/bins/4n2xe")).thenReturnString(200,  "{\"succes\":1,\"token\":\"qweqwe\",\"error\":\"\"}");
        RESTMockServer.whenGET(pathContains("/bins/4n2xe")).thenReturnFile(200, "default.json");
        mActivityTestRule.launchActivity(null);
    }


}
