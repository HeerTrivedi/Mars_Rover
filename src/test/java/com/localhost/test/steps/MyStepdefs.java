package com.localhost.test.steps;

import com.localhost.marsrover.pages.MarsRoverPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^a rover positioned at <x>, <y> facing <facing>$")
    public void aRoverPositionedAtXYFacingFacing(int x,int y,int N) {

        new MarsRoverPage().setPosition(x ,y, N);


    }

    @When("^the rover receives the command <command>$")
    public void theRoverReceivesTheCommandCommand(String command) {
        new MarsRoverPage().process(command);

    }

    @Then("^the rover's final position should be <finalX>, <finalY> facing <finalFacing>$")
    public void theRoverSFinalPositionShouldBeFinalXFinalYFacingFinalFacing(){
        new MarsRoverPage().printPosition(); // prints 5 1 E
    }


}
