package com.clickconcepts.jira;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This is a marker annotation that will signify which JIRA Test Case the automated test is for.  When hooked up, the results will be transferred to JIRA.  If all of the same number pass, success, if one ore more fail, then failure
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface TestCase {

    /**
     * Links back to a test case in JIRA
     *
     * @return
     */
    String value();
}
