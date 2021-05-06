package org.example;

public class Immutable {
    //All class variables final
    private final String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public FinalTest getFinalTest() {
        return finalTest;
    }

    final int age;
    final FinalTest finalTest;

    public Immutable(String name, int age, FinalTest finalTest) {
        //intentionally instantiating name with new Name to test that objects are different in test
        this.name = new String(name);
        this.age = age;
        this.finalTest = finalTest;
    }

    static class FinalTest{
        FinalTest(String testName) {
            this.testName = testName;
        }

        public String getTestName() {
            return testName;
        }

        /** Immutable main classes should not have static inner classes which can set variables*/
//        public void setTestName(String testName) {
//            this.testName = testName;
//        }

        final private String testName;

    }
}
