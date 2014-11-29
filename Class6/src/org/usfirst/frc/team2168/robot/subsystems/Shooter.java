package org.usfirst.frc.team2168.robot.subsystems;

import org.usfirst.frc.team2168.robot.RobotMap;
import org.usfirst.frc.team2168.robot.commands.shooter.DriveShooterWithJoysticks;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	//member variables
	Victor fwdMotor;
	Victor aftMotor;
	
    // constructors
	public Shooter(){
		fwdMotor = new Victor(RobotMap.aftShooterWheel);
		aftMotor = new Victor(RobotMap.fwdShooterWheel);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveShooterWithJoysticks());
    }
    
    public void DriveForwardWheel(double speed){
    	
    	fwdMotor.set(speed);
    	
    }
    
    public void DriveAftWheel(double speed){
    	aftMotor.set(speed);
    }
    
    public void driveShooter(double speed){
    	DriveForwardWheel(speed);
    	DriveAftWheel(speed);
    }
    
    
}

