// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4456.mechstorm2016.subsystems;

import org.usfirst.frc4456.mechstorm2016.RobotMap;
import org.usfirst.frc4456.mechstorm2016.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Aim extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon scissorLift = RobotMap.aimscissorLift;
    Joystick joy1 = new Joystick(1);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void shooterForward() {
    	//double axis5 = joy1.getRawAxis(5);
    	//scissorLift.setVoltageRampRate(8);
    	scissorLift.set(-1.0);
    }
    public void shooterReverse() {
    	//double axis5 = joy1.getRawAxis(5);
    	//scissorLift.setVoltageRampRate(8);
    	scissorLift.set(1.0);
    }
    public void stopaim() {
    	scissorLift.set(0);
    }

	public double getbucketposition() {
		// TODO Auto-generated method stub
		return RobotMap.aimscissorLift.get();
	}
	public boolean getlimitswitchBottom()	{
		return RobotMap.limitswitch1.get();
	}
	public boolean getlimitswitchTop()	{
		return RobotMap.limitswitch2.get();
	}
}




