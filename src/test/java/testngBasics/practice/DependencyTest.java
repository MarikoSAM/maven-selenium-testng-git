package testngBasics.practice;

import org.testng.annotations.Test;

public class DependencyTest {
    @Test(priority = 0)
    public void addUser(){
        System.out.println("Adding user to list.");
        //Assert.fail("Adding a user failed...");
    }

    @Test(priority = 1, dependsOnMethods = "addUser")
    public void modifyUser(){
        System.out.println("Modify existing user test.");
    }


    @Test(priority = 2, dependsOnMethods = "addUser")
    public void deleteUser(){
        System.out.println("Delete existing user from the list.");
    }

}
//We also can add a dependancy on a test to a different method
//The logic is going to be that if before we
//runa
//test (modify user) we need to make sure that
//another previous test was successful(add user). If the first test faile the dependant one will ignored,
//be
//otherwise it will run.
