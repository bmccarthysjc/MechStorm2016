package org.usfirst.frc4456.mechstorm2016.commands;

import org.usfirst.frc4456.mechstorm2016.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autothroughdefense extends Command {

	boolean endCommand = false;
    public autothroughdefense() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Timer timer = new Timer();
    	//timer.start();
    	
    	//get to low bar and lower arm
    	/*
    	while(!timer.hasPeriodPassed(5)){
    		Robot.aim.shooterForward();
    	}
    	Robot.aim.stopaim();
    	timer.stop();
		timer.reset();
		*/
    	////////////////////////////
    	Timer timer = new Timer();
    	timer.start();
    	
    	//get to low bar and lower arm
    	while(!timer.hasPeriodPassed(2)){
    		Robot.drive.setspeed(1);
    	}
    	Robot.drive.setspeed(0);
    	timer.stop();
		timer.reset();
		
		endCommand = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(endCommand == true){
    		return true;
    	}
    	else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
