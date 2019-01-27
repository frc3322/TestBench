/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Testing;

/**
 * Add your docs here.
 */
public class ToggleSolenoid extends Command{

    public ToggleSolenoid() {
        requires(Robot.testing);
    }

    @Override
    protected void execute() {
        Robot.testing.toggleTestingSolenoid();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
