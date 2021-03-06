package org.usfirst.frc.team2168.robot.commands.shooter;

import org.usfirst.frc.team2168.robot.OI;
import org.usfirst.frc.team2168.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveShooterWithJoysticks extends Command {

    public DriveShooterWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//run the shooters wheels with the joysticks
    	Robot.shooter.driveShooter(OI.operator.getRawAxis(2));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
